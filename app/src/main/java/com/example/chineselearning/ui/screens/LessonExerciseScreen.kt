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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import com.example.chineselearning.R
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
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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
    var lastMatchedPairId by remember(currentExerciseIdx) { mutableStateOf<String?>(null) }
    var wrongLeftPairId by remember(currentExerciseIdx) { mutableStateOf<String?>(null) }
    var wrongRightPairId by remember(currentExerciseIdx) { mutableStateOf<String?>(null) }
    val coroutineScope = rememberCoroutineScope()
    val hapticFeedback = LocalHapticFeedback.current
    var shuffledRightPairs by remember(currentExerciseIdx) {
        val currEx = exercisesList.getOrNull(currentExerciseIdx)
        val fixedOrder = when (currEx?.id) {
            "u1_p1_q8", "u1_l2_q7" -> listOf("saya", "halo", "dipanggil")
            "u1_l2_p2_q3" -> listOf("orang", "(negara) Indonesia", "(negara)\nIndonesia", "guru", "adalah", "murid")
            else -> listOf("adalah", "guru", "(negara) Indonesia", "(negara)\nIndonesia", "orang", "murid")
        }
        val pairs = currEx?.matchPairs ?: emptyList()
        val sorted = pairs.sortedBy { fixedOrder.indexOf(it.translation).takeIf { idx -> idx >= 0 } ?: 99 }
        mutableStateOf(sorted)
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
        ExerciseType.SENTENCE_BUILDER -> {
            if (exercise.correctAnswer.contains(",")) {
                val expectedCount = exercise.correctAnswer.split(",").size
                selectedChips.size >= expectedCount
            } else {
                selectedChips.isNotEmpty()
            }
        }
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
            ExerciseType.SENTENCE_BUILDER -> {
                val selectedClean = selectedChips.map { it.substringBefore(":") }.joinToString(",")
                selectedClean == exercise.correctAnswer
            }
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
            lastMatchedPairId = null
            wrongLeftPairId = null
            wrongRightPairId = null
            isSubmitted = false
            isCorrect = false
        }
    }

    // CELEBRATION SCREEN
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
                        val remaining = totalExercises - currentExerciseIdx
                        if (remaining == 1) {
                            Text(
                                text = "Satu lagi!",
                                color = Color(0xFFE53935),
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic,
                                fontSize = 14.sp
                            )
                        } else if (remaining <= 3) {
                            Text(
                                text = "$remaining soal lagi sempurna!",
                                color = Color(0xFFE53935),
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic,
                                fontSize = 13.sp
                            )
                        } else if (comboCount > 1) {
                            Text(
                                text = "Combo x$comboCount!",
                                color = Color(0xFFFF9800),
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic,
                                fontSize = 14.sp
                            )
                        } else {
                            Text(
                                text = "$remaining soal lagi sempurna!",
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

                // Dynamic Fire / Gradient Progress Bar with Target Bullseye
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

                    Icon(
                        painter = painterResource(R.drawable.ic_target),
                        contentDescription = "Target",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        },
        bottomBar = {
            // BOTTOM BAR / FEEDBACK SHEET with tactile shake on incorrect answer
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
                            fontFamily = KaiTiFontFamily,
                            fontSize = 22.sp,
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
                    // Default PERIKSA / LANJUTKAN button with tactile Bouncy click
                    val isMatchPairsAllDone = exercise.type == ExerciseType.MATCH_PAIRS && matchedPairIds.size == exercise.matchPairs.size
                    Surface(
                        shape = RoundedCornerShape(26.dp),
                        color = if (canCheck) Color(0xFF00C48C) else Color(0xFFE0E0E0),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(52.dp)
                            .then(
                                if (canCheck) {
                                    Modifier.bouncyClick {
                                        if (isMatchPairsAllDone) {
                                            nextExercise()
                                        } else {
                                            submitAnswer()
                                        }
                                    }
                                } else Modifier
                            )
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = if (exercise.type == ExerciseType.MATCH_PAIRS) "LANJUTKAN" else "PERIKSA",
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

            // EXERCISE TYPE 1: PILIH GAMBAR YANG BENAR
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
                            fontFamily = KaiTiFontFamily,
                            fontSize = 28.sp,
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
                                val isTwoOptions = exercise.pictureOptions.size == 2
                                val boxHeight = if (isTwoOptions) 150.dp else 110.dp

                                Card(
                                    shape = RoundedCornerShape(20.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White),
                                    elevation = CardDefaults.cardElevation(defaultElevation = if (isSelected) 6.dp else 2.dp),
                                    modifier = Modifier
                                        .weight(1f)
                                        .border(
                                            width = if (isSelected) 3.dp else 1.2.dp,
                                            color = if (isSelected) Color(0xFF007AFF) else Color(0xFFE2E8F0),
                                            shape = RoundedCornerShape(20.dp)
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
                                                .height(boxHeight)
                                                .background(Color.White),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            if (opt.iconRes != 0) {
                                                androidx.compose.foundation.Image(
                                                    painter = painterResource(opt.iconRes),
                                                    contentDescription = opt.label,
                                                    modifier = Modifier
                                                        .size(if (isTwoOptions) 130.dp else 102.dp)
                                                        .padding(2.dp),
                                                    contentScale = androidx.compose.ui.layout.ContentScale.Fit
                                                )
                                            } else {
                                                Text(text = opt.emoji, fontSize = if (isTwoOptions) 64.sp else 52.sp)
                                            }
                                        }

                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(bottom = 12.dp, top = 2.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                text = opt.label,
                                                fontFamily = NunitoFontFamily,
                                                fontSize = 15.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = if (isSelected) Color(0xFF007AFF) else DeepNavy,
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

            // EXERCISE TYPE 2: LENGKAPI TERJEMAHAN
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
                        Text(text = exercise.targetHanzi, fontFamily = KaiTiFontFamily, fontSize = 26.sp, fontWeight = FontWeight.SemiBold, color = HanziColor)
                    }
                }

                Spacer(modifier = Modifier.height(36.dp))

                // Sentence with slot and underline indicator
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

            // EXERCISE TYPE 3: PILIH TERJEMAHAN YANG BENAR
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
                            Text(text = exercise.targetHanzi, fontFamily = KaiTiFontFamily, fontSize = 26.sp, fontWeight = FontWeight.SemiBold, color = HanziColor)
                        }
                    }

                    Spacer(modifier = Modifier.height(28.dp))
                } else if (exercise.dialogueSpeakerText.isNotBlank()) {
                    // Conversation / Dialogue speaker card (Soal 5)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp, bottom = 24.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = Color(0xFFF1F5F9),
                            modifier = Modifier.size(72.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    painter = painterResource(R.drawable.ic_person_guru),
                                    contentDescription = "Speaker",
                                    tint = Color.Unspecified,
                                    modifier = Modifier.size(46.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Surface(
                            shape = RoundedCornerShape(18.dp),
                            color = Color.White,
                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                            shadowElevation = 1.dp,
                            modifier = Modifier.weight(1f)
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(42.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF00C48C))
                                        .bouncyClick { ttsManager?.speak(exercise.audioToSpeak) },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                                        contentDescription = "Dengarkan",
                                        tint = Color.White,
                                        modifier = Modifier.size(22.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Column {
                                    if (exercise.dialogueSpeakerPinyin.isNotBlank()) {
                                        Text(text = exercise.dialogueSpeakerPinyin, fontSize = 13.sp, color = SlateGray)
                                    }
                                    Text(
                                        text = exercise.dialogueSpeakerText,
                                        fontFamily = KaiTiFontFamily,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = DeepNavy
                                    )
                                }
                            }
                        }
                    }
                } else if (exercise.audioToSpeak.isNotBlank() && exercise.targetHanzi.isBlank() && exercise.targetTranslation.isBlank()) {
                    // Audio listening prompt (Soal 3)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp, bottom = 28.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF00C48C))
                                .bouncyClick { ttsManager?.speak(exercise.audioToSpeak) },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                                contentDescription = "Dengarkan",
                                tint = Color.White,
                                modifier = Modifier.size(32.dp)
                            )
                        }
                    }
                } else if (exercise.targetTranslation.isNotBlank()) {
                    Text(
                        text = exercise.targetTranslation,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        color = DeepNavy,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 6.dp, bottom = 32.dp)
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
                                            fontFamily = KaiTiFontFamily,
                                            fontSize = 24.sp,
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

            // EXERCISE TYPE 4: APA YANG ANDA DENGAR / SENTENCE BUILDER
            if (exercise.type == ExerciseType.SENTENCE_BUILDER) {
                if (exercise.isImmersiveSpeaker) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(520.dp)
                            .clip(RoundedCornerShape(24.dp))
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(
                                        Color(0xFFF8FAFC),
                                        Color(0xFFEDF2F7),
                                        Color(0xFFE2E8F0)
                                    )
                                )
                            )
                    ) {
                        // Ambient native speaker silhouette
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 90.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_person_murid),
                                contentDescription = null,
                                tint = Color.Unspecified,
                                modifier = Modifier
                                    .size(160.dp)
                                    .graphicsLayer(alpha = 0.20f)
                            )
                        }

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(14.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            // Top: Sentence with dynamic slots + trailing text
                            val expectedImmersiveSlots = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 1
                            val slot1Width = if (expectedImmersiveSlots == 1) 92.dp else if (exercise.staticLeadingText.isNotBlank()) 48.dp else 62.dp

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 18.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.Bottom
                            ) {
                                // Static Leading Text (e.g. 布迪 / Bùdí)
                                if (exercise.staticLeadingText.isNotBlank()) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier.padding(bottom = 6.dp)
                                    ) {
                                        if (exercise.staticLeadingPinyin.isNotBlank()) {
                                            Text(
                                                text = exercise.staticLeadingPinyin,
                                                fontSize = 14.sp,
                                                color = DeepNavy
                                            )
                                            Spacer(modifier = Modifier.height(2.dp))
                                        }
                                        Text(
                                            text = exercise.staticLeadingText,
                                            fontFamily = KaiTiFontFamily,
                                            fontSize = 24.sp,
                                            fontWeight = FontWeight.Normal,
                                            color = DeepNavy
                                        )
                                    }
                                    Spacer(modifier = Modifier.width(10.dp))
                                }

                                // Slot 1
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Row(verticalAlignment = Alignment.Bottom) {
                                        if (selectedChips.isNotEmpty()) {
                                            val chip = selectedChips[0]
                                            val hanzi = chip.substringBefore(":")
                                            val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                            Surface(
                                                shape = RoundedCornerShape(12.dp),
                                                color = Color.White,
                                                shadowElevation = 2.dp,
                                                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                                modifier = Modifier.bouncyClick {
                                                    if (!isSubmitted) {
                                                        selectedChips = selectedChips.toMutableList().also { it.removeAt(0) }
                                                    }
                                                }
                                            ) {
                                                Column(
                                                    horizontalAlignment = Alignment.CenterHorizontally,
                                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                                                ) {
                                                    if (pinyin.isNotBlank()) {
                                                        Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                                    }
                                                    Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                                }
                                            }
                                        } else {
                                            Box(modifier = Modifier.width(slot1Width).height(48.dp))
                                        }
                                        if (exercise.hasCommaAfterSlot1) {
                                            Text(
                                                text = " ，",
                                                fontSize = 22.sp,
                                                color = DeepNavy,
                                                modifier = Modifier.padding(bottom = 6.dp)
                                            )
                                        }
                                    }
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Box(
                                        modifier = Modifier
                                            .width(slot1Width)
                                            .height(2.5.dp)
                                            .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                    )
                                }

                                if (expectedImmersiveSlots >= 2) {
                                    Spacer(modifier = Modifier.width(8.dp))

                                    // Slot 2
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        if (selectedChips.size > 1) {
                                            val chip = selectedChips[1]
                                            val hanzi = chip.substringBefore(":")
                                            val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                            Surface(
                                                shape = RoundedCornerShape(12.dp),
                                                color = Color.White,
                                                shadowElevation = 2.dp,
                                                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                                modifier = Modifier.bouncyClick {
                                                    if (!isSubmitted) {
                                                        selectedChips = selectedChips.toMutableList().also { it.removeAt(1) }
                                                    }
                                                }
                                            ) {
                                                Column(
                                                    horizontalAlignment = Alignment.CenterHorizontally,
                                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                                ) {
                                                    if (pinyin.isNotBlank()) {
                                                        Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                                    }
                                                    Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                                }
                                            }
                                        } else {
                                            Box(modifier = Modifier.width(48.dp).height(48.dp))
                                        }
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Box(
                                            modifier = Modifier
                                                .width(48.dp)
                                                .height(2.5.dp)
                                                .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                        )
                                    }
                                }

                                if (expectedImmersiveSlots >= 3) {
                                    Spacer(modifier = Modifier.width(8.dp))

                                    // Slot 3
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        if (selectedChips.size > 2) {
                                            val chip = selectedChips[2]
                                            val hanzi = chip.substringBefore(":")
                                            val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                            Surface(
                                                shape = RoundedCornerShape(12.dp),
                                                color = Color.White,
                                                shadowElevation = 2.dp,
                                                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                                modifier = Modifier.bouncyClick {
                                                    if (!isSubmitted) {
                                                        selectedChips = selectedChips.toMutableList().also { it.removeAt(2) }
                                                    }
                                                }
                                            ) {
                                                Column(
                                                    horizontalAlignment = Alignment.CenterHorizontally,
                                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                                ) {
                                                    if (pinyin.isNotBlank()) {
                                                        Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                                    }
                                                    Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                                }
                                            }
                                        } else {
                                            Box(modifier = Modifier.width(48.dp).height(48.dp))
                                        }
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Box(
                                            modifier = Modifier
                                                .width(48.dp)
                                                .height(2.5.dp)
                                                .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.width(12.dp))

                                // Static Trailing Text: 王飞 。
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier.padding(bottom = 6.dp)
                                ) {
                                    if (exercise.staticTrailingPinyin.isNotBlank()) {
                                        Text(
                                            text = exercise.staticTrailingPinyin,
                                            fontSize = 14.sp,
                                            color = DeepNavy
                                        )
                                        Spacer(modifier = Modifier.height(2.dp))
                                    }
                                    Text(
                                        text = exercise.staticTrailingText,
                                        fontFamily = KaiTiFontFamily,
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.Normal,
                                        color = DeepNavy
                                    )
                                }
                            }

                            // Middle: Chips (1 or 2 rows)
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 2.dp),
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                val chipRows = if (exercise.wordChips.size > 5) {
                                    listOf(exercise.wordChips.take(5), exercise.wordChips.drop(5))
                                } else {
                                    listOf(exercise.wordChips)
                                }

                                chipRows.forEach { rowChips ->
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterHorizontally)
                                    ) {
                                        rowChips.forEach { chip ->
                                            val isUsed = selectedChips.contains(chip)
                                            val hanzi = chip.substringBefore(":")
                                            val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""

                                            val chipModifier = if (rowChips.size == 1 && chipRows.size > 1) {
                                                Modifier.width(66.dp).height(64.dp)
                                            } else {
                                                Modifier.weight(1f).height(64.dp)
                                            }

                                            if (isUsed) {
                                                // Translucent dark grey placeholder box
                                                Box(
                                                    modifier = chipModifier
                                                        .clip(RoundedCornerShape(14.dp))
                                                        .background(Color(0x2E000000))
                                                )
                                            } else {
                                                Surface(
                                                    shape = RoundedCornerShape(14.dp),
                                                    color = Color.White,
                                                    shadowElevation = 2.dp,
                                                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                                    modifier = chipModifier
                                                        .bouncyClick {
                                                            if (!isSubmitted && selectedChips.size < 3) {
                                                                selectedChips = selectedChips + chip
                                                                ttsManager?.speak(hanzi)
                                                            }
                                                        }
                                                ) {
                                                    Column(
                                                        horizontalAlignment = Alignment.CenterHorizontally,
                                                        verticalArrangement = Arrangement.Center,
                                                        modifier = Modifier
                                                            .fillMaxSize()
                                                            .padding(horizontal = 2.dp, vertical = 4.dp)
                                                    ) {
                                                        if (pinyin.isNotBlank()) {
                                                            Text(
                                                                text = pinyin,
                                                                fontSize = 12.sp,
                                                                color = DeepNavy,
                                                                maxLines = 1
                                                            )
                                                        }
                                                        Text(
                                                            text = hanzi,
                                                            fontFamily = KaiTiFontFamily,
                                                            fontSize = 20.sp,
                                                            fontWeight = FontWeight.Normal,
                                                            color = DeepNavy,
                                                            maxLines = 1
                                                        )
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            // Bottom: Snail, Play, Chevron Audio Player Controls
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 6.dp),
                                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Snail (Slow audio)
                                Box(
                                    modifier = Modifier
                                        .size(46.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFFD4F5EC))
                                        .bouncyClick {
                                            ttsManager?.speak(exercise.audioToSpeak, speedRate = 0.55f)
                                        },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_snail),
                                        contentDescription = "Slow audio",
                                        tint = Color.Unspecified,
                                        modifier = Modifier.size(24.dp)
                                    )
                                }

                                // Play (Normal audio)
                                Box(
                                    modifier = Modifier
                                        .size(46.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFFD4F5EC))
                                        .bouncyClick {
                                            ttsManager?.speak(exercise.audioToSpeak, speedRate = 0.85f)
                                        },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.PlayArrow,
                                        contentDescription = "Putar",
                                        tint = Color(0xFF00B386),
                                        modifier = Modifier.size(28.dp)
                                    )
                                }

                                // Chevron Down
                                Box(
                                    modifier = Modifier
                                        .size(46.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFFD4F5EC))
                                        .bouncyClick {
                                            ttsManager?.speak(exercise.audioToSpeak, speedRate = 0.85f)
                                        },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.KeyboardArrowDown,
                                        contentDescription = "Menu",
                                        tint = Color(0xFF00B386),
                                        modifier = Modifier.size(28.dp)
                                    )
                                }
                            }
                        }
                    }
                } else if (exercise.title == "Terjemahkan kalimat ini") {
                    // Full sentence builder onto underline zone (Soal 8)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp, bottom = 24.dp),
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
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(
                            text = exercise.targetTranslation,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Normal,
                            color = DeepNavy
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // 2-Line underline drop zone
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(110.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Spacer(modifier = Modifier.weight(1f))
                            Box(modifier = Modifier.fillMaxWidth().height(1.5.dp).background(Color(0xFF80CBC4)))
                            Spacer(modifier = Modifier.weight(1f))
                            Box(modifier = Modifier.fillMaxWidth().height(1.5.dp).background(Color(0xFF80CBC4)))
                        }

                        // Selected chips placed onto the lines
                        FlowRow(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 4.dp, vertical = 2.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            selectedChips.forEachIndexed { idx, chip ->
                                val hanzi = chip.substringBefore(":")
                                val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""

                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = Color.White,
                                    shadowElevation = 2.dp,
                                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                    modifier = Modifier.bouncyClick {
                                        if (!isSubmitted) {
                                            selectedChips = selectedChips.toMutableList().also { it.removeAt(idx) }
                                        }
                                    }
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                                    ) {
                                        if (pinyin.isNotBlank()) {
                                            Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                        }
                                        Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(50.dp))

                    val chipRows = if (exercise.wordChips.size > 5) {
                        listOf(exercise.wordChips.take(4), exercise.wordChips.drop(4))
                    } else {
                        listOf(exercise.wordChips)
                    }

                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        chipRows.forEach { rowChips ->
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
                            ) {
                                rowChips.forEach { chip ->
                                    val isUsed = selectedChips.contains(chip)
                                    val hanzi = chip.substringBefore(":")
                                    val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""

                                    val isWide = hanzi.length >= 4
                                    val chipModifier = if (isWide) {
                                        Modifier.weight(1.8f).height(64.dp)
                                    } else {
                                        Modifier.weight(1f).height(64.dp)
                                    }

                                    if (isUsed) {
                                        Box(
                                            modifier = chipModifier
                                                .clip(RoundedCornerShape(14.dp))
                                                .background(Color(0xFFE2E8F0))
                                        )
                                    } else {
                                        Surface(
                                            shape = RoundedCornerShape(14.dp),
                                            color = Color.White,
                                            shadowElevation = 2.dp,
                                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                            modifier = chipModifier
                                                .bouncyClick {
                                                    val expectedCount = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 4
                                                    if (!isSubmitted && selectedChips.size < expectedCount) {
                                                        selectedChips = selectedChips + chip
                                                        ttsManager?.speak(hanzi)
                                                    }
                                                }
                                        ) {
                                            Column(
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                verticalArrangement = Arrangement.Center,
                                                modifier = Modifier
                                                    .fillMaxSize()
                                                    .padding(horizontal = 2.dp, vertical = 4.dp)
                                            ) {
                                                if (pinyin.isNotBlank()) {
                                                    Text(
                                                        text = pinyin,
                                                        fontSize = 12.sp,
                                                        color = DeepNavy,
                                                        maxLines = 1
                                                    )
                                                }
                                                Text(
                                                    text = hanzi,
                                                    fontFamily = KaiTiFontFamily,
                                                    fontSize = if (hanzi.length >= 4) 16.sp else 20.sp,
                                                    fontWeight = FontWeight.Normal,
                                                    color = DeepNavy,
                                                    maxLines = 1
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // Keyboard Icon at bottom-left
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = Color(0xFFE0F2F1),
                            modifier = Modifier.size(36.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.Keyboard,
                                    contentDescription = "Keyboard",
                                    tint = Color(0xFF00897B),
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }
                } else if (exercise.targetTranslation.isNotBlank()) {
                    val expectedSlots = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 2
                    Text(
                        text = exercise.targetTranslation,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        color = DeepNavy,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 6.dp, bottom = 32.dp)
                    )

                    if (exercise.id == "u1_l2_p2_q4") {
                        // Custom 2-line layout for u1_l2_p2_q4:
                        // Line 1: [Slot 0: 老师] ， 你好 ， 我 [Slot 1: 是]
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.Bottom,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            // Slot 0 (老师)
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                if (selectedChips.isNotEmpty()) {
                                    val chip = selectedChips[0]
                                    val hanzi = chip.substringBefore(":")
                                    val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                    Surface(
                                        shape = RoundedCornerShape(12.dp),
                                        color = Color.White,
                                        shadowElevation = 2.dp,
                                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                        modifier = Modifier.bouncyClick {
                                            if (!isSubmitted) selectedChips = selectedChips.toMutableList().also { it.removeAt(0) }
                                        }
                                    ) {
                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                        ) {
                                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                        }
                                    }
                                } else {
                                    Box(modifier = Modifier.width(66.dp).height(48.dp))
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Box(
                                    modifier = Modifier
                                        .width(66.dp)
                                        .height(2.5.dp)
                                        .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                )
                            }

                            Spacer(modifier = Modifier.width(6.dp))

                            // Fixed text: "， 你好 ， 我"
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(text = "       nǐhǎo       wǒ", fontSize = 14.sp, color = SlateGray)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(text = " ， 你好 ， 我", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = HanziColor)
                            }

                            Spacer(modifier = Modifier.width(8.dp))

                            // Slot 1 (是)
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                if (selectedChips.size > 1) {
                                    val chip = selectedChips[1]
                                    val hanzi = chip.substringBefore(":")
                                    val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                    Surface(
                                        shape = RoundedCornerShape(12.dp),
                                        color = Color.White,
                                        shadowElevation = 2.dp,
                                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                        modifier = Modifier.bouncyClick {
                                            if (!isSubmitted) selectedChips = selectedChips.toMutableList().also { it.removeAt(1) }
                                        }
                                    ) {
                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                        ) {
                                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                        }
                                    }
                                } else {
                                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Box(
                                    modifier = Modifier
                                        .width(50.dp)
                                        .height(2.5.dp)
                                        .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        // Line 2: [Slot 2: 印尼] [Slot 3: 人] 。
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.Bottom,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            // Slot 2 (印尼)
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                if (selectedChips.size > 2) {
                                    val chip = selectedChips[2]
                                    val hanzi = chip.substringBefore(":")
                                    val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                    Surface(
                                        shape = RoundedCornerShape(12.dp),
                                        color = Color.White,
                                        shadowElevation = 2.dp,
                                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                        modifier = Modifier.bouncyClick {
                                            if (!isSubmitted) selectedChips = selectedChips.toMutableList().also { it.removeAt(2) }
                                        }
                                    ) {
                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                        ) {
                                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                        }
                                    }
                                } else {
                                    Box(modifier = Modifier.width(66.dp).height(48.dp))
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Box(
                                    modifier = Modifier
                                        .width(66.dp)
                                        .height(2.5.dp)
                                        .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                )
                            }

                            Spacer(modifier = Modifier.width(8.dp))

                            // Slot 3 (人)
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                if (selectedChips.size > 3) {
                                    val chip = selectedChips[3]
                                    val hanzi = chip.substringBefore(":")
                                    val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                    Surface(
                                        shape = RoundedCornerShape(12.dp),
                                        color = Color.White,
                                        shadowElevation = 2.dp,
                                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                        modifier = Modifier.bouncyClick {
                                            if (!isSubmitted) selectedChips = selectedChips.toMutableList().also { it.removeAt(3) }
                                        }
                                    ) {
                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                        ) {
                                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                        }
                                    }
                                } else {
                                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Box(
                                    modifier = Modifier
                                        .width(50.dp)
                                        .height(2.5.dp)
                                        .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                )
                            }

                            Spacer(modifier = Modifier.width(8.dp))

                            Text(
                                text = " 。",
                                fontFamily = KaiTiFontFamily,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Normal,
                                color = HanziColor,
                                modifier = Modifier.padding(bottom = 6.dp)
                            )
                        }
                    } else {
                        // Optional Line 1 when slots are placed on Line 2
                        if (exercise.hasSlotsOnLine2) {
                            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
                                Column(horizontalAlignment = Alignment.Start) {
                                    if (exercise.staticLeadingPinyin.isNotBlank()) {
                                        Text(text = exercise.staticLeadingPinyin, fontSize = 15.sp, color = SlateGray)
                                        Spacer(modifier = Modifier.height(2.dp))
                                    }
                                    Text(text = exercise.staticLeadingText, fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
                                }
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                        }

                        // Line with slots: [Leading Text] [Slot 1] [Slot 2] [Slot 3] [Trailing Text]
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.Bottom,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            if (exercise.staticLeadingText.isNotBlank() && !exercise.hasSlotsOnLine2) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    if (exercise.staticLeadingPinyin.isNotBlank()) {
                                        Text(text = exercise.staticLeadingPinyin, fontSize = 15.sp, color = SlateGray)
                                        Spacer(modifier = Modifier.height(2.dp))
                                    }
                                    Text(text = exercise.staticLeadingText, fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
                                }
                                Spacer(modifier = Modifier.width(12.dp))
                            } else if (exercise.id == "u1_p1_q9") {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(text = "Nǐhǎo", fontSize = 15.sp, color = SlateGray)
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(text = "你好 ，", fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
                                }

                                Spacer(modifier = Modifier.width(16.dp))

                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(text = "WángFēi", fontSize = 15.sp, color = SlateGray)
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(text = "王飞 ，", fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
                                }

                                Spacer(modifier = Modifier.width(16.dp))
                            }

                            // Slot 1 (receives first chip)
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Row(verticalAlignment = Alignment.Bottom) {
                                    if (selectedChips.isNotEmpty()) {
                                        val chip = selectedChips[0]
                                        val hanzi = chip.substringBefore(":")
                                        val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                        Surface(
                                            shape = RoundedCornerShape(12.dp),
                                            color = Color.White,
                                            shadowElevation = 2.dp,
                                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                            modifier = Modifier.bouncyClick {
                                                if (!isSubmitted) {
                                                    selectedChips = selectedChips.toMutableList().also { it.removeAt(0) }
                                                }
                                            }
                                        ) {
                                            Column(
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                            ) {
                                                if (pinyin.isNotBlank()) {
                                                    Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                                }
                                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                            }
                                        }
                                    } else {
                                        Box(modifier = Modifier.width(50.dp).height(48.dp))
                                    }
                                    if (exercise.hasCommaAfterSlot1) {
                                        Text(
                                            text = " ，",
                                            fontFamily = KaiTiFontFamily,
                                            fontSize = 22.sp,
                                            color = DeepNavy,
                                            modifier = Modifier.padding(bottom = 6.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Box(
                                    modifier = Modifier
                                        .width(50.dp)
                                        .height(2.5.dp)
                                        .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                )
                            }

                            Spacer(modifier = Modifier.width(8.dp))

                            // Slot 2 (receives second chip)
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                if (selectedChips.size > 1) {
                                    val chip = selectedChips[1]
                                    val hanzi = chip.substringBefore(":")
                                    val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                    Surface(
                                        shape = RoundedCornerShape(12.dp),
                                        color = Color.White,
                                        shadowElevation = 2.dp,
                                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                        modifier = Modifier.bouncyClick {
                                            if (!isSubmitted) {
                                                selectedChips = selectedChips.toMutableList().also { it.removeAt(1) }
                                            }
                                        }
                                    ) {
                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                        ) {
                                            if (pinyin.isNotBlank()) {
                                                Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                            }
                                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                        }
                                    }
                                } else {
                                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Box(
                                    modifier = Modifier
                                        .width(50.dp)
                                        .height(2.5.dp)
                                        .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                )
                            }

                            // Slot 3 (if expectedSlots >= 3)
                            if (expectedSlots >= 3) {
                                Spacer(modifier = Modifier.width(8.dp))
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    if (selectedChips.size > 2) {
                                        val chip = selectedChips[2]
                                        val hanzi = chip.substringBefore(":")
                                        val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                        Surface(
                                            shape = RoundedCornerShape(12.dp),
                                            color = Color.White,
                                            shadowElevation = 2.dp,
                                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                            modifier = Modifier.bouncyClick {
                                                if (!isSubmitted) {
                                                    selectedChips = selectedChips.toMutableList().also { it.removeAt(2) }
                                                }
                                            }
                                        ) {
                                            Column(
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                            ) {
                                                if (pinyin.isNotBlank()) {
                                                    Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                                }
                                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                            }
                                        }
                                    } else {
                                        Box(modifier = Modifier.width(50.dp).height(48.dp))
                                    }
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Box(
                                        modifier = Modifier
                                            .width(50.dp)
                                            .height(2.5.dp)
                                            .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                    )
                                }
                            }

                            if (exercise.staticTrailingText.isNotBlank() && exercise.id != "u1_p1_q9") {
                                Spacer(modifier = Modifier.width(10.dp))
                                Column(horizontalAlignment = Alignment.Start) {
                                    if (exercise.staticTrailingPinyin.isNotBlank()) {
                                        Text(text = exercise.staticTrailingPinyin, fontSize = 15.sp, color = SlateGray)
                                        Spacer(modifier = Modifier.height(2.dp))
                                    }
                                    Text(text = exercise.staticTrailingText, fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
                                }
                            }
                        }

                        // Optional Line 2
                        if (exercise.hasTrailingLine2 || exercise.id == "u1_p1_q9") {
                            val line2Text = if (exercise.trailingLine2Text.isNotBlank()) exercise.trailingLine2Text else "布迪 。"
                            val line2Pinyin = if (exercise.trailingLine2Pinyin.isNotBlank()) exercise.trailingLine2Pinyin else "Bùdí"
                            Spacer(modifier = Modifier.height(20.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Start
                            ) {
                                Column(horizontalAlignment = Alignment.Start) {
                                    Text(text = line2Pinyin, fontSize = 15.sp, color = SlateGray)
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(text = line2Text, fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(if (exercise.wordChips.size > 5) 60.dp else 110.dp))

                    // Chips (1 or 2 rows)
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        val chipRows = if (exercise.id == "u1_l2_p2_q2") {
                            listOf(exercise.wordChips.take(5), exercise.wordChips.drop(5))
                        } else if (exercise.wordChips.size > 5) {
                            listOf(exercise.wordChips.take(4), exercise.wordChips.drop(4))
                        } else {
                            listOf(exercise.wordChips)
                        }

                        chipRows.forEach { rowChips ->
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
                            ) {
                                rowChips.forEach { chip ->
                                    val isUsed = selectedChips.contains(chip)
                                    val hanzi = chip.substringBefore(":")
                                    val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""

                                    val chipModifier = if (rowChips.size <= 2 && chipRows.size > 1) {
                                        Modifier.width(66.dp).height(64.dp)
                                    } else {
                                        Modifier.weight(1f).height(64.dp)
                                    }

                                    if (isUsed) {
                                        Box(
                                            modifier = chipModifier
                                                .clip(RoundedCornerShape(14.dp))
                                                .background(Color(0xFFE2E8F0))
                                        )
                                    } else {
                                        Surface(
                                            shape = RoundedCornerShape(14.dp),
                                            color = Color.White,
                                            shadowElevation = 2.dp,
                                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                            modifier = chipModifier
                                                .bouncyClick {
                                                    if (!isSubmitted && selectedChips.size < expectedSlots) {
                                                        selectedChips = selectedChips + chip
                                                        ttsManager?.speak(hanzi)
                                                    }
                                                }
                                        ) {
                                            Column(
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                verticalArrangement = Arrangement.Center,
                                                modifier = Modifier
                                                    .fillMaxSize()
                                                    .padding(horizontal = 2.dp, vertical = 4.dp)
                                            ) {
                                                if (pinyin.isNotBlank()) {
                                                    Text(
                                                        text = pinyin,
                                                        fontSize = 13.sp,
                                                        color = DeepNavy,
                                                        maxLines = 1
                                                    )
                                                }
                                                val hanziFontSize = when {
                                                    hanzi.length >= 5 -> 14.sp
                                                    hanzi.length >= 4 -> 17.sp
                                                    else -> 20.sp
                                                }
                                                Text(
                                                    text = hanzi,
                                                    fontFamily = KaiTiFontFamily,
                                                    fontSize = hanziFontSize,
                                                    fontWeight = FontWeight.Normal,
                                                    color = DeepNavy,
                                                    maxLines = 1
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
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
            }

            // EXERCISE TYPE 5: KETUK PASANGAN YANG SESUAI
            if (exercise.type == ExerciseType.MATCH_PAIRS) {
                val isFivePairs = exercise.matchPairs.size > 3
                val cardHeight = if (isFivePairs) 66.dp else 115.dp
                val pairSpacing = if (isFivePairs) 10.dp else 18.dp

                Spacer(modifier = Modifier.height(if (isFivePairs) 10.dp else 20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Left Column (Hanzi + Pinyin / Audio)
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(pairSpacing)
                    ) {
                        exercise.matchPairs.forEach { item ->
                            val isMatched = matchedPairIds.contains(item.id)
                            val isJustMatched = (lastMatchedPairId == item.id)
                            val isWrong = (wrongLeftPairId == item.id)
                            val isSelected = selectedLeftPairId == item.id

                            Surface(
                                shape = RoundedCornerShape(16.dp),
                                color = when {
                                    isWrong -> Color(0xFFFFEBEE)
                                    isJustMatched -> Color(0xFFE8F8F4)
                                    else -> Color.White
                                },
                                border = androidx.compose.foundation.BorderStroke(
                                    width = if (isSelected || isJustMatched || isWrong) 2.dp else 1.dp,
                                    color = when {
                                        isWrong -> Color(0xFFFF5252)
                                        isJustMatched -> Color(0xFF00C48C)
                                        isSelected -> Color(0xFF007AFF)
                                        isMatched -> Color(0xFFE2E8F0)
                                        else -> Color(0xFFE2E8F0)
                                    }
                                ),
                                shadowElevation = if (isSelected || isJustMatched || isWrong) 2.dp else 1.dp,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(cardHeight)
                                    .shake(trigger = isWrong)
                                    .bouncyClick {
                                        if (wrongLeftPairId != null || wrongRightPairId != null) return@bouncyClick
                                        if (!isMatched) {
                                            val speakText = if (item.audioToSpeak.isNotBlank()) item.audioToSpeak else item.hanzi
                                            if (speakText.isNotBlank()) {
                                                ttsManager?.speak(speakText)
                                            }

                                            if (selectedRightPairId != null) {
                                                val rightId = selectedRightPairId!!
                                                if (item.id == rightId) {
                                                    // Correct Match!
                                                    matchedPairIds = matchedPairIds + item.id
                                                    lastMatchedPairId = item.id
                                                    selectedLeftPairId = null
                                                    selectedRightPairId = null
                                                } else {
                                                    // Wrong Match!
                                                    wrongLeftPairId = item.id
                                                    wrongRightPairId = rightId
                                                    selectedLeftPairId = null
                                                    selectedRightPairId = null
                                                    hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
                                                    coroutineScope.launch {
                                                        delay(600)
                                                        wrongLeftPairId = null
                                                        wrongRightPairId = null
                                                    }
                                                }
                                            } else {
                                                selectedLeftPairId = item.id
                                            }
                                        }
                                    }
                            ) {
                                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                    if (item.isAudioOnly && !isMatched) {
                                        Icon(
                                            imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                                            contentDescription = "Audio",
                                            tint = when {
                                                isWrong -> Color(0xFFFF5252)
                                                isSelected -> Color(0xFF007AFF)
                                                else -> DeepNavy
                                            },
                                            modifier = Modifier.size(34.dp)
                                        )
                                    } else {
                                        Column(
                                            horizontalAlignment = Alignment.CenterHorizontally,
                                            verticalArrangement = Arrangement.Center,
                                            modifier = Modifier.fillMaxSize()
                                        ) {
                                            Text(
                                                text = item.pinyin,
                                                fontSize = if (isFivePairs) 13.sp else 15.sp,
                                                fontWeight = FontWeight.Normal,
                                                color = when {
                                                    isWrong -> Color(0xFFFF5252)
                                                    isJustMatched -> Color(0xFF00B386)
                                                    isMatched -> Color(0xFFB0BEC5)
                                                    isSelected -> Color(0xFF007AFF)
                                                    else -> SlateGray
                                                }
                                            )
                                            Spacer(modifier = Modifier.height(2.dp))
                                            Text(
                                                text = item.hanzi,
                                                fontFamily = KaiTiFontFamily,
                                                fontSize = if (isFivePairs) 21.sp else 26.sp,
                                                fontWeight = FontWeight.Normal,
                                                color = when {
                                                    isWrong -> Color(0xFFFF5252)
                                                    isJustMatched -> Color(0xFF00B386)
                                                    isMatched -> Color(0xFFB0BEC5)
                                                    isSelected -> Color(0xFF007AFF)
                                                    else -> DeepNavy
                                                }
                                            )
                                        }
                                    }

                                    if (isJustMatched) {
                                        Text(
                                            text = "✦",
                                            color = Color(0xFF00C48C).copy(alpha = 0.7f),
                                            fontSize = 12.sp,
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(top = 4.dp, end = 6.dp)
                                        )
                                        Text(
                                            text = "✦",
                                            color = Color(0xFF00C48C).copy(alpha = 0.7f),
                                            fontSize = 10.sp,
                                            modifier = Modifier
                                                .align(Alignment.BottomStart)
                                                .padding(bottom = 4.dp, start = 6.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }

                    // Right Column (Translations)
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(pairSpacing)
                    ) {
                        shuffledRightPairs.forEach { item ->
                            val isMatched = matchedPairIds.contains(item.id)
                            val isJustMatched = (lastMatchedPairId == item.id)
                            val isWrong = (wrongRightPairId == item.id)
                            val isSelected = selectedRightPairId == item.id

                            Surface(
                                shape = RoundedCornerShape(16.dp),
                                color = when {
                                    isWrong -> Color(0xFFFFEBEE)
                                    isJustMatched -> Color(0xFFE8F8F4)
                                    else -> Color.White
                                },
                                border = androidx.compose.foundation.BorderStroke(
                                    width = if (isSelected || isJustMatched || isWrong) 2.dp else 1.dp,
                                    color = when {
                                        isWrong -> Color(0xFFFF5252)
                                        isJustMatched -> Color(0xFF00C48C)
                                        isSelected -> Color(0xFF007AFF)
                                        isMatched -> Color(0xFFE2E8F0)
                                        else -> Color(0xFFE2E8F0)
                                    }
                                ),
                                shadowElevation = if (isSelected || isJustMatched || isWrong) 2.dp else 1.dp,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(cardHeight)
                                    .shake(trigger = isWrong)
                                    .bouncyClick {
                                        if (wrongLeftPairId != null || wrongRightPairId != null) return@bouncyClick
                                        if (!isMatched) {
                                            if (selectedLeftPairId != null) {
                                                val leftId = selectedLeftPairId!!
                                                if (item.id == leftId) {
                                                    // Correct Match!
                                                    matchedPairIds = matchedPairIds + item.id
                                                    lastMatchedPairId = item.id
                                                    selectedLeftPairId = null
                                                    selectedRightPairId = null
                                                } else {
                                                    // Wrong Match!
                                                    wrongLeftPairId = leftId
                                                    wrongRightPairId = item.id
                                                    selectedLeftPairId = null
                                                    selectedRightPairId = null
                                                    hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
                                                    coroutineScope.launch {
                                                        delay(600)
                                                        wrongLeftPairId = null
                                                        wrongRightPairId = null
                                                    }
                                                }
                                            } else {
                                                selectedRightPairId = item.id
                                            }
                                        }
                                    }
                            ) {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = item.translation,
                                        fontSize = if (isFivePairs) 15.sp else 18.sp,
                                        fontWeight = FontWeight.Normal,
                                        color = when {
                                            isWrong -> Color(0xFFFF5252)
                                            isJustMatched -> Color(0xFF00B386)
                                            isMatched -> Color(0xFFB0BEC5)
                                            isSelected -> Color(0xFF007AFF)
                                            else -> DeepNavy
                                        },
                                        textAlign = TextAlign.Center
                                    )

                                    if (isJustMatched) {
                                        Text(
                                            text = "✦",
                                            color = Color(0xFF00C48C).copy(alpha = 0.7f),
                                            fontSize = 12.sp,
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(top = 4.dp, end = 6.dp)
                                        )
                                        Text(
                                            text = "✦",
                                            color = Color(0xFF00C48C).copy(alpha = 0.7f),
                                            fontSize = 10.sp,
                                            modifier = Modifier
                                                .align(Alignment.BottomStart)
                                                .padding(bottom = 4.dp, start = 6.dp)
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
}

// CELEBRATION SCREEN
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
                Icon(
                    painter = painterResource(R.drawable.ic_trophy_celebration),
                    contentDescription = "Celebration",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(100.dp)
                )
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
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(imageVector = Icons.Default.Bolt, contentDescription = null, tint = Color(0xFFFFB300), modifier = Modifier.size(22.dp))
                            Icon(imageVector = Icons.Default.EmojiEvents, contentDescription = null, tint = Color(0xFFFFA000), modifier = Modifier.size(20.dp))
                        }
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
                            Icon(imageVector = Icons.Default.Timer, contentDescription = null, tint = Color(0xFF1E88E5), modifier = Modifier.size(20.dp))
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
                            Icon(painter = painterResource(R.drawable.ic_target), contentDescription = null, tint = Color.Unspecified, modifier = Modifier.size(20.dp))
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
