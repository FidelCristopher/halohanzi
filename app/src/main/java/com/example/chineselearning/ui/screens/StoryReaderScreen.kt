package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.WordToken
import com.example.chineselearning.ui.components.KaraokeSentenceCard
import com.example.chineselearning.ui.components.WordDetailDialog
import com.example.chineselearning.ui.theme.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoryReaderScreen(
    story: Story,
    ttsManager: TtsManager?,
    onBackClick: () -> Unit
) {
    var showPinyin by remember { mutableStateOf(true) }
    var showTranslation by remember { mutableStateOf(true) }
    var selectedToken by remember { mutableStateOf<WordToken?>(null) }

    // Audio Karaoke State
    var activeSentenceIndex by remember { mutableStateOf(-1) }
    var isPlayingAll by remember { mutableStateOf(false) }
    var isLooping by remember { mutableStateOf(false) }
    var speedIndex by remember { mutableStateOf(1) } // 0 = 0.7x, 1 = 1.0x, 2 = 1.2x
    val speedValues = listOf(0.75f, 0.95f, 1.2f)
    val speedLabels = listOf("0.8X", "1.0X", "1.2X")

    // Comprehension Quiz State
    var showQuiz by remember { mutableStateOf(false) }
    var currentQuestionIdx by remember { mutableStateOf(0) }
    var selectedOptionIdx by remember { mutableStateOf<Int?>(null) }
    var isAnswerSubmitted by remember { mutableStateOf(false) }
    var quizScore by remember { mutableStateOf(0) }

    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    val currentSpeed = speedValues[speedIndex]

    fun playSentence(index: Int, autoAdvance: Boolean = false) {
        if (index !in story.sentences.indices) {
            if (isLooping && story.sentences.isNotEmpty()) {
                playSentence(0, autoAdvance = true)
            } else {
                isPlayingAll = false
                activeSentenceIndex = -1
            }
            return
        }

        activeSentenceIndex = index
        val targetSentence = story.sentences[index]

        coroutineScope.launch {
            listState.animateScrollToItem(index + 1)
        }

        ttsManager?.speak(
            text = targetSentence.hanzi,
            speedRate = currentSpeed,
            onDone = {
                if (autoAdvance && isPlayingAll) {
                    coroutineScope.launch {
                        delay(500)
                        playSentence(index + 1, autoAdvance = true)
                    }
                } else if (!autoAdvance) {
                    activeSentenceIndex = -1
                }
            }
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = story.titleHanzi,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = HanziColor
                        )
                        Text(
                            text = story.titleTranslation,
                            fontSize = 12.sp,
                            color = SlateGray
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {
                        ttsManager?.stop()
                        onBackClick()
                    }) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    FilterChip(
                        selected = showPinyin,
                        onClick = { showPinyin = !showPinyin },
                        label = {
                            Text(
                                text = if (showPinyin) "拼 Pinyin" else "汉 Hanzi",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold
                            )
                        },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = HelloMint,
                            selectedLabelColor = HelloGreenDark
                        ),
                        modifier = Modifier.padding(end = 4.dp)
                    )

                    IconButton(onClick = { showTranslation = !showTranslation }) {
                        Icon(
                            imageVector = if (showTranslation) Icons.Default.Translate else Icons.Default.GTranslate,
                            contentDescription = "Toggle Translation",
                            tint = if (showTranslation) HelloGreen else SlateGray
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.surface)
            )
        },
        bottomBar = {
            // HelloChinese Style Audio Player Dock (Screenshot 3)
            Surface(
                color = MaterialTheme.colorScheme.surface,
                tonalElevation = 10.dp,
                shadowElevation = 10.dp
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .navigationBarsPadding()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    // Time Scrubber / Progress Slider Bar (00:00 -------•------- 02:30)
                    val currentSentenceNum = if (activeSentenceIndex >= 0) activeSentenceIndex + 1 else 0
                    val totalSentences = story.sentences.size
                    val sliderProgress = if (totalSentences > 0) (currentSentenceNum.toFloat() / totalSentences.toFloat()) else 0f

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = if (activeSentenceIndex >= 0) "Part $currentSentenceNum" else "00:00",
                            fontSize = 11.sp,
                            color = SlateGray,
                            fontWeight = FontWeight.Medium
                        )

                        Slider(
                            value = sliderProgress,
                            onValueChange = { newProg ->
                                val targetIdx = (newProg * (totalSentences - 1)).toInt().coerceIn(0, totalSentences - 1)
                                playSentence(targetIdx, autoAdvance = isPlayingAll)
                            },
                            modifier = Modifier
                                .weight(1f)
                                .padding(horizontal = 10.dp)
                                .height(20.dp),
                            colors = SliderDefaults.colors(
                                thumbColor = HelloGreen,
                                activeTrackColor = HelloGreen,
                                inactiveTrackColor = LightSlate
                            )
                        )

                        Text(
                            text = "$totalSentences Parts",
                            fontSize = 11.sp,
                            color = SlateGray,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    // Player Buttons Row (Loop, Prev, Play/Pause, Next, Speed)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Loop toggle
                        IconButton(onClick = { isLooping = !isLooping }) {
                            Icon(
                                imageVector = Icons.Default.Repeat,
                                contentDescription = "Loop",
                                tint = if (isLooping) HelloGreen else SlateGray
                            )
                        }

                        // Prev sentence
                        IconButton(
                            onClick = {
                                val prevIdx = if (activeSentenceIndex > 0) activeSentenceIndex - 1 else 0
                                playSentence(prevIdx, autoAdvance = isPlayingAll)
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.SkipPrevious,
                                contentDescription = "Previous",
                                modifier = Modifier.size(28.dp),
                                tint = DeepNavy
                            )
                        }

                        // Main Big Play/Pause Button
                        FloatingActionButton(
                            onClick = {
                                if (isPlayingAll) {
                                    isPlayingAll = false
                                    ttsManager?.stop()
                                    activeSentenceIndex = -1
                                } else {
                                    isPlayingAll = true
                                    val startIdx = if (activeSentenceIndex >= 0) activeSentenceIndex else 0
                                    playSentence(startIdx, autoAdvance = true)
                                }
                            },
                            containerColor = HelloGreen,
                            contentColor = Color.White,
                            shape = CircleShape,
                            modifier = Modifier.size(54.dp)
                        ) {
                            Icon(
                                imageVector = if (isPlayingAll) Icons.Default.Pause else Icons.Default.PlayArrow,
                                contentDescription = if (isPlayingAll) "Pause" else "Play",
                                modifier = Modifier.size(32.dp)
                            )
                        }

                        // Next sentence
                        IconButton(
                            onClick = {
                                val nextIdx = if (activeSentenceIndex < story.sentences.lastIndex) activeSentenceIndex + 1 else 0
                                playSentence(nextIdx, autoAdvance = isPlayingAll)
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.SkipNext,
                                contentDescription = "Next",
                                modifier = Modifier.size(28.dp),
                                tint = DeepNavy
                            )
                        }

                        // Speed Button (1.0X pill)
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = LightSlate,
                            onClick = {
                                speedIndex = (speedIndex + 1) % speedValues.size
                            }
                        ) {
                            Text(
                                text = speedLabels[speedIndex],
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = HelloGreenDark,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp)
                            )
                        }
                    }
                }
            }
        }
    ) { innerPadding ->
        LazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 16.dp),
            contentPadding = PaddingValues(top = 10.dp, bottom = 40.dp)
        ) {
            // Story Header Card
            item {
                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Surface(
                                color = HelloMint,
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Text(
                                    text = story.level,
                                    color = HelloGreenDark,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "${story.estimatedReadMinutes} min read • ${story.category}",
                                fontSize = 12.sp,
                                color = SlateGray
                            )
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = story.description,
                            fontSize = 13.sp,
                            color = DeepNavy,
                            lineHeight = 18.sp
                        )
                    }
                }
            }

            // Sentences List with HelloChinese Green Karaoke Highlight
            itemsIndexed(story.sentences) { index, sentence ->
                KaraokeSentenceCard(
                    sentence = sentence,
                    index = index,
                    isActive = index == activeSentenceIndex,
                    showPinyin = showPinyin,
                    showTranslation = showTranslation,
                    onPlayAudio = {
                        playSentence(index, autoAdvance = false)
                    },
                    onTokenClick = { token ->
                        selectedToken = token
                    }
                )
            }

            // Comprehension Quiz
            item {
                Spacer(modifier = Modifier.height(24.dp))
                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(18.dp)
                    ) {
                        Text(
                            text = "Story Comprehension Quiz",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = DeepNavy
                        )
                        Text(
                            text = "Test your understanding of the story above",
                            fontSize = 12.sp,
                            color = SlateGray
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        if (!showQuiz) {
                            Button(
                                onClick = { showQuiz = true },
                                colors = ButtonDefaults.buttonColors(containerColor = WarmAmber),
                                shape = RoundedCornerShape(14.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "Start Quiz (${story.questions.size} Questions)",
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        } else {
                            val question = story.questions[currentQuestionIdx]

                            Text(
                                text = "Question ${currentQuestionIdx + 1} of ${story.questions.size}:",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = SlateGray
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = question.questionText,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = DeepNavy
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            question.options.forEachIndexed { oIdx, optText ->
                                val isSelected = selectedOptionIdx == oIdx
                                val isCorrect = oIdx == question.correctAnswerIndex

                                val optionColor = when {
                                    !isAnswerSubmitted && isSelected -> HelloMint
                                    isAnswerSubmitted && isCorrect -> Color(0xFFD4EDDA)
                                    isAnswerSubmitted && isSelected && !isCorrect -> Color(0xFFF8D7DA)
                                    else -> LightSlate
                                }

                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = optionColor,
                                    onClick = {
                                        if (!isAnswerSubmitted) {
                                            selectedOptionIdx = oIdx
                                        }
                                    },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 4.dp)
                                ) {
                                    Row(
                                        modifier = Modifier.padding(12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "${('A' + oIdx)}. $optText",
                                            fontSize = 14.sp,
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                            color = DeepNavy
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            if (!isAnswerSubmitted) {
                                Button(
                                    onClick = {
                                        if (selectedOptionIdx != null) {
                                            isAnswerSubmitted = true
                                            if (selectedOptionIdx == question.correctAnswerIndex) {
                                                quizScore++
                                            }
                                        }
                                    },
                                    enabled = selectedOptionIdx != null,
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Text(text = "Check Answer")
                                }
                            } else {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(10.dp))
                                        .background(LightSlate)
                                        .padding(10.dp)
                                ) {
                                    val correct = selectedOptionIdx == question.correctAnswerIndex
                                    Text(
                                        text = if (correct) "Correct!" else "Explanation:",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 13.sp,
                                        color = if (correct) HelloGreenDark else RubyCoral
                                    )
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text(
                                        text = question.explanation,
                                        fontSize = 12.sp,
                                        color = SlateGray
                                    )
                                }

                                Spacer(modifier = Modifier.height(10.dp))

                                Button(
                                    onClick = {
                                        if (currentQuestionIdx < story.questions.lastIndex) {
                                            currentQuestionIdx++
                                            selectedOptionIdx = null
                                            isAnswerSubmitted = false
                                        } else {
                                            currentQuestionIdx = 0
                                            selectedOptionIdx = null
                                            isAnswerSubmitted = false
                                            showQuiz = false
                                        }
                                    },
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(12.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = HelloGreen)
                                ) {
                                    Text(
                                        text = if (currentQuestionIdx < story.questions.lastIndex) "Next Question →" else "Complete (Score: $quizScore/${story.questions.size})"
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    WordDetailDialog(
        token = selectedToken,
        ttsManager = ttsManager,
        onDismiss = { selectedToken = null }
    )
}
