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
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.text.SpanStyle
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
            "u1_l3_p1_q9" -> listOf("(negara) Tiongkok", "kamu", "(pria) dia")
            "u1_l3_p2_q10" -> listOf("dokter", "tidak, bukan", "sampai jumpa,\nselamat tinggal", "(perempuan)\ndia")
            "u1_l4_p1_q6" -> listOf("(pria) dia", "(negara)\nTiongkok", "kamu")
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

    LaunchedEffect(currentExerciseIdx) {
        val ex = exercisesList.getOrNull(currentExerciseIdx)
        if (ex != null && ex.title == "Apa yang Anda dengar?" && ex.audioToSpeak.isNotBlank()) {
            delay(300)
            ttsManager?.speak(ex.audioToSpeak)
        }
    }

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
            if (exercise.title.startsWith("Buat kalimat menggunakan")) {
                val annotatedTitle = buildAnnotatedString {
                    withStyle(SpanStyle(color = DeepNavy, fontWeight = FontWeight.Bold, fontSize = 21.sp)) {
                        append("Buat kalimat menggunakan\n")
                    }
                    withStyle(SpanStyle(color = Color(0xFF7C4DFF), fontWeight = FontWeight.Bold, fontSize = 21.sp)) {
                        append("semua kata ")
                    }
                    withStyle(SpanStyle(color = DeepNavy, fontWeight = FontWeight.Bold, fontSize = 21.sp)) {
                        append("berdasarkan\ngambar")
                    }
                }
                Text(
                    text = annotatedTitle,
                    lineHeight = 27.sp,
                    modifier = Modifier.fillMaxWidth()
                )
            } else {
                Text(
                    text = exercise.title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepNavy,
                    modifier = Modifier.fillMaxWidth()
                )
            }

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
                if (exercise.illustrationRes != 0) {
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = Color(0xFFF1F5F9),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .padding(bottom = 16.dp)
                    ) {
                        Image(
                            painter = painterResource(exercise.illustrationRes),
                            contentDescription = "Prompt illustration",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                } else if (exercise.targetHanzi.isNotBlank()) {
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
                } else if (exercise.title == "Selesaikan percakapan") {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 24.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        if (exercise.dialogueBlankIsFirst) {
                            // Top: User response slot (Speaker A, left)
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.Top
                            ) {
                                Surface(
                                    shape = CircleShape,
                                    color = Color(0xFFFFD54F),
                                    modifier = Modifier.size(46.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(painter = painterResource(R.drawable.ic_person_saya), contentDescription = null, tint = Color.Unspecified, modifier = Modifier.size(30.dp))
                                    }
                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Surface(
                                    shape = RoundedCornerShape(topStart = 4.dp, topEnd = 18.dp, bottomEnd = 18.dp, bottomStart = 18.dp),
                                    color = Color.White,
                                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                    shadowElevation = 1.dp,
                                    modifier = Modifier.weight(1f, fill = false)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .defaultMinSize(minWidth = 140.dp, minHeight = 48.dp)
                                            .padding(horizontal = 16.dp, vertical = 10.dp),
                                        contentAlignment = Alignment.CenterStart
                                    ) {
                                        if (selectedOption != null) {
                                            val pinyin = selectedOption!!.substringBefore("\n")
                                            val hanzi = selectedOption!!.substringAfter("\n")
                                            Column {
                                                if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = SlateGray)
                                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 19.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                            }
                                        } else {
                                            Box(
                                                modifier = Modifier
                                                    .width(120.dp)
                                                    .height(2.5.dp)
                                                    .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                            )
                                        }
                                    }
                                }
                            }

                            // Bottom: Response from Speaker B (right)
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Surface(
                                    shape = RoundedCornerShape(topStart = 18.dp, topEnd = 4.dp, bottomEnd = 18.dp, bottomStart = 18.dp),
                                    color = Color.White,
                                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                    shadowElevation = 1.dp
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column {
                                            if (exercise.dialogueSpeakerPinyin.isNotBlank()) {
                                                Text(text = exercise.dialogueSpeakerPinyin, fontSize = 13.sp, color = SlateGray)
                                            }
                                            Text(text = exercise.dialogueSpeakerText, fontFamily = KaiTiFontFamily, fontSize = 19.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                        }
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Box(
                                            modifier = Modifier
                                                .size(36.dp)
                                                .clip(CircleShape)
                                                .background(Color(0xFF00C48C))
                                                .bouncyClick { ttsManager?.speak(exercise.audioToSpeak) },
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = "Audio", tint = Color.White, modifier = Modifier.size(20.dp))
                                        }
                                    }
                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Surface(
                                    shape = CircleShape,
                                    color = Color(0xFFFFCC80),
                                    modifier = Modifier.size(46.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(painter = painterResource(R.drawable.ic_person_murid), contentDescription = null, tint = Color.Unspecified, modifier = Modifier.size(30.dp))
                                    }
                                }
                            }
                        } else {
                            // Top: Speaker A with video thumbnail
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.Top
                            ) {
                                if (exercise.dialogueThumbnailRes != 0) {
                                    Surface(
                                        shape = RoundedCornerShape(14.dp),
                                        color = Color.Black,
                                        modifier = Modifier
                                            .width(76.dp)
                                            .height(115.dp)
                                            .clip(RoundedCornerShape(14.dp))
                                    ) {
                                        Image(
                                            painter = painterResource(exercise.dialogueThumbnailRes),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier.fillMaxSize()
                                        )
                                    }
                                    Spacer(modifier = Modifier.width(10.dp))
                                }
                                Surface(
                                    shape = RoundedCornerShape(16.dp),
                                    color = Color.White,
                                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                    shadowElevation = 1.dp,
                                    modifier = Modifier.weight(1f, fill = false)
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .size(36.dp)
                                                .clip(CircleShape)
                                                .background(Color(0xFF00C48C))
                                                .bouncyClick { ttsManager?.speak(exercise.audioToSpeak) },
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = "Audio", tint = Color.White, modifier = Modifier.size(20.dp))
                                        }
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Column {
                                            if (exercise.dialogueSpeakerPinyin.isNotBlank()) {
                                                Text(text = exercise.dialogueSpeakerPinyin, fontSize = 13.sp, color = SlateGray)
                                            }
                                            Text(text = exercise.dialogueSpeakerText, fontFamily = KaiTiFontFamily, fontSize = 19.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                        }
                                    }
                                }
                            }

                            // Bottom: Blank slot for user response (right)
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Surface(
                                    shape = RoundedCornerShape(topStart = 18.dp, topEnd = 4.dp, bottomEnd = 18.dp, bottomStart = 18.dp),
                                    color = Color(0xFFE0F2F1),
                                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF80CBC4)),
                                    modifier = Modifier.defaultMinSize(minWidth = 140.dp, minHeight = 48.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        if (selectedOption != null) {
                                            val pinyin = selectedOption!!.substringBefore("\n")
                                            val hanzi = selectedOption!!.substringAfter("\n")
                                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                                if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = SlateGray)
                                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 19.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                            }
                                        } else {
                                            Box(
                                                modifier = Modifier
                                                    .width(120.dp)
                                                    .height(2.5.dp)
                                                    .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
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

                val hasIllustration = exercise.illustrationRes != 0
                val isGrid2x2 = exercise.options.size == 4 && (hasIllustration || exercise.options.all { it.length <= 16 })

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
                                            .height(if (hasIllustration) 76.dp else 170.dp)
                                            .bouncyClick {
                                                if (!isSubmitted) {
                                                    selectedOption = opt
                                                    if (opt.contains("\n")) {
                                                        ttsManager?.speak(opt.substringAfter("\n"))
                                                    }
                                                }
                                            }
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .padding(if (hasIllustration) 8.dp else 12.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            if (hasIllustration && opt.contains("\n")) {
                                                val pinyin = opt.substringBefore("\n")
                                                val hanzi = opt.substringAfter("\n")
                                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                                    Text(
                                                        text = pinyin,
                                                        fontSize = 14.sp,
                                                        fontWeight = FontWeight.Normal,
                                                        color = DeepNavy
                                                    )
                                                    Spacer(modifier = Modifier.height(2.dp))
                                                    Text(
                                                        text = hanzi,
                                                        fontFamily = KaiTiFontFamily,
                                                        fontSize = 22.sp,
                                                        fontWeight = FontWeight.SemiBold,
                                                        color = HanziColor
                                                    )
                                                }
                                            } else {
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
                SentenceBuilderContent(
                    exercise = exercise,
                    selectedChips = selectedChips,
                    onChipAdded = { chip -> selectedChips = selectedChips + chip },
                    onChipRemovedAt = { idx -> selectedChips = selectedChips.toMutableList().also { it.removeAt(idx) } },
                    isSubmitted = isSubmitted,
                    ttsManager = ttsManager
                )
            }

            // EXERCISE TYPE 5: KETUK PASANGAN YANG SESUAI
            if (exercise.type == ExerciseType.MATCH_PAIRS) {
                MatchPairsContent(
                    exercise = exercise,
                    matchedPairIds = matchedPairIds,
                    selectedLeftPairId = selectedLeftPairId,
                    selectedRightPairId = selectedRightPairId,
                    lastMatchedPairId = lastMatchedPairId,
                    wrongLeftPairId = wrongLeftPairId,
                    wrongRightPairId = wrongRightPairId,
                    shuffledRightPairs = shuffledRightPairs,
                    onMatchSuccess = { id ->
                        matchedPairIds = matchedPairIds + id
                        lastMatchedPairId = id
                        selectedLeftPairId = null
                        selectedRightPairId = null
                    },
                    onMatchWrong = { leftId, rightId ->
                        wrongLeftPairId = leftId
                        wrongRightPairId = rightId
                        selectedLeftPairId = null
                        selectedRightPairId = null
                        hapticFeedback.performHapticFeedback(HapticFeedbackType.LongPress)
                        coroutineScope.launch {
                            delay(600)
                            wrongLeftPairId = null
                            wrongRightPairId = null
                        }
                    },
                    onSelectLeft = { id -> selectedLeftPairId = id },
                    onSelectRight = { id -> selectedRightPairId = id },
                    ttsManager = ttsManager
                )
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
