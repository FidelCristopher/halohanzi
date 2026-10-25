package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Close
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
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun LessonExerciseScreen(
    lesson: Lesson,
    ttsManager: TtsManager?,
    onFinish: () -> Unit,
    onBackClick: () -> Unit
) {
    var currentStep by remember { mutableStateOf(0) }
    var currentExerciseIdx by remember { mutableStateOf(0) }
    var selectedOption by remember { mutableStateOf<String?>(null) }
    var selectedChips by remember { mutableStateOf<List<String>>(emptyList()) }
    var isSubmitted by remember { mutableStateOf(false) }
    var isCorrect by remember { mutableStateOf(false) }

    val totalSteps = lesson.exercises.size + 1
    val progress = (currentStep.toFloat() / totalSteps.toFloat()).coerceIn(0f, 1f)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = lesson.title,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = HanziColor
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        LinearProgressIndicator(
                            progress = { progress },
                            modifier = Modifier
                                .fillMaxWidth(0.9f)
                                .height(6.dp)
                                .clip(RoundedCornerShape(3.dp)),
                            color = HelloGreen,
                            trackColor = LightSlate,
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = "Close")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.surface)
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (currentStep == 0) {
                // STEP 1: GRAMMAR & NEW VOCABULARY OVERVIEW
                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = HelloMint),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "Grammar Note",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = HelloGreenDark
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = lesson.grammarNote,
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            color = DeepNavy
                        )
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                Text(
                    text = "New Vocabulary in this Lesson:",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepNavy,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(10.dp))

                lesson.newWords.forEach { word ->
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.Bottom) {
                                    Text(
                                        text = word.hanzi,
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = HanziColor
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = word.pinyin,
                                        fontSize = 14.sp,
                                        color = HelloGreenDark,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = word.translation,
                                    fontSize = 13.sp,
                                    color = SlateGray
                                )
                            }

                            FilledTonalIconButton(
                                onClick = { ttsManager?.speak(word.hanzi) },
                                colors = IconButtonDefaults.filledTonalIconButtonColors(
                                    containerColor = HelloMint,
                                    contentColor = HelloGreenDark
                                )
                            ) {
                                Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = "Pronounce")
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {
                        currentStep = 1
                        currentExerciseIdx = 0
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = HelloGreen)
                ) {
                    Text(
                        text = "Start Interactive Practice →",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

            } else {
                // STEP 2: INTERACTIVE EXERCISES
                val exercise = lesson.exercises[currentExerciseIdx]

                Surface(
                    color = LightSlate,
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = when (exercise.type) {
                            ExerciseType.SENTENCE_BUILDER -> "Sentence Builder"
                            ExerciseType.LISTENING -> "Listening Practice"
                            ExerciseType.MULTIPLE_CHOICE -> "Multiple Choice"
                        },
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = SlateGray,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = exercise.prompt,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepNavy,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(12.dp))

                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = HelloMint),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = exercise.targetHanzi,
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = HanziColor
                            )
                            if (exercise.targetPinyin.isNotBlank()) {
                                Text(
                                    text = exercise.targetPinyin,
                                    fontSize = 15.sp,
                                    color = HelloGreenDark,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                            Text(
                                text = exercise.targetTranslation,
                                fontSize = 13.sp,
                                color = SlateGray
                            )
                        }

                        if (exercise.audioToSpeak.isNotBlank()) {
                            FloatingActionButton(
                                onClick = { ttsManager?.speak(exercise.audioToSpeak) },
                                containerColor = HelloGreen,
                                contentColor = Color.White,
                                shape = CircleShape,
                                modifier = Modifier.size(46.dp)
                            ) {
                                Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = "Listen Audio")
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                when (exercise.type) {
                    ExerciseType.SENTENCE_BUILDER -> {
                        // Target sentence slot line (HelloChinese style)
                        Text(
                            text = "Tap the tiles below to build the sentence:",
                            fontSize = 13.sp,
                            color = SlateGray,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = MaterialTheme.colorScheme.surface,
                            border = androidx.compose.foundation.BorderStroke(1.5.dp, BorderGray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(min = 72.dp)
                                .padding(vertical = 4.dp)
                        ) {
                            FlowRow(
                                modifier = Modifier.padding(10.dp),
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                if (selectedChips.isEmpty()) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = "Tap word cards to place them here...",
                                            color = SlateGray,
                                            fontSize = 13.sp
                                        )
                                    }
                                } else {
                                    selectedChips.forEachIndexed { cIdx, chipText ->
                                        val token = LearningRepository.findToken(chipText)
                                        // Placed tile
                                        Surface(
                                            shape = RoundedCornerShape(10.dp),
                                            color = HelloMint,
                                            border = androidx.compose.foundation.BorderStroke(1.dp, HelloGreen),
                                            modifier = Modifier.clickable {
                                                if (!isSubmitted) {
                                                    selectedChips = selectedChips.toMutableList().also { it.removeAt(cIdx) }
                                                }
                                            }
                                        ) {
                                            Column(
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                                            ) {
                                                if (token.pinyin.isNotBlank()) {
                                                    Text(text = token.pinyin, fontSize = 11.sp, color = HelloGreenDark)
                                                }
                                                Text(text = chipText, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = DeepNavy)
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        // Available word cards with Pinyin above Hanzi (Screenshot 2)
                        FlowRow(
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            exercise.wordChips.forEach { chip ->
                                val countInSelected = selectedChips.count { it == chip }
                                val countInAvailable = exercise.wordChips.count { it == chip }
                                val isAvailable = countInSelected < countInAvailable
                                val token = LearningRepository.findToken(chip)

                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = if (isAvailable) MaterialTheme.colorScheme.surface else LightSlate,
                                    shadowElevation = if (isAvailable) 2.dp else 0.dp,
                                    border = androidx.compose.foundation.BorderStroke(1.dp, if (isAvailable) BorderGray else Color.Transparent),
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(12.dp))
                                        .clickable(enabled = isAvailable && !isSubmitted) {
                                            selectedChips = selectedChips + chip
                                            ttsManager?.speak(chip)
                                        }
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp)
                                    ) {
                                        if (token.pinyin.isNotBlank()) {
                                            Text(
                                                text = token.pinyin,
                                                fontSize = 11.sp,
                                                color = if (isAvailable) HelloGreenDark else Color.LightGray
                                            )
                                        }
                                        Text(
                                            text = chip,
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = if (isAvailable) HanziColor else Color.LightGray
                                        )
                                    }
                                }
                            }
                        }
                    }

                    ExerciseType.MULTIPLE_CHOICE, ExerciseType.LISTENING -> {
                        exercise.options.forEach { opt ->
                            val isSelected = selectedOption == opt
                            val isThisCorrect = opt == exercise.correctAnswer

                            val optBg = when {
                                !isSubmitted && isSelected -> HelloMint
                                isSubmitted && isThisCorrect -> Color(0xFFD4EDDA)
                                isSubmitted && isSelected && !isThisCorrect -> Color(0xFFF8D7DA)
                                else -> MaterialTheme.colorScheme.surface
                            }

                            Surface(
                                shape = RoundedCornerShape(14.dp),
                                color = optBg,
                                tonalElevation = 1.dp,
                                border = androidx.compose.foundation.BorderStroke(1.dp, if (isSelected) HelloGreen else BorderGray),
                                onClick = {
                                    if (!isSubmitted) {
                                        selectedOption = opt
                                    }
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 5.dp)
                            ) {
                                Row(
                                    modifier = Modifier.padding(16.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(
                                        selected = isSelected,
                                        onClick = {
                                            if (!isSubmitted) {
                                                selectedOption = opt
                                            }
                                        },
                                        colors = RadioButtonDefaults.colors(selectedColor = HelloGreen)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = opt,
                                        fontSize = 16.sp,
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                        color = DeepNavy
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                if (!isSubmitted) {
                    val canCheck = when (exercise.type) {
                        ExerciseType.SENTENCE_BUILDER -> selectedChips.isNotEmpty()
                        else -> selectedOption != null
                    }

                    Button(
                        onClick = {
                            isSubmitted = true
                            isCorrect = when (exercise.type) {
                                ExerciseType.SENTENCE_BUILDER -> {
                                    selectedChips.joinToString(",") == exercise.correctAnswer
                                }
                                else -> selectedOption == exercise.correctAnswer
                            }
                        },
                        enabled = canCheck,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = HelloGreen)
                    ) {
                        Text(text = "Check Answer", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                } else {
                    Surface(
                        color = if (isCorrect) Color(0xFFD4EDDA) else Color(0xFFF8D7DA),
                        shape = RoundedCornerShape(14.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 12.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    text = if (isCorrect) "Awesome! That is correct." else "Review Answer:",
                                    fontWeight = FontWeight.Bold,
                                    color = if (isCorrect) HelloGreenDark else RubyCoral,
                                    fontSize = 14.sp
                                )
                                Text(
                                    text = "Target: ${exercise.correctAnswer.replace(",", " ")}",
                                    fontSize = 13.sp,
                                    color = DeepNavy
                                )
                            }
                        }
                    }

                    Button(
                        onClick = {
                            if (currentExerciseIdx < lesson.exercises.lastIndex) {
                                currentExerciseIdx++
                                currentStep++
                                selectedOption = null
                                selectedChips = emptyList()
                                isSubmitted = false
                                isCorrect = false
                            } else {
                                onFinish()
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isCorrect) HelloGreen else WarmAmber
                        )
                    ) {
                        Text(
                            text = if (currentExerciseIdx < lesson.exercises.lastIndex) "Next Question →" else "Complete Lesson",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}
