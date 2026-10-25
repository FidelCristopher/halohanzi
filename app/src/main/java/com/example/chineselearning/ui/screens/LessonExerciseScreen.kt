package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.ExerciseType
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun LessonExerciseScreen(
    lesson: Lesson,
    ttsManager: TtsManager?,
    onFinish: () -> Unit,
    onBackClick: () -> Unit
) {
    var currentStep by remember { mutableStateOf(0) } // 0 = Intro kata baru & grammar, 1..N = Exercises
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
                        LinearProgressIndicator(
                            progress = { progress },
                            modifier = Modifier
                                .fillMaxWidth(0.9f)
                                .height(6.dp)
                                .clip(RoundedCornerShape(3.dp)),
                            color = JadeGreen,
                            trackColor = LightSlate,
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = "Tutup")
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
                // TAHAP 1: PENGENALAN KATA & GRAMMAR BARU
                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = SoftMint),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "💡", fontSize = 22.sp)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Tata Bahasa (Grammar Point)",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = DarkJade
                            )
                        }
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
                    text = "Kosakata Baru di Pelajaran Ini:",
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
                                        color = JadeGreen,
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
                                    containerColor = SoftMint,
                                    contentColor = DarkJade
                                )
                            ) {
                                Icon(imageVector = Icons.Default.VolumeUp, contentDescription = "Dengar")
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
                    colors = ButtonDefaults.buttonColors(containerColor = JadeGreen)
                ) {
                    Text(
                        text = "Mulai Latihan Interaktif →",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

            } else {
                // TAHAP 2: LATIHAN INTERAKTIF (EXERCISES)
                val exercise = lesson.exercises[currentExerciseIdx]

                Surface(
                    color = LightSlate,
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = when (exercise.type) {
                            ExerciseType.SENTENCE_BUILDER -> "🧩 Susun Kalimat"
                            ExerciseType.TONE_DRILL -> "🎵 Tebak Nada Mandarin"
                            ExerciseType.LISTENING -> "🎧 Latihan Menyimak (Listening)"
                            ExerciseType.MULTIPLE_CHOICE -> "✍️ Pilihan Ganda"
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

                // Kartu Target Soal & Tombol TTS
                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = SoftMint),
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
                                    color = DarkJade,
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
                                containerColor = JadeGreen,
                                contentColor = Color.White,
                                shape = CircleShape,
                                modifier = Modifier.size(46.dp)
                            ) {
                                Icon(imageVector = Icons.Default.VolumeUp, contentDescription = "Dengarkan Audio")
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Konten tipe latihan
                when (exercise.type) {
                    ExerciseType.SENTENCE_BUILDER -> {
                        // Area Kalimat yang disusun
                        Text(
                            text = "Ketuk balok kata di bawah untuk menyusun kalimat:",
                            fontSize = 13.sp,
                            color = SlateGray,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = MaterialTheme.colorScheme.surface,
                            tonalElevation = 2.dp,
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(min = 60.dp)
                                .padding(vertical = 4.dp)
                        ) {
                            FlowRow(
                                modifier = Modifier.padding(10.dp),
                                horizontalArrangement = Arrangement.spacedBy(6.dp),
                                verticalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                if (selectedChips.isEmpty()) {
                                    Text(
                                        text = "Kalimat akan tersusun di sini...",
                                        color = SlateGray,
                                        fontSize = 14.sp
                                    )
                                } else {
                                    selectedChips.forEachIndexed { cIdx, chipText ->
                                        ElevatedFilterChip(
                                            selected = true,
                                            onClick = {
                                                if (!isSubmitted) {
                                                    selectedChips = selectedChips.toMutableList().also { it.removeAt(cIdx) }
                                                }
                                            },
                                            label = {
                                                Text(text = chipText, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                                            }
                                        )
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        // Balok-balok kata yang tersedia
                        FlowRow(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            exercise.wordChips.forEach { chip ->
                                val countInSelected = selectedChips.count { it == chip }
                                val countInAvailable = exercise.wordChips.count { it == chip }
                                val isAvailable = countInSelected < countInAvailable

                                OutlinedButton(
                                    onClick = {
                                        if (isAvailable && !isSubmitted) {
                                            selectedChips = selectedChips + chip
                                            ttsManager?.speak(chip)
                                        }
                                    },
                                    enabled = isAvailable && !isSubmitted,
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Text(text = chip, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }

                    ExerciseType.TONE_DRILL, ExerciseType.MULTIPLE_CHOICE, ExerciseType.LISTENING -> {
                        // Pilihan ganda biasa
                        exercise.options.forEach { opt ->
                            val isSelected = selectedOption == opt
                            val isThisCorrect = opt == exercise.correctAnswer

                            val optBg = when {
                                !isSubmitted && isSelected -> SoftMint
                                isSubmitted && isThisCorrect -> Color(0xFFD4EDDA)
                                isSubmitted && isSelected && !isThisCorrect -> Color(0xFFF8D7DA)
                                else -> MaterialTheme.colorScheme.surface
                            }

                            Surface(
                                shape = RoundedCornerShape(14.dp),
                                color = optBg,
                                tonalElevation = 1.dp,
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
                                        }
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

                // Bottom Action Button
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
                        colors = ButtonDefaults.buttonColors(containerColor = JadeGreen)
                    ) {
                        Text(text = "Periksa Jawaban", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                } else {
                    // Feedback Jawaban Benar / Salah
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
                            Text(text = if (isCorrect) "🎉" else "💡", fontSize = 24.sp)
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = if (isCorrect) "Luar Biasa, Benar!" else "Perhatikan kembali:",
                                    fontWeight = FontWeight.Bold,
                                    color = if (isCorrect) DarkJade else RubyCoral,
                                    fontSize = 14.sp
                                )
                                Text(
                                    text = "Kunci: ${exercise.correctAnswer.replace(",", " ")}",
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
                            containerColor = if (isCorrect) JadeGreen else WarmAmber
                        )
                    ) {
                        Text(
                            text = if (currentExerciseIdx < lesson.exercises.lastIndex) "Lanjut Soal Berikutnya →" else "Selesaikan Pelajaran 🎉",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}
