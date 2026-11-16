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
    val expectedSlots = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 1
    val isBuildFromImage = exercise.title.startsWith("Buat kalimat menggunakan")
    val isListenAudio = exercise.title == "Apa yang Anda dengar?"
    val usesUnderlineDropZone = isBuildFromImage || isListenAudio

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

    Spacer(modifier = Modifier.height(if (usesUnderlineDropZone) 40.dp else 24.dp))

    if (usesUnderlineDropZone) {
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
    } else if (exercise.id == "u1_l4_p3_q1") {
        // [Slot 0: 她] 是 [Slot 1: 中国] 人 [Slot 2: 吗] ？
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
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
                    Box(modifier = Modifier.width(52.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(52.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(10.dp))

            // Fixed: 是 (shì)
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "shì", fontSize = 15.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "是", fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
            }

            Spacer(modifier = Modifier.width(10.dp))

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
                        modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(1) }
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(62.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(62.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(10.dp))

            // Fixed: 人 (rén)
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "rén", fontSize = 15.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "人", fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
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
                    Box(modifier = Modifier.width(52.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(52.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(8.dp))

            // Fixed: ？
            Text(
                text = " ？",
                fontFamily = KaiTiFontFamily,
                fontSize = 24.sp,
                fontWeight = FontWeight.Normal,
                color = DeepNavy,
                modifier = Modifier.padding(bottom = 6.dp)
            )
        }
    } else if (exercise.id == "u1_l4_p3_q3") {
        // [Slot 0: 他] [Slot 1: 不] 是 [Slot 2: 医生] 。
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
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

            // Fixed: 是 (shì)
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "shì", fontSize = 15.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "是", fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = HanziColor)
            }

            Spacer(modifier = Modifier.width(10.dp))

            // Slot 2 (医生)
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
                    Box(modifier = Modifier.width(62.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(62.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }

            Spacer(modifier = Modifier.width(6.dp))

            // Fixed: 。
            Text(
                text = " 。",
                fontFamily = KaiTiFontFamily,
                fontSize = 25.sp,
                fontWeight = FontWeight.Normal,
                color = DeepNavy,
                modifier = Modifier.padding(bottom = 6.dp)
            )
        }
    } else if (exercise.id == "u2_s2_p3_q3") {
        // Tā [Slot 0: 是] nǐ [Slot 1: 的] [Slot 2: 女朋友] ma
        // 她 [Slot 0: 是] 你 [Slot 1: 的] [Slot 2: 女朋友] 吗？
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            // Fixed: 她 (Tā)
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 6.dp)) {
                Text(text = "Tā", fontSize = 14.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "她", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
            }
            Spacer(modifier = Modifier.width(8.dp))

            // Slot 0 (是)
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
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(46.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(46.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }
            Spacer(modifier = Modifier.width(8.dp))

            // Fixed: 你 (nǐ)
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 6.dp)) {
                Text(text = "nǐ", fontSize = 14.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "你", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
            }
            Spacer(modifier = Modifier.width(8.dp))

            // Slot 1 (的)
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
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(46.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(46.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }
            Spacer(modifier = Modifier.width(8.dp))

            // Slot 2 (女朋友)
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
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(66.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(66.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }
            Spacer(modifier = Modifier.width(6.dp))

            // Fixed: 吗？ (ma)
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 6.dp)) {
                Text(text = "ma", fontSize = 14.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "吗？", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
            }
        }
    } else if (exercise.id == "u2_s2_p3_q6") {
        // Tā [Slot 0: 们] [Slot 1: 是] tā [Slot 2: 的] [Slot 3: 男朋友] ma
        // 他 [Slot 0: 们] [Slot 1: 是] 她 [Slot 2: 的] [Slot 3: 男朋友] 吗？
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            // Fixed: 他 (Tā)
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 6.dp)) {
                Text(text = "Tā", fontSize = 14.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "他", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
            }
            Spacer(modifier = Modifier.width(6.dp))

            // Slot 0 (们)
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
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(42.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(42.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }
            Spacer(modifier = Modifier.width(6.dp))

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
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(42.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(42.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }
            Spacer(modifier = Modifier.width(6.dp))

            // Fixed: 她 (tā)
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 6.dp)) {
                Text(text = "tā", fontSize = 14.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "她", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
            }
            Spacer(modifier = Modifier.width(6.dp))

            // Slot 2 (的)
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
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(42.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(42.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }
            Spacer(modifier = Modifier.width(6.dp))

            // Slot 3 (男朋友)
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
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp)) {
                            if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 13.sp, color = DeepNavy)
                            Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 21.sp, color = DeepNavy)
                        }
                    }
                } else {
                    Box(modifier = Modifier.width(66.dp).height(48.dp))
                }
                Spacer(modifier = Modifier.height(4.dp))
                Box(modifier = Modifier.width(66.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
            }
            Spacer(modifier = Modifier.width(6.dp))

            // Fixed: 吗？ (ma)
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 6.dp)) {
                Text(text = "ma", fontSize = 14.sp, color = SlateGray)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "吗？", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
            }
        }
    } else {
        // Line with slots: [Slot 1] , [Slot 2] [Slot 3] [Trailing Text]
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
            // Optional Leading Text
            if (exercise.staticLeadingText.isNotBlank()) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 6.dp)) {
                    if (exercise.staticLeadingPinyin.isNotBlank()) {
                        Text(text = exercise.staticLeadingPinyin, fontSize = 14.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                    }
                    Text(text = exercise.staticLeadingText, fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
                }
                Spacer(modifier = Modifier.width(8.dp))
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
            if (expectedSlots >= 2) {
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

    Spacer(modifier = Modifier.height(if (usesUnderlineDropZone) 45.dp else 40.dp))

    // Chips (1 or 2 rows)
    val chipRows = if (exercise.id == "u1_l4_p3_q5") {
        listOf(exercise.wordChips) // all 7 chips in 1 row (matches soal-kelima.jpeg)
    } else if (exercise.wordChips.size > 5) {
        listOf(exercise.wordChips.take(5), exercise.wordChips.drop(5)) // 5 in row 1, 2 in row 2 (matches soal-kedua.jpeg)
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
                horizontalArrangement = Arrangement.spacedBy(if (rowChips.size >= 7) 4.dp else 8.dp, Alignment.CenterHorizontally)
            ) {
                rowChips.forEach { chip ->
                    val isUsed = selectedChips.contains(chip)
                    val hanzi = chip.substringBefore(":")
                    val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                    val isWide = hanzi.length >= 2

                    val chipModifier = if (rowChips.size <= 2 && chipRows.size > 1) {
                        Modifier.width(66.dp).height(70.dp)
                    } else if (isWide && rowChips.size <= 5) {
                        Modifier.weight(1.5f).height(70.dp)
                    } else if (isWide && rowChips.size > 5) {
                        Modifier.weight(1.35f).height(70.dp)
                    } else {
                        Modifier.weight(1f).height(70.dp)
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
                            modifier = chipModifier.bouncyClick {
                                val expCount = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 1
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
                                    val chipPinyinSize = when {
                                        rowChips.size >= 7 -> 11.5.sp
                                        pinyin.length >= 10 -> 11.5.sp
                                        pinyin.length >= 8 -> 13.5.sp
                                        else -> 15.sp
                                    }
                                    Text(
                                        text = pinyin,
                                        fontSize = chipPinyinSize,
                                        color = DeepNavy,
                                        maxLines = 1,
                                        softWrap = false
                                    )
                                }
                                Text(
                                    text = hanzi,
                                    fontFamily = KaiTiFontFamily,
                                    fontSize = if (rowChips.size >= 7) 18.sp else if (isWide) 20.sp else 25.sp,
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
            } else if (exercise.id == "u1_l4_p2_q3") {
                // Custom layout for u1_l4_p2_q3: [Slot 0: 她] [Slot 1: 不] [Slot 2: 是] [Slot 3: 中国] [Slot 4: 人] 。
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                ) {
                    val slotDefs = listOf(
                        Triple(0, 44.dp, "tā"),
                        Triple(1, 44.dp, "bú"),
                        Triple(2, 44.dp, "shì"),
                        Triple(3, 58.dp, "Zhōngguó"),
                        Triple(4, 44.dp, "rén")
                    )

                    slotDefs.forEachIndexed { index, (slotIdx, width, _) ->
                        if (index > 0) Spacer(modifier = Modifier.width(5.dp))
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            if (selectedChips.size > slotIdx) {
                                val chip = selectedChips[slotIdx]
                                val hanzi = chip.substringBefore(":")
                                val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                                Surface(
                                    shape = RoundedCornerShape(10.dp),
                                    color = Color.White,
                                    shadowElevation = 2.dp,
                                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                    modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(slotIdx) }
                                ) {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 6.dp, vertical = 5.dp)) {
                                        if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 12.sp, color = DeepNavy)
                                        Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 19.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                    }
                                }
                            } else {
                                Box(modifier = Modifier.width(width).height(46.dp))
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Box(modifier = Modifier.width(width).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
                        }
                    }

                    Spacer(modifier = Modifier.width(4.dp))

                    Text(text = " 。", fontFamily = KaiTiFontFamily, fontSize = 22.sp, fontWeight = FontWeight.Normal, color = DeepNavy, modifier = Modifier.padding(bottom = 6.dp))
                }
            } else if (exercise.id == "u2_p1_q6") {
                // 我 [Slot 0: 们] 是 [Slot 1: 朋友] 。
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

                    // Slot 0 (们)
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

                    // Slot 1 (朋友)
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
                            Box(modifier = Modifier.width(62.dp).height(48.dp))
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(modifier = Modifier.width(62.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    Text(text = " 。", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy, modifier = Modifier.padding(bottom = 6.dp))
                }
            } else if (exercise.id == "u2_p1_q9") {
                // 你 [Slot 0: 们] 是 [Slot 1: 同学] 吗？
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                ) {
                    // Fixed: 你 (nǐ)
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(bottom = 6.dp)
                    ) {
                        Text(text = "nǐ", fontSize = 14.sp, color = DeepNavy)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "你", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Slot 0 (们)
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

                    // Slot 1 (同学)
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
                            Box(modifier = Modifier.width(62.dp).height(48.dp))
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(modifier = Modifier.width(62.dp).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    // Fixed: 吗？
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(bottom = 6.dp)
                    ) {
                        Text(text = "ma", fontSize = 14.sp, color = DeepNavy)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "吗？", fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                    }
                }
            } else {
                val expectedImmersiveSlots = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 1
                val slotWidth = if (expectedImmersiveSlots == 1) 84.dp else if (expectedImmersiveSlots >= 3) 48.dp else 56.dp

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                ) {
                    if (exercise.staticLeadingText.isNotBlank()) {
                        BuilderFixedText(exercise.staticLeadingText, exercise.staticLeadingPinyin)
                        Spacer(modifier = Modifier.width(8.dp))
                    }

                    // Slot 0
                    BuilderSlot(
                        index = 0,
                        selectedChips = selectedChips,
                        width = slotWidth,
                        hasCommaAfter = exercise.hasCommaAfterSlot1,
                        isSubmitted = isSubmitted,
                        onChipRemovedAt = onChipRemovedAt
                    )

                    // Slot 1
                    if (expectedImmersiveSlots >= 2) {
                        Spacer(modifier = Modifier.width(6.dp))
                        BuilderSlot(
                            index = 1,
                            selectedChips = selectedChips,
                            width = slotWidth,
                            isSubmitted = isSubmitted,
                            onChipRemovedAt = onChipRemovedAt
                        )
                    }

                    // Slot 2
                    if (expectedImmersiveSlots >= 3) {
                        Spacer(modifier = Modifier.width(6.dp))
                        BuilderSlot(
                            index = 2,
                            selectedChips = selectedChips,
                            width = slotWidth,
                            isSubmitted = isSubmitted,
                            onChipRemovedAt = onChipRemovedAt
                        )
                    }

                    // Slot 3
                    if (expectedImmersiveSlots >= 4) {
                        Spacer(modifier = Modifier.width(6.dp))
                        BuilderSlot(
                            index = 3,
                            selectedChips = selectedChips,
                            width = slotWidth,
                            isSubmitted = isSubmitted,
                            onChipRemovedAt = onChipRemovedAt
                        )
                    }

                    if (exercise.staticTrailingText.isNotBlank()) {
                        Spacer(modifier = Modifier.width(8.dp))
                        BuilderFixedText(exercise.staticTrailingText, exercise.staticTrailingPinyin)
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
                                Modifier.width(66.dp).height(70.dp)
                            } else {
                                Modifier.weight(1f).height(70.dp)
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
                                        val expCount = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 1
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
                                        if (pinyin.isNotBlank()) {
                                            val chipPinyinSize = when {
                                                pinyin.length >= 10 -> 11.5.sp
                                                pinyin.length >= 8 -> 13.5.sp
                                                else -> 15.sp
                                            }
                                            Text(text = pinyin, fontSize = chipPinyinSize, color = DeepNavy, maxLines = 1, softWrap = false)
                                        }
                                        Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = DeepNavy, maxLines = 1)
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
                        if (pinyin.isNotBlank()) Text(text = pinyin, fontSize = 14.5.sp, color = DeepNavy)
                        Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                    }
                }
            }
        }
    }

    Spacer(modifier = Modifier.height(50.dp))

    val chipRows = if (exercise.id == "u1_l5_p1_q6") {
        listOf(exercise.wordChips.take(5), exercise.wordChips.drop(5))
    } else if (exercise.wordChips.size > 5) {
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
                    val chipModifier = if (isWide) Modifier.weight(1.8f).height(70.dp) else Modifier.weight(1f).height(70.dp)

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
                                if (pinyin.isNotBlank()) {
                                    val chipPinyinSize = when {
                                        pinyin.length >= 10 -> 11.5.sp
                                        pinyin.length >= 8 -> 13.5.sp
                                        else -> 15.sp
                                    }
                                    Text(text = pinyin, fontSize = chipPinyinSize, color = DeepNavy, maxLines = 1, softWrap = false)
                                }
                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = if (isWide) 20.sp else 25.sp, fontWeight = FontWeight.Normal, color = DeepNavy, maxLines = 1)
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
private fun BuilderSlot(
    index: Int,
    selectedChips: List<String>,
    width: androidx.compose.ui.unit.Dp = 50.dp,
    hasCommaAfter: Boolean = false,
    isSubmitted: Boolean,
    onChipRemovedAt: (Int) -> Unit
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(verticalAlignment = Alignment.Bottom) {
            if (selectedChips.size > index) {
                val chip = selectedChips[index]
                val hanzi = chip.substringBefore(":")
                val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = Color.White,
                    shadowElevation = 2.dp,
                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                    modifier = Modifier.bouncyClick { if (!isSubmitted) onChipRemovedAt(index) }
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                    ) {
                        if (pinyin.isNotBlank()) {
                            val slotPinyinSize = when {
                                pinyin.length >= 10 -> 12.sp
                                pinyin.length >= 8 -> 13.5.sp
                                else -> 15.sp
                            }
                            Text(text = pinyin, fontSize = slotPinyinSize, color = DeepNavy, maxLines = 1, softWrap = false)
                        }
                        Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                    }
                }
            } else {
                Box(modifier = Modifier.width(width).height(54.dp))
            }
            if (hasCommaAfter) {
                Text(text = " ，", fontFamily = KaiTiFontFamily, fontSize = 22.sp, color = DeepNavy, modifier = Modifier.padding(bottom = 6.dp))
            }
        }
        Spacer(modifier = Modifier.height(4.dp))
        Box(modifier = Modifier.width(width).height(2.5.dp).background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp)))
    }
}

@Composable
private fun BuilderFixedText(
    hanzi: String,
    pinyin: String = "",
    fontSize: Int = 25,
    alignment: Alignment.Horizontal = Alignment.CenterHorizontally
) {
    val punctuationChars = "，。？！,?.!"

    // Extract leading punctuation (e.g. "， ")
    val leadingPunct = hanzi.takeWhile { it in punctuationChars || it.isWhitespace() }
    val withoutLeading = hanzi.drop(leadingPunct.length)

    // Extract trailing punctuation (e.g. " ，", " 。", "？")
    val trailingPunct = withoutLeading.takeLastWhile { it in punctuationChars || it.isWhitespace() }
    val coreHanzi = withoutLeading.dropLast(trailingPunct.length)

    // Strip trailing/leading punctuation from pinyin as well
    val cleanPinyin = pinyin.trim().trim(*punctuationChars.toCharArray()).trim()

    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    ) {
        if (leadingPunct.isNotBlank()) {
            Text(
                text = leadingPunct,
                fontFamily = KaiTiFontFamily,
                fontSize = fontSize.sp,
                fontWeight = FontWeight.Normal,
                color = HanziColor,
                modifier = Modifier.padding(bottom = 6.dp)
            )
        }
        if (coreHanzi.isNotBlank()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                if (cleanPinyin.isNotBlank()) {
                    Text(text = cleanPinyin, fontSize = 15.sp, color = SlateGray)
                    Spacer(modifier = Modifier.height(2.dp))
                }
                Text(
                    text = coreHanzi,
                    fontFamily = KaiTiFontFamily,
                    fontSize = fontSize.sp,
                    fontWeight = FontWeight.Normal,
                    color = HanziColor
                )
            }
        }
        if (trailingPunct.isNotBlank()) {
            Text(
                text = trailingPunct,
                fontFamily = KaiTiFontFamily,
                fontSize = fontSize.sp,
                fontWeight = FontWeight.Normal,
                color = HanziColor,
                modifier = Modifier.padding(bottom = 6.dp)
            )
        }
    }
}

@Composable
private fun Layout_u1_l2_p2_q4(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
        BuilderSlot(0, selectedChips, 66.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(6.dp))
        Text(text = " ，", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
        Spacer(modifier = Modifier.width(6.dp))
        BuilderFixedText("你好", "nǐhǎo", 24)
        Spacer(modifier = Modifier.width(6.dp))
        Text(text = " ，", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
        Spacer(modifier = Modifier.width(6.dp))
        BuilderFixedText("我", "wǒ", 24)
        Spacer(modifier = Modifier.width(8.dp))
        BuilderSlot(1, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
    }
    Spacer(modifier = Modifier.height(18.dp))
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
        BuilderSlot(2, selectedChips, 66.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        BuilderSlot(3, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = " 。", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
    }
}

@Composable
private fun Layout_u1_l3_p1_q10(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
        BuilderSlot(0, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(12.dp))
        BuilderFixedText("是 学生", "shì xuéshēng")
        Spacer(modifier = Modifier.width(12.dp))
        BuilderSlot(1, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = " ？", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
    }
}

@Composable
private fun Layout_u1_l3_p2_q9(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
            BuilderSlot(0, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(1, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(10.dp))
            BuilderFixedText("是 印度尼西亚", "shì  yìndùníxīyà")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            BuilderFixedText("人 。", "rén", alignment = Alignment.Start)
        }
    }
}

@Composable
private fun Layout_u1_l4_p1_q1(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
        BuilderSlot(0, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        BuilderSlot(1, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(10.dp))
        BuilderFixedText("老师", "lǎoshī")
        Spacer(modifier = Modifier.width(10.dp))
        BuilderSlot(2, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = " ？", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
    }
}

@Composable
private fun Layout_u1_l4_p2_q2(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
        BuilderFixedText("王飞 ，", "WángFēi", alignment = Alignment.Start)
        Spacer(modifier = Modifier.width(12.dp))
        BuilderSlot(0, selectedChips, 62.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = " 。", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
    }
}

@Composable
private fun Layout_u1_l5_p1_q1(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
        BuilderFixedText("布迪", "Bùdí")
        Spacer(modifier = Modifier.width(8.dp))
        BuilderSlot(0, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        BuilderSlot(1, selectedChips, 58.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        BuilderSlot(2, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(6.dp))
        Text(text = " ？", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
    }
}

@Composable
private fun Layout_u1_l5_p2_q1(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
        BuilderSlot(0, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        BuilderSlot(1, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        BuilderFixedText("王飞", "WángFēi")
        Spacer(modifier = Modifier.width(8.dp))
        BuilderSlot(2, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(6.dp))
        Text(text = " ？", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
    }
}

@Composable
private fun Layout_u1_l5_p2_q4(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
            BuilderFixedText("王飞", "WángFēi")
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(0, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(1, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(2, selectedChips, 58.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        }
        Spacer(modifier = Modifier.height(18.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
            BuilderSlot(3, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = " 。", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
        }
    }
}

@Composable
private fun Layout_u2_p1_q10(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
            BuilderFixedText("他们", "Tāmen")
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(0, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(1, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        }
        Spacer(modifier = Modifier.height(18.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
            BuilderSlot(2, selectedChips, 58.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderFixedText(" 。", "")
        }
    }
}

@Composable
private fun Layout_u1_l4_p2_q4(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
        BuilderSlot(0, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        BuilderSlot(1, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        BuilderSlot(2, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(8.dp))
        BuilderFixedText("学生", "xuéshēng")
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = " 。", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
    }
}

@Composable
private fun Layout_u2_s3_p1_q10(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
        BuilderSlot(0, selectedChips, 54.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(10.dp))
        BuilderFixedText("是 我 们 的", "shì wǒ men de")
        Spacer(modifier = Modifier.width(10.dp))
        BuilderSlot(1, selectedChips, 54.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(10.dp))
        BuilderFixedText("吗？", "ma")
    }
}

@Composable
private fun Layout_u2_s3_p2_q10(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
        BuilderFixedText("你的", "Nǐ de")
        Spacer(modifier = Modifier.width(10.dp))
        BuilderSlot(0, selectedChips, 54.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(10.dp))
        BuilderFixedText("是", "shì")
        Spacer(modifier = Modifier.width(10.dp))
        BuilderSlot(1, selectedChips, 54.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        Spacer(modifier = Modifier.width(6.dp))
        Text(text = "？", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
    }
}

@Composable
private fun Layout_u2_s4_p1_q3(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
            BuilderSlot(0, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(1, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(2, selectedChips, 54.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(10.dp))
            BuilderFixedText("的 女朋友", "de nǚpéngyou")
        }
        Spacer(modifier = Modifier.height(18.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            BuilderFixedText("吗？", "ma", alignment = Alignment.Start)
        }
    }
}

@Composable
private fun Layout_u2_s4_p1_q7(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
            BuilderSlot(0, selectedChips, 46.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderFixedText("不", "bú")
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(1, selectedChips, 46.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderFixedText("我", "wǒ")
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(2, selectedChips, 46.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderFixedText("的", "de")
        }
        Spacer(modifier = Modifier.height(18.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
            BuilderSlot(3, selectedChips, 54.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = " 。", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor, modifier = Modifier.padding(bottom = 6.dp))
        }
    }
}

@Composable
private fun Layout_u2_s4_p3_q7(selectedChips: List<String>, isSubmitted: Boolean, onChipRemovedAt: (Int) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
            BuilderSlot(0, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(10.dp))
            BuilderFixedText("是 王飞", "shì WángFēi")
            Spacer(modifier = Modifier.width(10.dp))
            BuilderSlot(1, selectedChips, 48.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(2, selectedChips, 54.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        }
        Spacer(modifier = Modifier.height(18.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            BuilderFixedText("吗？", "ma", alignment = Alignment.Start)
        }
    }
}

@Composable
private fun Layout_DefaultSlots(
    exercise: Exercise,
    selectedChips: List<String>,
    expectedSlots: Int,
    isSubmitted: Boolean,
    onChipRemovedAt: (Int) -> Unit
) {
    if (exercise.hasSlotsOnLine2) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            BuilderFixedText(exercise.staticLeadingText, exercise.staticLeadingPinyin, alignment = Alignment.Start)
        }
        Spacer(modifier = Modifier.height(20.dp))
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    ) {
        if (exercise.staticLeadingText.isNotBlank() && !exercise.hasSlotsOnLine2) {
            BuilderFixedText(exercise.staticLeadingText, exercise.staticLeadingPinyin)
            Spacer(modifier = Modifier.width(12.dp))
        } else if (exercise.id == "u1_p1_q9") {
            BuilderFixedText("你好 ，", "Nǐhǎo")
            Spacer(modifier = Modifier.width(16.dp))
            BuilderFixedText("王飞 ，", "WángFēi")
            Spacer(modifier = Modifier.width(16.dp))
        }

        // Slot 0 (Always rendered. If only 1 slot, width = 64.dp)
        val slot0Width = if (expectedSlots == 1) 64.dp else 50.dp
        BuilderSlot(0, selectedChips, slot0Width, hasCommaAfter = exercise.hasCommaAfterSlot1, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)

        // Slot 1 (Only if expectedSlots >= 2)
        if (expectedSlots >= 2) {
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(1, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        }

        // Slot 2 (Only if expectedSlots >= 3)
        if (expectedSlots >= 3) {
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(2, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        }

        // Slot 3 (Only if expectedSlots >= 4)
        if (expectedSlots >= 4) {
            Spacer(modifier = Modifier.width(8.dp))
            BuilderSlot(3, selectedChips, 50.dp, isSubmitted = isSubmitted, onChipRemovedAt = onChipRemovedAt)
        }

        if (exercise.staticTrailingText.isNotBlank() && exercise.id != "u1_p1_q9") {
            Spacer(modifier = Modifier.width(10.dp))
            BuilderFixedText(exercise.staticTrailingText, exercise.staticTrailingPinyin, alignment = Alignment.Start)
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
            BuilderFixedText(line2Text, line2Pinyin, alignment = Alignment.Start)
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
    val expectedSlots = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 1
    Text(
        text = exercise.targetTranslation,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal,
        color = DeepNavy,
        textAlign = TextAlign.Start,
        modifier = Modifier.fillMaxWidth().padding(top = 6.dp, bottom = 32.dp)
    )

    when (exercise.id) {
        "u1_l2_p2_q4" -> Layout_u1_l2_p2_q4(selectedChips, isSubmitted, onChipRemovedAt)
        "u1_l3_p1_q10" -> Layout_u1_l3_p1_q10(selectedChips, isSubmitted, onChipRemovedAt)
        "u1_l3_p2_q9" -> Layout_u1_l3_p2_q9(selectedChips, isSubmitted, onChipRemovedAt)
        "u1_l4_p1_q1" -> Layout_u1_l4_p1_q1(selectedChips, isSubmitted, onChipRemovedAt)
        "u1_l4_p2_q2" -> Layout_u1_l4_p2_q2(selectedChips, isSubmitted, onChipRemovedAt)
        "u1_l5_p1_q1" -> Layout_u1_l5_p1_q1(selectedChips, isSubmitted, onChipRemovedAt)
        "u1_l5_p2_q1" -> Layout_u1_l5_p2_q1(selectedChips, isSubmitted, onChipRemovedAt)
        "u1_l5_p2_q4" -> Layout_u1_l5_p2_q4(selectedChips, isSubmitted, onChipRemovedAt)
        "u2_p1_q10" -> Layout_u2_p1_q10(selectedChips, isSubmitted, onChipRemovedAt)
        "u1_l4_p2_q4" -> Layout_u1_l4_p2_q4(selectedChips, isSubmitted, onChipRemovedAt)
        "u2_s3_p1_q10" -> Layout_u2_s3_p1_q10(selectedChips, isSubmitted, onChipRemovedAt)
        "u2_s3_p2_q10" -> Layout_u2_s3_p2_q10(selectedChips, isSubmitted, onChipRemovedAt)
        "u2_s4_p1_q3" -> Layout_u2_s4_p1_q3(selectedChips, isSubmitted, onChipRemovedAt)
        "u2_s4_p1_q7" -> Layout_u2_s4_p1_q7(selectedChips, isSubmitted, onChipRemovedAt)
        "u2_s4_p3_q7" -> Layout_u2_s4_p3_q7(selectedChips, isSubmitted, onChipRemovedAt)
        else -> Layout_DefaultSlots(exercise, selectedChips, expectedSlots, isSubmitted, onChipRemovedAt)
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
        } else if (exercise.id == "u1_l2_p2_q2" || exercise.id == "u1_l5_p1_q1") {
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
                        Modifier.width(66.dp).height(70.dp)
                    } else {
                        Modifier.weight(1f).height(70.dp)
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
                                val expectedCount = if (exercise.correctAnswer.contains(",")) exercise.correctAnswer.split(",").size else 1
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
                                if (pinyin.isNotBlank()) {
                                    val chipPinyinSize = when {
                                        pinyin.length >= 10 -> 11.5.sp
                                        pinyin.length >= 8 -> 13.5.sp
                                        else -> 15.sp
                                    }
                                    Text(text = pinyin, fontSize = chipPinyinSize, color = DeepNavy, maxLines = 1, softWrap = false)
                                }
                                Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 25.sp, fontWeight = FontWeight.Normal, color = DeepNavy, maxLines = 1)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun DialogueBuilderExercise(
    exercise: Exercise,
    selectedChips: List<String>,
    onChipAdded: (String) -> Unit,
    onChipRemovedAt: (Int) -> Unit,
    isSubmitted: Boolean,
    ttsManager: TtsManager?
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Speaker A (User Response Drop Slot on Left)
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Surface(
                    shape = CircleShape,
                    color = Color(0xFFFFD54F),
                    modifier = Modifier.size(46.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(imageVector = Icons.Default.Face, contentDescription = null, tint = DeepNavy, modifier = Modifier.size(26.dp))
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))
                Surface(
                    shape = CircleShape,
                    color = Color(0xFFE2E8F0),
                    modifier = Modifier.size(32.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = null, tint = SlateGray, modifier = Modifier.size(18.dp))
                    }
                }
            }

            Spacer(modifier = Modifier.width(10.dp))

            // Speech bubble with drop zone
            Surface(
                shape = RoundedCornerShape(topStart = 4.dp, topEnd = 18.dp, bottomEnd = 18.dp, bottomStart = 18.dp),
                color = Color.White,
                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                shadowElevation = 1.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 12.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.5.dp)
                            .align(Alignment.BottomCenter)
                            .background(Color(0xFF80CBC4))
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterStart)
                            .padding(bottom = 6.dp),
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
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    if (pinyin.isNotBlank()) {
                                        Text(text = pinyin, fontSize = 14.5.sp, color = DeepNavy)
                                    }
                                    Text(text = hanzi, fontFamily = KaiTiFontFamily, fontSize = 24.sp, fontWeight = FontWeight.Normal, color = DeepNavy)
                                }
                            }
                        }
                    }
                }
            }
        }

        // Speaker B (Response on Right)
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Surface(
                shape = RoundedCornerShape(topStart = 18.dp, topEnd = 4.dp, bottomEnd = 18.dp, bottomStart = 18.dp),
                color = Color.White,
                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
                shadowElevation = 1.dp
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(text = "Wǒ bú shì yīshēng", fontSize = 14.sp, color = SlateGray)
                        Text(text = "我不是 医生 。", fontFamily = KaiTiFontFamily, fontSize = 20.sp, fontWeight = FontWeight.Normal, color = HanziColor)
                    }
                }
            }

            Spacer(modifier = Modifier.width(10.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Surface(
                    shape = CircleShape,
                    color = Color(0xFFFFCC80),
                    modifier = Modifier.size(46.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(painter = painterResource(R.drawable.ic_person_murid), contentDescription = null, tint = Color.Unspecified, modifier = Modifier.size(30.dp))
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))
                Surface(
                    shape = CircleShape,
                    color = Color(0xFF00C48C),
                    modifier = Modifier
                        .size(32.dp)
                        .bouncyClick { ttsManager?.speak("我不是医生。") }
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                    }
                }
            }
        }
    }

    Spacer(modifier = Modifier.height(50.dp))

    // Chips bank (4 chips in 1 row)
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
    ) {
        exercise.wordChips.forEach { chip ->
            val isUsed = selectedChips.contains(chip)
            val hanzi = chip.substringBefore(":")
            val pinyin = if (chip.contains(":")) chip.substringAfter(":") else ""
            val isWide = hanzi.length >= 2

            val chipModifier = if (isWide) Modifier.weight(1.5f).height(70.dp) else Modifier.weight(1f).height(70.dp)

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
                        if (!isSubmitted && selectedChips.size < 4) {
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
                            Text(text = pinyin, fontSize = 15.sp, color = DeepNavy, maxLines = 1)
                        }
                        Text(
                            text = hanzi,
                            fontFamily = KaiTiFontFamily,
                            fontSize = if (isWide) 20.sp else 25.sp,
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
