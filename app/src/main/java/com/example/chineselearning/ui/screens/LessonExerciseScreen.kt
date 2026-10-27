package com.example.chineselearning.ui.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.*
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
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.data.model.PictureOption
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.components.bouncyClick
import com.example.chineselearning.ui.components.shake
import com.example.chineselearning.ui.theme.*

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun LessonExerciseScreen(
    lesson: Lesson,
    partNumber: Int = 1,
    ttsManager: TtsManager?,
    onFinish: () -> Unit,
    onBackClick: () -> Unit
) {
    val exercisesList = remember(lesson, partNumber) { lesson.getExercisesForPart(partNumber) }
    var currentExerciseIdx by remember { mutableStateOf(0) }
    val totalExercises = exercisesList.size
    val isLastExercise = currentExerciseIdx >= totalExercises - 1

    // State per exercise
    var selectedOption by remember { mutableStateOf<String?>(null) }
    var selectedPictureId by remember { mutableStateOf<String?>(null) }
    var selectedChips by remember { mutableStateOf<List<String>>(emptyList()) }

    // State for Match Pairs
    var selectedLeftPairId by remember { mutableStateOf<String?>(null) }
    var selectedRightPairId by remember { mutableStateOf<String?>(null) }
    var matchedPairIds by remember { mutableStateOf<Set<String>>(emptySet()) }
    var shuffledRightPairs by remember(currentExerciseIdx) {
        val currEx = exercisesList.getOrNull(currentExerciseIdx)
        mutableStateOf(currEx?.matchPairs?.shuffled() ?: emptyList())
    }

    // Submission and Feedback state
    var isSubmitted by remember { mutableStateOf(false) }
    var isCorrect by remember { mutableStateOf(false) }
    var comboCount by remember { mutableStateOf(0) }
    var isLessonCompleted by remember { mutableStateOf(false) }

    val exercise = exercisesList.getOrNull(currentExerciseIdx)

    // Check if user has selected an answer to enable "PERIKSA"
    val canCheck = when (exercise?.type) {
        ExerciseType.PICTURE_CHOICE -> selectedPictureId != null
        ExerciseType.FILL_BLANK -> selectedOption != null
        ExerciseType.SENTENCE_CHOICE -> selectedOption != null
        ExerciseType.SENTENCE_BUILDER -> selectedChips.isNotEmpty()
        ExerciseType.MATCH_PAIRS -> matchedPairIds.size == (exercise.matchPairs.size)
        null -> false
    }

    fun submitAnswer() {
        if (!canCheck || isSubmitted || exercise == null) return
        isSubmitted = true
        isCorrect = when (exercise.type) {
            ExerciseType.PICTURE_CHOICE -> {
                val opt = exercise.pictureOptions.find { it.id == selectedPictureId }
                opt?.isCorrect == true
            }
            ExerciseType.FILL_BLANK -> selectedOption == exercise.correctAnswer
            ExerciseType.SENTENCE_CHOICE -> selectedOption == exercise.correctAnswer
            ExerciseType.SENTENCE_BUILDER -> selectedChips.joinToString(",") == exercise.correctAnswer
            ExerciseType.MATCH_PAIRS -> matchedPairIds.size == exercise.matchPairs.size
        }

        if (isCorrect) {
            comboCount++
            if (exercise.audioToSpeak.isNotBlank()) {
                ttsManager?.speak(exercise.audioToSpeak)
            }
        } else {
            comboCount = 0
        }
    }

    fun nextExercise() {
        if (isLastExercise) {
            isLessonCompleted = true
        } else {
            currentExerciseIdx++
            selectedOption = null
            selectedPictureId = null
            selectedChips = emptyList()
            selectedLeftPairId = null
            selectedRightPairId = null
            matchedPairIds = emptySet()
            isSubmitted = false
            isCorrect = false
        }
    }

    // CELEBRATION SCREEN (Screenshot 13)
    if (isLessonCompleted) {
        LessonCelebrationScreen(
            comboCount = comboCount,
            onContinue = onFinish
        )
        return
    }

    if (exercise == null) {
        onFinish()
        return
    }

    // Animated smooth progress bar
    val animatedProgress by animateFloatAsState(
        targetValue = ((currentExerciseIdx + 1).toFloat() / totalExercises.toFloat()).coerceIn(0f, 1f),
        animationSpec = tween(durationMillis = 350, easing = FastOutSlowInEasing),
        label = "progressBar"
    )

    // Pop scale animation for checkmark on correct answer
    val checkmarkScale by animateFloatAsState(
        targetValue = if (isSubmitted && isCorrect) 1.15f else 0.8f,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = Spring.StiffnessLow),
        label = "checkmarkPop"
    )

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surface)
                    .statusBarsPadding()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                // Top Action Icons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = onBackClick) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = "Tutup", tint = SlateGray)
                    }

                    // Combo / Encouragement Text
                    AnimatedVisibility(
                        visible = true,
                        enter = fadeIn() + scaleIn(),
                        exit = fadeOut()
                    ) {
                        if (comboCount > 1) {
                            Text(
                                text = "Combo x$comboCount!",
                                color = Color(0xFFFF9800),
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic,
                                fontSize = 14.sp
                            )
                        } else {
                            Text(
                                text = "${totalExercises - currentExerciseIdx} soal lagi sempurna!",
                                color = Color(0xFFE91E63),
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            shape = CircleShape,
                            color = Color(0xFF26A69A),
                            modifier = Modifier.size(26.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(text = "“", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                            }
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(imageVector = Icons.Default.Translate, contentDescription = "Terjemahan", tint = Color(0xFF26A69A))
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(imageVector = Icons.Default.MoreHoriz, contentDescription = "Menu", tint = SlateGray)
                    }
                }

                Spacer(modifier = Modifier.height(4.dp))

                // HelloChinese Fire / Comet Progress Bar with Target Bullseye
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(10.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .background(Color(0xFFEEEEEE))
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth(fraction = animatedProgress)
                                .clip(RoundedCornerShape(5.dp))
                                .background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(Color(0xFFFF9800), Color(0xFFFF5722), Color(0xFFFFEB3B))
                                    )
                                )
                        )
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    Text(text = "🎯", fontSize = 18.sp)
                }
            }
        },
        bottomBar = {
            // BOTTOM BAR / FEEDBACK SHEET (Screenshots 3, 5, 8) with SHAKE on error!
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .shake(isSubmitted && !isCorrect) // Shake animation if wrong!
                    .background(
                        when {
                            isSubmitted && isCorrect -> Color(0xFFE6F8F0)
                            isSubmitted && !isCorrect -> Color(0xFFFFEEEE)
                            else -> MaterialTheme.colorScheme.surface
                        }
                    )
                    .navigationBarsPadding()
                    .padding(horizontal = 20.dp, vertical = 14.dp)
            ) {
                if (isSubmitted) {
                    // Result Header (Luar biasa! / Mantap!)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(32.dp)
                                    .graphicsLayer {
                                        scaleX = checkmarkScale
                                        scaleY = checkmarkScale
                                    }
                                    .clip(CircleShape)
                                    .background(if (isCorrect) Color(0xFF00C48C) else RubyCoral),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = if (isCorrect) Icons.Default.Check else Icons.Default.Close,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = if (isCorrect) (if (comboCount > 2) "Mantap!" else "Luar biasa!") else "Belum tepat!",
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (isCorrect) Color(0xFF008966) else RubyCoral
                            )
                        }

                        Row {
                            IconButton(onClick = {}) {
                                Icon(imageVector = Icons.Default.Flag, contentDescription = "Lapor", tint = SlateGray)
                            }
                            if (exercise.audioToSpeak.isNotBlank()) {
                                IconButton(onClick = { ttsManager?.speak(exercise.audioToSpeak) }) {
                                    Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = "Dengar", tint = Color(0xFF00C48C))
                                }
                            }
                        }
                    }

                    // Content Breakdown
                    if (exercise.targetHanzi.isNotBlank()) {
                        Spacer(modifier = Modifier.height(6.dp))
                        if (exercise.targetPinyin.isNotBlank()) {
                            Text(
                                text = exercise.targetPinyin,
                                fontSize = 13.sp,
                                color = SlateGray,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }
                        Text(
                            text = exercise.targetHanzi,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = HanziColor,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                        if (exercise.targetTranslation.isNotBlank()) {
                            Text(
                                text = exercise.targetTranslation,
                                fontSize = 13.sp,
                                color = SlateGray,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Bouncy continue button
                    Surface(
                        shape = RoundedCornerShape(26.dp),
                        color = if (isCorrect) Color(0xFF00C48C) else RubyCoral,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(52.dp)
                            .bouncyClick { nextExercise() }
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = "LANJUTKAN",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = Color.White
                            )
                        }
                    }
                } else {
                    // Default PERIKSA button with tactile Bouncy click
                    Surface(
                        shape = RoundedCornerShape(26.dp),
                        color = if (canCheck) Color(0xFF00C48C) else Color(0xFFE0E0E0),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(52.dp)
                            .then(
                                if (canCheck) Modifier.bouncyClick { submitAnswer() } else Modifier
                            )
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = "PERIKSA",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = if (canCheck) Color.White else Color(0xFF9E9E9E)
                            )
                        }
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 20.dp, vertical = 10.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Exercise Title
            Text(
                text = exercise.title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = DeepNavy,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(14.dp))

            // EXERCISE TYPE 1: PILIH GAMBAR YANG BENAR (Screenshot 3 & 4)
            if (exercise.type == ExerciseType.PICTURE_CHOICE) {
                // Word prompt with speaker button
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(54.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF00C48C))
                            .bouncyClick { ttsManager?.speak(exercise.audioToSpeak) },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                            contentDescription = "Dengarkan",
                            tint = Color.White,
                            modifier = Modifier.size(28.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    Column {
                        Text(
                            text = exercise.targetPinyin,
                            fontSize = 15.sp,
                            color = SlateGray,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = exercise.targetHanzi,
                            fontSize = 26.sp,
                            fontWeight = FontWeight.Bold,
                            color = HanziColor
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // 2x2 Picture Grid with Bouncy feedback
                Column(
                    verticalArrangement = Arrangement.spacedBy(14.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    val rows = exercise.pictureOptions.chunked(2)
                    rows.forEach { rowOptions ->
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(14.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            rowOptions.forEach { opt ->
                                val isSelected = selectedPictureId == opt.id
                                Card(
                                    shape = RoundedCornerShape(18.dp),
                                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                    elevation = CardDefaults.cardElevation(defaultElevation = if (isSelected) 4.dp else 1.dp),
                                    modifier = Modifier
                                        .weight(1f)
                                        .border(
                                            width = if (isSelected) 3.dp else 1.dp,
                                            color = if (isSelected) Color(0xFF00C48C) else BorderGray,
                                            shape = RoundedCornerShape(18.dp)
                                        )
                                        .bouncyClick {
                                            if (!isSubmitted) {
                                                selectedPictureId = opt.id
                                            }
                                        }
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .height(110.dp)
                                                .background(Color(0xFFE8F5E9)),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(text = opt.emoji, fontSize = 52.sp)
                                        }

                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(vertical = 14.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                text = opt.label,
                                                fontSize = 15.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = if (isSelected) Color(0xFF00C48C) else DeepNavy,
                                                textAlign = TextAlign.Center
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // EXERCISE TYPE 2: LENGKAPI TERJEMAHAN (WhatsApp Image 2026-10-27 at 09.18.52.jpeg)
            if (exercise.type == ExerciseType.FILL_BLANK) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(54.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF00C48C))
                            .bouncyClick { ttsManager?.speak(exercise.audioToSpeak) },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = "Dengarkan", tint = Color.White)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Column {
                        Text(text = exercise.targetPinyin, fontSize = 16.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = exercise.targetHanzi, fontSize = 24.sp, fontWeight = FontWeight.SemiBold, color = HanziColor)
                    }
                }

                Spacer(modifier = Modifier.height(36.dp))

                // Sentence with slot and underline (matching HelloChinese exact design)
                val parts = exercise.sentenceWithBlank.split("________")
                val prefix = parts.getOrNull(0) ?: ""
                val suffix = parts.getOrNull(1) ?: ""

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start
                ) {
                    if (prefix.isNotBlank()) {
                        Text(
                            text = prefix,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Normal,
                            color = DeepNavy,
                            modifier = Modifier.padding(bottom = 6.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                    }

                    // Blank slot with underline
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.width(IntrinsicSize.Min)
                    ) {
                        if (selectedOption != null) {
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = Color.White,
                                shadowElevation = 1.5.dp,
                                border = androidx.compose.foundation.BorderStroke(1.dp, BorderGray),
                                modifier = Modifier
                                    .padding(bottom = 6.dp)
                                    .bouncyClick {
                                        if (!isSubmitted) {
                                            selectedOption = null
                                        }
                                    }
                            ) {
                                Text(
                                    text = selectedOption!!,
                                    fontSize = 19.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = DeepNavy,
                                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                                )
                            }
                        } else {
                            Box(
                                modifier = Modifier
                                    .width(96.dp)
                                    .height(44.dp)
                                    .padding(bottom = 6.dp)
                            )
                        }

                        // Underline indicator
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .defaultMinSize(minWidth = 96.dp)
                                .height(2.dp)
                                .background(Color(0xFF00C48C), shape = RoundedCornerShape(1.dp))
                        )
                    }

                    if (suffix.isNotBlank()) {
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = suffix.trimStart(),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Normal,
                            color = DeepNavy,
                            modifier = Modifier.padding(bottom = 6.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(100.dp))

                // Options Chips with placeholder behavior
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    exercise.options.forEach { opt ->
                        val isSelected = selectedOption == opt
                        if (isSelected) {
                            // Empty placeholder when selected
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(50.dp)
                                    .clip(RoundedCornerShape(14.dp))
                                    .background(Color(0xFFE2E8F0))
                            )
                        } else {
                            Surface(
                                shape = RoundedCornerShape(14.dp),
                                color = MaterialTheme.colorScheme.surface,
                                shadowElevation = 2.dp,
                                border = androidx.compose.foundation.BorderStroke(1.dp, BorderGray),
                                modifier = Modifier
                                    .weight(1f)
                                    .height(50.dp)
                                    .bouncyClick {
                                        if (!isSubmitted) {
                                            selectedOption = opt
                                        }
                                    }
                            ) {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = opt,
                                        fontSize = 17.sp,
                                        fontWeight = FontWeight.Normal,
                                        color = DeepNavy
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // EXERCISE TYPE 3: PILIH TERJEMAHAN YANG BENAR (Screenshot 7 & 10)
            if (exercise.type == ExerciseType.SENTENCE_CHOICE) {
                if (exercise.targetHanzi.isNotBlank()) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (exercise.audioToSpeak.isNotBlank()) {
                            Box(
                                modifier = Modifier
                                    .size(54.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFF00C48C))
                                    .bouncyClick { ttsManager?.speak(exercise.audioToSpeak) },
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = "Dengarkan", tint = Color.White)
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                        }
                        Column {
                            if (exercise.targetPinyin.isNotBlank()) {
                                Text(text = exercise.targetPinyin, fontSize = 16.sp, color = SlateGray)
                                Spacer(modifier = Modifier.height(2.dp))
                            }
                            Text(text = exercise.targetHanzi, fontSize = 24.sp, fontWeight = FontWeight.SemiBold, color = HanziColor)
                        }
                    }

                    Spacer(modifier = Modifier.height(28.dp))
                } else if (exercise.targetTranslation.isNotBlank()) {
                    Text(
                        text = exercise.targetTranslation,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        color = DeepNavy,
                        modifier = Modifier.padding(bottom = 28.dp)
                    )
                }

                val isGrid2x2 = exercise.options.size == 4 && exercise.options.all { it.length <= 16 }

                if (isGrid2x2) {
                    val rows = exercise.options.chunked(2)
                    Column(
                        verticalArrangement = Arrangement.spacedBy(14.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        rows.forEach { rowOptions ->
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(14.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                rowOptions.forEach { opt ->
                                    val isSelected = selectedOption == opt
                                    Surface(
                                        shape = RoundedCornerShape(18.dp),
                                        color = Color.White,
                                        shadowElevation = if (isSelected) 2.dp else 1.dp,
                                        border = androidx.compose.foundation.BorderStroke(
                                            width = if (isSelected) 2.5.dp else 1.dp,
                                            color = if (isSelected) Color(0xFF007AFF) else Color(0xFFE2E8F0)
                                        ),
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(170.dp)
                                            .bouncyClick {
                                                if (!isSubmitted) {
                                                    selectedOption = opt
                                                }
                                            }
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .padding(12.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                text = opt,
                                                fontSize = 18.sp,
                                                fontWeight = if (isSelected) FontWeight.Medium else FontWeight.Normal,
                                                color = if (isSelected) Color(0xFF007AFF) else DeepNavy,
                                                textAlign = TextAlign.Center
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    exercise.options.forEach { opt ->
                        val isSelected = selectedOption == opt
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = Color.White,
                            shadowElevation = if (isSelected) 2.dp else 1.dp,
                            border = androidx.compose.foundation.BorderStroke(
                                width = if (isSelected) 2.dp else 1.dp,
                                color = if (isSelected) Color(0xFF007AFF) else Color(0xFFE2E8F0)
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 7.dp)
                                .bouncyClick {
                                    if (!isSubmitted) {
                                        selectedOption = opt
                                    }
                                }
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 20.dp, vertical = 18.dp)
                            ) {
                                if (opt.contains("\n")) {
                                    val lines = opt.split("\n")
                                    val pinyinPart = lines.getOrNull(0) ?: ""
                                    val hanziPart = lines.getOrNull(1) ?: ""
                                    Column {
                                        if (pinyinPart.isNotBlank()) {
                                            Text(
                                                text = pinyinPart,
                                                fontSize = 15.sp,
                                                fontWeight = FontWeight.Normal,
                                                color = if (isSelected) Color(0xFF007AFF) else SlateGray
                                            )
                                            Spacer(modifier = Modifier.height(4.dp))
                                        }
                                        Text(
                                            text = hanziPart,
                                            fontSize = 22.sp,
                                            fontWeight = FontWeight.Normal,
                                            color = if (isSelected) Color(0xFF007AFF) else DeepNavy
                                        )
                                    }
                                } else {
                                    Text(
                                        text = opt,
                                        fontSize = 17.sp,
                                        fontWeight = if (isSelected) FontWeight.Medium else FontWeight.Normal,
                                        color = if (isSelected) Color(0xFF007AFF) else DeepNavy,
                                        lineHeight = 24.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // EXERCISE TYPE 4: APA YANG ANDA DENGAR / SENTENCE BUILDER (Screenshot 9)
            if (exercise.type == ExerciseType.SENTENCE_BUILDER) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(54.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF00C48C))
                            .bouncyClick { ttsManager?.speak(exercise.audioToSpeak) },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = "Dengarkan", tint = Color.White)
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                    Text(
                        text = "Ketuk balok untuk menyusun kalimat yang diucapkan",
                        fontSize = 14.sp,
                        color = SlateGray
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = MaterialTheme.colorScheme.surface,
                    border = androidx.compose.foundation.BorderStroke(1.5.dp, BorderGray),
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 80.dp)
                ) {
                    FlowRow(
                        modifier = Modifier.padding(12.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = Color(0xFFF1F5F9),
                            modifier = Modifier.padding(2.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                            ) {
                                Text(text = "Bùdí", fontSize = 11.sp, color = SlateGray)
                                Text(text = "布迪", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = DeepNavy)
                            }
                        }

                        selectedChips.forEachIndexed { cIdx, chipText ->
                            val token = LearningRepository.findToken(chipText)
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = Color(0xFFE8F5E9),
                                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF00C48C)),
                                modifier = Modifier.bouncyClick {
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
                                        Text(text = token.pinyin, fontSize = 11.sp, color = Color(0xFF008966))
                                    }
                                    Text(text = chipText, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = DeepNavy)
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    exercise.wordChips.forEach { chip ->
                        val countInSelected = selectedChips.count { it == chip }
                        val isAvailable = countInSelected == 0
                        val token = LearningRepository.findToken(chip)

                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = if (isAvailable) MaterialTheme.colorScheme.surface else Color(0xFFEEEEEE),
                            shadowElevation = if (isAvailable) 2.dp else 0.dp,
                            border = androidx.compose.foundation.BorderStroke(1.dp, if (isAvailable) BorderGray else Color.Transparent),
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .bouncyClick {
                                    if (isAvailable && !isSubmitted) {
                                        selectedChips = selectedChips + chip
                                        ttsManager?.speak(chip)
                                    }
                                }
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp)
                            ) {
                                Text(
                                    text = token.pinyin,
                                    fontSize = 11.sp,
                                    color = if (isAvailable) Color(0xFF008966) else Color.LightGray
                                )
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

            // EXERCISE TYPE 5: KETUK PASANGAN YANG SESUAI (Screenshots 11 & 12)
            if (exercise.type == ExerciseType.MATCH_PAIRS) {
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Left Column (Hanzi + Pinyin)
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        exercise.matchPairs.forEach { item ->
                            val isMatched = matchedPairIds.contains(item.id)
                            val isSelected = selectedLeftPairId == item.id

                            Surface(
                                shape = RoundedCornerShape(14.dp),
                                color = when {
                                    isMatched -> Color(0xFFF1F5F9)
                                    isSelected -> Color(0xFFE3F2FD)
                                    else -> MaterialTheme.colorScheme.surface
                                },
                                border = androidx.compose.foundation.BorderStroke(
                                    width = if (isSelected) 2.dp else 1.dp,
                                    color = when {
                                        isMatched -> Color.Transparent
                                        isSelected -> Color(0xFF1976D2)
                                        else -> BorderGray
                                    }
                                ),
                                shadowElevation = if (isMatched) 0.dp else 1.dp,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .bouncyClick {
                                        if (!isMatched) {
                                            selectedLeftPairId = item.id
                                            ttsManager?.speak(item.hanzi)

                                            if (selectedRightPairId != null) {
                                                if (item.id == selectedRightPairId) {
                                                    matchedPairIds = matchedPairIds + item.id
                                                }
                                                selectedLeftPairId = null
                                                selectedRightPairId = null
                                            }
                                        }
                                    }
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier.padding(vertical = 12.dp)
                                ) {
                                    Text(
                                        text = item.pinyin,
                                        fontSize = 11.sp,
                                        color = if (isMatched) Color.LightGray else (if (isSelected) Color(0xFF1976D2) else SlateGray)
                                    )
                                    Text(
                                        text = item.hanzi,
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isMatched) Color.LightGray else (if (isSelected) Color(0xFF1976D2) else HanziColor)
                                    )
                                }
                            }
                        }
                    }

                    // Right Column (Translations)
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        shuffledRightPairs.forEach { item ->
                            val isMatched = matchedPairIds.contains(item.id)
                            val isSelected = selectedRightPairId == item.id

                            Surface(
                                shape = RoundedCornerShape(14.dp),
                                color = when {
                                    isMatched -> Color(0xFFF1F5F9)
                                    isSelected -> Color(0xFFE3F2FD)
                                    else -> MaterialTheme.colorScheme.surface
                                },
                                border = androidx.compose.foundation.BorderStroke(
                                    width = if (isSelected) 2.dp else 1.dp,
                                    color = when {
                                        isMatched -> Color.Transparent
                                        isSelected -> Color(0xFF1976D2)
                                        else -> BorderGray
                                    }
                                ),
                                shadowElevation = if (isMatched) 0.dp else 1.dp,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .bouncyClick {
                                        if (!isMatched) {
                                            selectedRightPairId = item.id

                                            if (selectedLeftPairId != null) {
                                                if (item.id == selectedLeftPairId) {
                                                    matchedPairIds = matchedPairIds + item.id
                                                }
                                                selectedLeftPairId = null
                                                selectedRightPairId = null
                                            }
                                        }
                                    }
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(58.dp)
                                        .padding(horizontal = 8.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = item.translation,
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isMatched) Color.LightGray else (if (isSelected) Color(0xFF1976D2) else DeepNavy),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// CELEBRATION SCREEN (Screenshot 13)
@Composable
fun LessonCelebrationScreen(
    comboCount: Int,
    onContinue: () -> Unit
) {
    // Entrance pulse animation
    val lionScale by animateFloatAsState(
        targetValue = 1.0f,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = Spring.StiffnessLow),
        label = "lionScale"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFDF9))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            // Barongsai / Lion Dance celebration emoji with bounce
            Box(
                modifier = Modifier
                    .size(160.dp)
                    .graphicsLayer {
                        scaleX = lionScale
                        scaleY = lionScale
                    }
                    .clip(CircleShape)
                    .background(Color(0xFFFFF3E0)),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "🦁", fontSize = 90.sp)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Bab sempurna!",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF9800)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Sempurna! Kamu menjawab semua soal dengan benar!",
                fontSize = 14.sp,
                color = DeepNavy,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(30.dp))

            // Total XP Card
            Surface(
                shape = RoundedCornerShape(16.dp),
                color = MaterialTheme.colorScheme.surface,
                border = androidx.compose.foundation.BorderStroke(1.5.dp, Color(0xFF00C48C)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "⚡🏅", fontSize = 22.sp)
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(text = "Total XP", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = DeepNavy)
                    }
                    Text(text = "10", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFF00C48C))
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Two Side-by-Side Metric Cards (Speed & Accuracy)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Blue Card: Kecepatan cahaya!
                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    border = androidx.compose.foundation.BorderStroke(1.5.dp, Color(0xFF03A9F4)),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Surface(
                            color = Color(0xFF03A9F4),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "*Kecepatan cahaya!*",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(vertical = 4.dp)
                            )
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(14.dp)
                        ) {
                            Text(text = "⏱️", fontSize = 20.sp)
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(text = "01:23", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = DeepNavy)
                        }
                    }
                }

                // Orange Card: Tepat sasaran!
                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    border = androidx.compose.foundation.BorderStroke(1.5.dp, Color(0xFFFF5722)),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Surface(
                            color = Color(0xFFFF5722),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "Tepat sasaran!",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(vertical = 4.dp)
                            )
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(14.dp)
                        ) {
                            Text(text = "🎯", fontSize = 20.sp)
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(text = "100%", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = DeepNavy)
                        }
                    }
                }
            }
        }

        // Golden gradient continue button with Bouncy Touch
        Surface(
            shape = RoundedCornerShape(27.dp),
            color = Color(0xFFFF9800),
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp)
                .bouncyClick(onClick = onContinue)
        ) {
            Box(contentAlignment = Alignment.Center) {
                Text(
                    text = "LANJUTKAN",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
        }
    }
}
