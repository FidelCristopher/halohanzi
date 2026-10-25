package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
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
    
    // Status Audio Karaoke
    var activeSentenceIndex by remember { mutableStateOf(-1) }
    var isPlayingAll by remember { mutableStateOf(false) }
    var speechSpeed by remember { mutableStateOf(0.85f) }

    // Kuis pemahaman cerita
    var showQuiz by remember { mutableStateOf(false) }
    var currentQuestionIdx by remember { mutableStateOf(0) }
    var selectedOptionIdx by remember { mutableStateOf<Int?>(null) }
    var isAnswerSubmitted by remember { mutableStateOf(false) }
    var quizScore by remember { mutableStateOf(0) }

    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    // Fungsi membaca satu kalimat tertentu
    fun playSentence(index: Int, autoAdvance: Boolean = false) {
        if (index !in story.sentences.indices) {
            isPlayingAll = false
            activeSentenceIndex = -1
            return
        }

        activeSentenceIndex = index
        val targetSentence = story.sentences[index]

        coroutineScope.launch {
            // Scroll otomatis ke kalimat yang dibaca
            listState.animateScrollToItem(index + 1)
        }

        ttsManager?.speak(
            text = targetSentence.hanzi,
            speedRate = speechSpeed,
            onDone = {
                if (autoAdvance && isPlayingAll) {
                    coroutineScope.launch {
                        delay(600) // jeda napas alami antar kalimat
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
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Kembali")
                    }
                },
                actions = {
                    // Tombol Toggle Pinyin
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
                            selectedContainerColor = SoftMint,
                            selectedLabelColor = DarkJade
                        ),
                        modifier = Modifier.padding(end = 6.dp)
                    )

                    // Tombol Toggle Arti
                    IconButton(onClick = { showTranslation = !showTranslation }) {
                        Icon(
                            imageVector = if (showTranslation) Icons.Default.Translate else Icons.Default.GTranslate,
                            contentDescription = "Toggle Terjemahan",
                            tint = if (showTranslation) JadeGreen else SlateGray
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.surface)
            )
        },
        bottomBar = {
            // Floating Audio & Reading Bar
            Surface(
                color = MaterialTheme.colorScheme.surface,
                tonalElevation = 8.dp,
                shadowElevation = 8.dp
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Kontrol Kecepatan Suara
                    Surface(
                        color = LightSlate,
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(modifier = Modifier.padding(2.dp)) {
                            listOf(0.7f to "Lambat", 0.85f to "Normal").forEach { (speed, label) ->
                                val selected = speechSpeed == speed
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(10.dp))
                                        .background(if (selected) JadeGreen else Color.Transparent)
                                        .padding(horizontal = 10.dp, vertical = 6.dp)
                                ) {
                                    Text(
                                        text = label,
                                        fontSize = 11.sp,
                                        fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,
                                        color = if (selected) Color.White else SlateGray
                                    )
                                }
                            }
                        }
                    }

                    // Kontrol Pemutar Narasi (Prev, Play/Pause, Next)
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        IconButton(
                            onClick = {
                                val prevIdx = if (activeSentenceIndex > 0) activeSentenceIndex - 1 else 0
                                playSentence(prevIdx, autoAdvance = isPlayingAll)
                            }
                        ) {
                            Icon(imageVector = Icons.Default.SkipPrevious, contentDescription = "Sebelumnya")
                        }

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
                            containerColor = JadeGreen,
                            contentColor = Color.White,
                            shape = CircleShape,
                            modifier = Modifier.size(52.dp)
                        ) {
                            Icon(
                                imageVector = if (isPlayingAll) Icons.Default.Pause else Icons.Default.PlayArrow,
                                contentDescription = if (isPlayingAll) "Jeda" else "Baca Cerita",
                                modifier = Modifier.size(28.dp)
                            )
                        }

                        IconButton(
                            onClick = {
                                val nextIdx = if (activeSentenceIndex < story.sentences.lastIndex) activeSentenceIndex + 1 else 0
                                playSentence(nextIdx, autoAdvance = isPlayingAll)
                            }
                        ) {
                            Icon(imageVector = Icons.Default.SkipNext, contentDescription = "Berikutnya")
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
            contentPadding = PaddingValues(top = 12.dp, bottom = 40.dp)
        ) {
            // Header Cerita
            item {
                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = SoftMint),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 14.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = story.coverEmoji,
                            fontSize = 40.sp,
                            modifier = Modifier.padding(end = 14.dp)
                        )
                        Column(modifier = Modifier.weight(1f)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Surface(
                                    color = JadeGreen,
                                    shape = RoundedCornerShape(8.dp)
                                ) {
                                    Text(
                                        text = story.level,
                                        color = Color.White,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "⏱️ ${story.estimatedReadMinutes} menit baca",
                                    fontSize = 12.sp,
                                    color = DarkJade
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = story.description,
                                fontSize = 13.sp,
                                color = DeepNavy,
                                lineHeight = 18.sp
                            )
                        }
                    }
                }

                // Petunjuk Interaktif
                Surface(
                    color = SoftAmber,
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "💡", fontSize = 16.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Ketuk karakter/kata Hanzi manapun untuk melihat arti instan & dengar pelafalannya!",
                            fontSize = 12.sp,
                            color = Color(0xFF7A4B00)
                        )
                    }
                }
            }

            // Daftar Kalimat dengan fitur karaoke sync dan kata klik-able
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

            // Bagian Kuis Pemahaman di Akhir Cerita
            item {
                Spacer(modifier = Modifier.height(20.dp))
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
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "📝", fontSize = 24.sp)
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "Kuis Pemahaman Cerita",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp,
                                    color = DeepNavy
                                )
                                Text(
                                    text = "Uji pemahaman Anda terhadap isi bacaan di atas",
                                    fontSize = 12.sp,
                                    color = SlateGray
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        if (!showQuiz) {
                            Button(
                                onClick = { showQuiz = true },
                                colors = ButtonDefaults.buttonColors(containerColor = WarmAmber),
                                shape = RoundedCornerShape(14.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "Mulai Kuis (${story.questions.size} Soal)",
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        } else {
                            // Quiz Container
                            val question = story.questions[currentQuestionIdx]

                            Text(
                                text = "Soal ${currentQuestionIdx + 1} dari ${story.questions.size}:",
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

                            // Pilihan Jawaban
                            question.options.forEachIndexed { oIdx, optText ->
                                val isSelected = selectedOptionIdx == oIdx
                                val isCorrect = oIdx == question.correctAnswerIndex

                                val optionColor = when {
                                    !isAnswerSubmitted && isSelected -> SoftMint
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
                                    Text(text = "Periksa Jawaban")
                                }
                            } else {
                                // Penjelasan Soal
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(10.dp))
                                        .background(LightSlate)
                                        .padding(10.dp)
                                ) {
                                    val correct = selectedOptionIdx == question.correctAnswerIndex
                                    Text(
                                        text = if (correct) "✅ Jawaban Anda Benar!" else "❌ Jawaban Belum Tepat",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 13.sp,
                                        color = if (correct) DarkJade else RubyCoral
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
                                            // Kuis Selesai
                                            currentQuestionIdx = 0
                                            selectedOptionIdx = null
                                            isAnswerSubmitted = false
                                            showQuiz = false
                                        }
                                    },
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(12.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = JadeGreen)
                                ) {
                                    Text(
                                        text = if (currentQuestionIdx < story.questions.lastIndex) "Soal Berikutnya →" else "Selesai (Skor: $quizScore/${story.questions.size})"
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Modal Dialog Detail Kata (Tap-to-Translate)
    WordDetailDialog(
        token = selectedToken,
        ttsManager = ttsManager,
        onDismiss = { selectedToken = null }
    )
}
