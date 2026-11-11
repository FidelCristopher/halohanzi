package com.example.chineselearning.ui.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.R
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.ui.components.bouncyClick
import com.example.chineselearning.ui.theme.*

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SentenceBuilderContent(
    exercise: Exercise,
    selectedChips: List<String>,
    onChipAdded: (String) -> Unit,
    onChipRemovedAt: (Int) -> Unit,
    isSubmitted: Boolean,
    ttsManager: TtsManager?
) {
    if (exercise.isImmersiveSpeaker) {
        ImmersiveSentenceBuilder(
            exercise = exercise,
            selectedChips = selectedChips,
            onChipAdded = onChipAdded,
            onChipRemovedAt = onChipRemovedAt,
            isSubmitted = isSubmitted,
            ttsManager = ttsManager
        )
    } else if (exercise.illustrationRes != 0) {
        IllustrationSentenceBuilder(
            exercise = exercise,
            selectedChips = selectedChips,
            onChipAdded = onChipAdded,
            onChipRemovedAt = onChipRemovedAt,
            isSubmitted = isSubmitted,
            ttsManager = ttsManager
        )
    } else if (exercise.title == "Terjemahkan kalimat ini") {
        FullTranslationSentenceBuilder(
            exercise = exercise,
            selectedChips = selectedChips,
            onChipAdded = onChipAdded,
            onChipRemovedAt = onChipRemovedAt,
            isSubmitted = isSubmitted,
            ttsManager = ttsManager
        )
    } else {
        StandardSentenceBuilder(
            exercise = exercise,
            selectedChips = selectedChips,
            onChipAdded = onChipAdded,
            onChipRemovedAt = onChipRemovedAt,
            isSubmitted = isSubmitted,
            ttsManager = ttsManager
        )
    }
}

@Composable
fun IllustrationSentenceBuilder(
    exercise: Exercise,
    selectedChips: List<String>,
    onChipAdded: (String) -> Unit,
    onChipRemovedAt: (Int) -> Unit,
    isSubmitted: Boolean,
    ttsManager: TtsManager?
) {
    val expectedSlots = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 3
    val isBuildFromImage = exercise.title.startsWith("Buat kalimat menggunakan")

    // Top Card with Illustration
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(190.dp)
            .clip(RoundedCornerShape(20.dp))
    ) {
        Image(
            painter = painterResource(exercise.illustrationRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Floating audio buttons for "Apa yang Anda dengar?"
        if (exercise.title == "Apa yang Anda dengar?") {
            Row(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(10.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Speaker button (emerald)
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(Color(0xFF00C48C))
                        .bouncyClick {
                            ttsManager?.speak(exercise.audioToSpeak)
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                        contentDescription = "Audio",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                }

                // Snail button (mint)
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(Color(0xFFD4F5EC))
                        .bouncyClick {
                            ttsManager?.speak(exercise.audioToSpeak, speedRate = 0.55f)
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_snail),
                        contentDescription = "Slow audio",
                        tint = Color(0xFF00B386),
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }

    Spacer(modifier = Modifier.height(if (isBuildFromImage) 40.dp else 24.dp))

    if (isBuildFromImage) {
        // Single teal underline drop line
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.5.dp)
                    .align(Alignment.BottomCenter)
                    .background(Color(0xFF80CBC4))
            )

            // Placed chips
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterStart)
                    .padding(horizontal = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
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
                            if (!isSubmitted) onChipRemovedAt(idx)
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
                }
            }
        }
    } else {
        // Line with slots: [Slot 1] , [Slot 2] [Slot 3] [Trailing Text]
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
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
                                if (!isSubmitted) onChipRemovedAt(0)
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
                    if (exercise.hasCommaAfterSlot1) {
                        Text(text = " ，", fontFamily = KaiTiFontFamily, fontSize = 22.sp, color = DeepNavy, modifier = Modifier.padding(bottom = 6.dp))
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
                            if (!isSubmitted) onChipRemovedAt(1)
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

            // Slot 3
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
                                if (!isSubmitted) onChipRemovedAt(2)
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

            // Trailing text (e.g. "。" or "布迪 。")
            if (exercise.staticTrailingText.isNotBlank()) {
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
    }

    Spacer(modifier = Modifier.height(65.dp))

    // Chips
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
    ) {
        exercise.wordChips.forEach { chip ->
            val isUsed = selectedChips.contains(chip)
            val hanzi = chip.substringBefore(":")
            val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
            val isWide = hanzi.length >= 4
            val chipModifier = if (isWide) Modifier.weight(1.8f).height(64.dp) else Modifier.weight(1f).height(64.dp)

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
                    modifier = chipModifier.bouncyClick {
                        val expCount = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 3
                        if (!isSubmitted && selectedChips.size < expCount) {
                            onChipAdded(chip)
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
                            Text(text = pinyin, fontSize = 12.sp, color = DeepNavy, maxLines = 1)
                        }
                        Text(
                            text = hanzi,
                            fontFamily = KaiTiFontFamily,
                            fontSize = if (isWide) 16.sp else 20.sp,
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

@Composable
fun ImmersiveSentenceBuilder(
    exercise: Exercise,
    selectedChips: List<String>,
    onChipAdded: (String) -> Unit,
    onChipRemovedAt: (Int) -> Unit,
    isSubmitted: Boolean,
    ttsManager: TtsManager?
) {
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
        if (exercise.illustrationRes != 0) {
            Image(
                painter = painterResource(exercise.illustrationRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        } else {
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
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(14.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            if (exercise.id == "u1_l3_p1_q8") {
                // Custom layout for u1_l3_p1_q8: [Slot 0: 你] 是 [Slot 1: 中国] 人 [Slot 2: 吗] ？
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                ) {
                    // Slot 0 (你)
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
                                    if (!isSubmitted) onChipRemovedAt(0)
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

                    Spacer(modifier = Modifier.width(8.dp))

                    // Fixed: 是 (shì)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(bottom = 6.dp)
                    ) {
                        Text(text = "shì", fontSize = 14.sp, color = DeepNavy)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "是", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Slot 1 (中国)
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
                                    if (!isSubmitted) onChipRemovedAt(1)
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
                            Box(modifier = Modifier.width(62.dp).height(48.dp))
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .width(62.dp)
                                .height(2.5.dp)
                                .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Fixed: 人 (rén)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(bottom = 6.dp)
                    ) {
                        Text(text = "rén", fontSize = 14.sp, color = DeepNavy)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "人", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Slot 2 (吗)
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
                                    if (!isSubmitted) onChipRemovedAt(2)
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

                    Spacer(modifier = Modifier.width(8.dp))

                    // Fixed punctuation: ？
                    Text(
                        text = " ？",
                        fontFamily = KaiTiFontFamily,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal,
                        color = DeepNavy,
                        modifier = Modifier.padding(bottom = 6.dp)
                    )
                }
            } else if (exercise.id == "u1_l3_p2_q5") {
                // Custom layout for u1_l3_p2_q5: 我 [Slot 0: 不] 是 [Slot 1: 医生] 。
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                ) {
                    // Fixed: 我 (wǒ)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(bottom = 6.dp)
                    ) {
                        Text(text = "wǒ", fontSize = 14.sp, color = DeepNavy)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "我", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Slot 0 (不)
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
                                    if (!isSubmitted) onChipRemovedAt(0)
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

                    Spacer(modifier = Modifier.width(8.dp))

                    // Fixed: 是 (shì)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(bottom = 6.dp)
                    ) {
                        Text(text = "shì", fontSize = 14.sp, color = DeepNavy)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "是", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Slot 1 (医生)
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
                                    if (!isSubmitted) onChipRemovedAt(1)
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
                            Box(modifier = Modifier.width(62.dp).height(48.dp))
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .width(62.dp)
                                .height(2.5.dp)
                                .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                        )
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    // Fixed punctuation: 。
                    Text(
                        text = " 。",
                        fontFamily = KaiTiFontFamily,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal,
                        color = DeepNavy,
                        modifier = Modifier.padding(bottom = 6.dp)
                    )
                }
            } else if (exercise.id == "u1_l4_p1_q3") {
                // Custom layout for u1_l4_p1_q3: [Slot 0: 他] [Slot 1: 是] 学生 [Slot 2: 吗] ？
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                ) {
                    // Slot 0 (他)
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
                                modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(0) }
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                                    if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                    Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                }
                            }
                        } else {
                            Box(modifier = Modifier.width(48.dp).height(48.dp))
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(modifier = Modifier.width(48.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
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
                                modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(1) }
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                                    if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                    Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                }
                            }
                        } else {
                            Box(modifier = Modifier.width(48.dp).height(48.dp))
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(modifier = Modifier.width(48.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    // Fixed: 学生 (xuéshēng)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(bottom = 6.dp)
                    ) {
                        Text(text = "xuéshēng", fontSize = 14.sp, color = DeepNavy)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "学生", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    // Slot 2 (吗)
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
                                modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(2) }
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                                    if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                    Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                }
                            }
                        } else {
                            Box(modifier = Modifier.width(48.dp).height(48.dp))
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(modifier = Modifier.width(48.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    // Fixed punctuation: ？
                    Text(
                        text = " ？",
                        fontFamily = KaiTiFontFamily,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal,
                        color = DeepNavy,
                        modifier = Modifier.padding(bottom = 6.dp)
                    )
                }
            } else {
                val expectedImmersiveSlots = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 1
                val slot1Width = if (expectedImmersiveSlots == 1) 92.dp else if (exercise.staticLeadingText.isNotBlank()) 48.dp else 62.dp

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                ) {
                    if (exercise.staticLeadingText.isNotBlank()) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(bottom = 6.dp)
                        ) {
                            if (exercise.staticLeadingPinyin.isNotBlank()) {
                                Text(text = exercise.staticLeadingPinyin, fontSize = 14.sp, color = DeepNavy)
                                Spacer(modifier = Modifier.height(2.dp))
                            }
                            Text(text = exercise.staticLeadingText, fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
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
                                        if (!isSubmitted) onChipRemovedAt(0)
                                    }
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                                    ) {
                                        if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                        Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                    }
                                }
                            } else {
                                Box(modifier = Modifier.width(slot1Width).height(48.dp))
                            }
                            if (exercise.hasCommaAfterSlot1) {
                                Text(text = " ，", fontSize = 22.sp, color = DeepNavy, modifier = Modifier.padding(bottom = 6.dp))
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
                                        if (!isSubmitted) onChipRemovedAt(1)
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
                                Box(modifier = Modifier.width(48.dp).height(48.dp))
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Box(modifier = Modifier.width(48.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
                        }
                    }

                    if (expectedImmersiveSlots >= 3) {
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
                                        if (!isSubmitted) onChipRemovedAt(2)
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
                                Box(modifier = Modifier.width(48.dp).height(48.dp))
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Box(modifier = Modifier.width(48.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
                        }
                    }

                    if (exercise.staticTrailingText.isNotBlank()) {
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(bottom = 6.dp)
                        ) {
                            if (exercise.staticTrailingPinyin.isNotBlank()) {
                                Text(text = exercise.staticTrailingPinyin, fontSize = 14.sp, color = DeepNavy)
                                Spacer(modifier = Modifier.height(2.dp))
                            }
                            Text(text = exercise.staticTrailingText, fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
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
                val chipRows = if (exercise.id == "u1_l3_p1_q8") {
                    listOf(exercise.wordChips.take(6), exercise.wordChips.drop(6))
                } else if (exercise.wordChips.size > 5) {
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
                                    modifier = chipModifier.bouncyClick {
                                        val expCount = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 3
                                        if (!isSubmitted && selectedChips.size < expCount) {
                                            onChipAdded(chip)
                                            ttsManager?.speak(hanzi)
                                        }
                                    }
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                        modifier = Modifier.fillMaxSize().padding(horizontal = 2.dp, vertical = 4.dp)
                                    ) {
                                        if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 12.sp, color = DeepNavy, maxLines = 1)
                                        Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 20.sp, fontWeight = FontWeight.Normal, color = DeepNavy, maxLines = 1)
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
                // Snail
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFD4F5EC))
                        .bouncyClick { ttsManager?.speak(exercise.audioToSpeak, speedRate = 0.55f) },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(painter = painterResource(R.drawable.ic_snail), contentDescription = "Slow audio", tint = Color.Unspecified, modifier = Modifier.size(24.dp))
                }

                // Play
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFD4F5EC))
                        .bouncyClick { ttsManager?.speak(exercise.audioToSpeak, speedRate = 0.85f) },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(imageVector = Icons.Filled.PlayArrow, contentDescription = "Putar", tint = Color(0xFF00B386), modifier = Modifier.size(28.dp))
                }

                // Chevron Down
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFD4F5EC))
                        .bouncyClick { ttsManager?.speak(exercise.audioToSpeak, speedRate = 0.85f) },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(imageVector = Icons.Filled.KeyboardArrowDown, contentDescription = "Menu", tint = Color(0xFF00B386), modifier = Modifier.size(28.dp))
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FullTranslationSentenceBuilder(
    exercise: Exercise,
    selectedChips: List<String>,
    onChipAdded: (String) -> Unit,
    onChipRemovedAt: (Int) -> Unit,
    isSubmitted: Boolean,
    ttsManager: TtsManager?
) {
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
            Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = "Dengarkan", tint = Color.White, modifier = Modifier.size(28.dp))
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = exercise.targetTranslation, fontSize = 20.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
    }

    Spacer(modifier = Modifier.height(10.dp))

    // 2-Line underline drop zone
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly) {
            Spacer(modifier = Modifier.weight(1f))
            Box(modifier = Modifier.fillMaxWidth().height(1.5.dp).background(Color(0xFF80CBC4)))
            Spacer(modifier = Modifier.weight(1f))
            Box(modifier = Modifier.fillMaxWidth().height(1.5.dp).background(Color(0xFF80CBC4)))
        }

        FlowRow(
            modifier = Modifier.fillMaxSize().padding(horizontal = 4.dp, vertical = 2.dp),
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
                        if (!isSubmitted) onChipRemovedAt(idx)
                    }
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
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
                    val chipModifier = if (isWide) Modifier.weight(1.8f).height(64.dp) else Modifier.weight(1f).height(64.dp)

                    if (isUsed) {
                        Box(modifier = chipModifier.clip(RoundedCornerShape(14.dp)).background(Color(0xFFE2E8F0)))
                    } else {
                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = Color.White,
                            shadowElevation = 2.dp,
                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                            modifier = chipModifier.bouncyClick {
                                val expectedCount = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 4
                                if (!isSubmitted && selectedChips.size < expectedCount) {
                                    onChipAdded(chip)
                                    ttsManager?.speak(hanzi)
                                }
                            }
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize().padding(horizontal = 2.dp, vertical = 4.dp)
                            ) {
                                if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 12.sp, color = DeepNavy, maxLines = 1)
                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = if (isWide) 16.sp else 20.sp, fontWeight = FontWeight.Normal, color = DeepNavy, maxLines = 1)
                            }
                        }
                    }
                }
            }
        }
    }

    Spacer(modifier = Modifier.height(24.dp))

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
        Surface(shape = RoundedCornerShape(8.dp), color = Color(0xFFE0F2F1), modifier = Modifier.size(36.dp)) {
            Box(contentAlignment = Alignment.Center) {
                Icon(imageVector = Icons.Default.Keyboard, contentDescription = "Keyboard", tint = Color(0xFF00897B), modifier = Modifier.size(20.dp))
            }
        }
    }
}

@Composable
fun StandardSentenceBuilder(
    exercise: Exercise,
    selectedChips: List<String>,
    onChipAdded: (String) -> Unit,
    onChipRemovedAt: (Int) -> Unit,
    isSubmitted: Boolean,
    ttsManager: TtsManager?
) {
    val expectedSlots = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 2
    Text(
        text = exercise.targetTranslation,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal,
        color = DeepNavy,
        textAlign = TextAlign.Start,
        modifier = Modifier.fillMaxWidth().padding(top = 6.dp, bottom = 32.dp)
    )

    if (exercise.id == "u1_l2_p2_q4") {
        // Line 1: [Slot 0: 老师] ， 你好 ， 我 [Slot 1: 是]
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(0) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(66.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(66.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(6.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "       nǐhǎo       wǒ", fontSize = 14.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = " ， 你好 ， 我", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = HanziColor)
            }

            Spacer(modifier = Modifier.width(8.dp))

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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(1) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        // Line 2: [Slot 2: 印尼] [Slot 3: 人] 。
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(2) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(66.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(66.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(8.dp))

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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(3) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(8.dp))

            Text(text = " 。", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
        }
    } else if (exercise.id == "u1_l3_p1_q10") {
        // [Slot 0: 你] 是 学生 [Slot 1: 吗] ？
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(0) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "shì xuéshēng", fontSize = 15.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "是 学生", fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
            }

            Spacer(modifier = Modifier.width(12.dp))

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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(1) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(8.dp))

            Text(text = " ？", fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
        }
    } else if (exercise.id == "u1_l3_p2_q9") {
        // Custom layout for u1_l3_p2_q9:
        // Line 1: [Slot 0: 她] [Slot 1: 不] 是 印度尼西亚
        // Line 2: 人 。
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start
            ) {
                // Slot 0 (她)
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
                            modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(0) }
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                                if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                            }
                        }
                    } else {
                        Box(modifier = Modifier.width(50.dp).height(48.dp))
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
                }

                Spacer(modifier = Modifier.width(8.dp))

                // Slot 1 (不)
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
                            modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(1) }
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                                if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                            }
                        }
                    } else {
                        Box(modifier = Modifier.width(50.dp).height(48.dp))
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
                }

                Spacer(modifier = Modifier.width(10.dp))

                // Fixed: shì Yìndùníxīyà / 是 印度尼西亚
                Column(horizontalAlignment = Alignment.Start) {
                    Text(text = "shì  Yìndùníxīyà", fontSize = 15.sp, color = SlateGray)
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "是 印度尼西亚", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = HanziColor)
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Line 2: rén / 人 。
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start
            ) {
                Column(horizontalAlignment = Alignment.Start) {
                    Text(text = "rén", fontSize = 15.sp, color = SlateGray)
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "人 。", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = HanziColor)
                }
            }
        }
    } else if (exercise.id == "u1_l4_p1_q1") {
        // [Slot 0: 你] [Slot 1: 是] 老师 [Slot 2: 吗] ？
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
            // Slot 0 (你)
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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(0) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(1) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(12.dp))

            // Fixed: 老师 (lǎoshī)
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "lǎoshī", fontSize = 15.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "老师", fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
            }

            Spacer(modifier = Modifier.width(12.dp))

            // Slot 2 (吗)
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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(2) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(8.dp))

            Text(text = " ？", fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
        }
    } else {
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
                            modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(0) }
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                                if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                            }
                        }
                    } else {
                        Box(modifier = Modifier.width(50.dp).height(48.dp))
                    }
                    if (exercise.hasCommaAfterSlot1) {
                        Text(text = " ，", fontFamily = KaiTiFontFamily, fontSize = 22.sp, color = DeepNavy, modifier = Modifier.padding(bottom = 6.dp))
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(1) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(50.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            // Slot 3
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
                            modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(2) }
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                                if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                            }
                        }
                    } else {
                        Box(modifier = Modifier.width(50.dp).height(48.dp))
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Box(modifier = Modifier.width(50.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
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

    // Chips
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val chipRows = if (exercise.id == "u1_l3_p1_q10") {
            listOf(exercise.wordChips)
        } else if (exercise.id == "u1_l2_p2_q2") {
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
                        Box(modifier = chipModifier.clip(RoundedCornerShape(14.dp)).background(Color(0xFFE2E8F0)))
                    } else {
                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = Color.White,
                            shadowElevation = 2.dp,
                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                            modifier = chipModifier.bouncyClick {
                                val expectedCount = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 2
                                if (!isSubmitted && selectedChips.size < expectedCount) {
                                    onChipAdded(chip)
                                    ttsManager?.speak(hanzi)
                                }
                            }
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize().padding(horizontal = 2.dp, vertical = 4.dp)
                            ) {
                                if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 12.sp, color = DeepNavy, maxLines = 1)
                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 20.sp, fontWeight = FontWeight.Normal, color = DeepNavy, maxLines = 1)
                            }
                        }
                    }
                }
            }
        }
    }
}
