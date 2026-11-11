package com.example.chineselearning.ui.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Backspace
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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

@Composable
fun PinyinKeyboardExercise(
    exercise: Exercise,
    typedPinyin: String,
    onKeyTyped: (String) -> Unit,
    onBackspace: () -> Unit,
    isSubmitted: Boolean,
    ttsManager: TtsManager?
) {
    // Blinking cursor animation
    val infiniteTransition = rememberInfiniteTransition(label = "cursor")
    val cursorAlpha by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(500, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "cursorAlpha"
    )

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Exercise Specific Prompts
        if (exercise.id == "u1_l5_p1_q3") {
            // Soal 3: Audio controls at top
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 28.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Large emerald speaker button
                Box(
                    modifier = Modifier
                        .size(62.dp)
                        .clip(RoundedCornerShape(18.dp))
                        .background(Color(0xFF00C48C))
                        .bouncyClick { ttsManager?.speak(exercise.audioToSpeak) },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                        contentDescription = "Audio",
                        tint = Color.White,
                        modifier = Modifier.size(32.dp)
                    )
                }

                // Mint snail button
                Box(
                    modifier = Modifier
                        .size(62.dp)
                        .clip(RoundedCornerShape(18.dp))
                        .background(Color(0xFFD4F5EC))
                        .bouncyClick { ttsManager?.speak(exercise.audioToSpeak, speedRate = 0.55f) },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_snail),
                        contentDescription = "Slow audio",
                        tint = Color(0xFF00B386),
                        modifier = Modifier.size(32.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Two-line sentence with pinyin slot
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Line 1: [Slot: 你好 / nǐhǎo] ， wǒ/我 jiào/叫 Bùdí/布迪 ， wǒ/我 shì/是
                Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start
                ) {
                    // Blank typing slot
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = typedPinyin,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = DeepNavy
                            )
                            if (!isSubmitted) {
                                Box(
                                    modifier = Modifier
                                        .width(2.dp)
                                        .height(18.dp)
                                        .background(DeepNavy.copy(alpha = cursorAlpha))
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .width(60.dp)
                                .height(2.5.dp)
                                .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "你好",
                            fontFamily = KaiTiFontFamily,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Normal,
                            color = HanziColor
                        )
                    }

                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = "，", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor, modifier = Modifier.padding(bottom = 4.dp))
                    Spacer(modifier = Modifier.width(6.dp))

                    // wǒ / 我
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "wǒ", fontSize = 14.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "我", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // jiào / 叫
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "jiào", fontSize = 14.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "叫", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Bùdí / 布迪
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Bùdí", fontSize = 14.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "布迪", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
                    }

                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = "，", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor, modifier = Modifier.padding(bottom = 4.dp))
                    Spacer(modifier = Modifier.width(6.dp))

                    // wǒ / 我
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "wǒ", fontSize = 14.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "我", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // shì / 是
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "shì", fontSize = 14.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "是", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
                    }
                }

                // Line 2: yīshēng / 医生 。
                Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Column(horizontalAlignment = Alignment.Start) {
                        Text(text = "yīshēng", fontSize = 14.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "医生 。", fontFamily = KaiTiFontFamily, fontSize = 24.sp, color = HanziColor)
                    }
                }
            }
        } else if (exercise.id == "u1_l5_p1_q7" || exercise.id == "u1_l5_p2_q7") {
            // Soal 7: Lengkapi terjemahan
            if (exercise.targetTranslation.isNotBlank()) {
                Text(
                    text = exercise.targetTranslation,
                    fontSize = 19.sp,
                    color = DeepNavy,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp, bottom = 28.dp),
                    textAlign = TextAlign.Start
                )
            }

            if (exercise.id == "u1_l5_p2_q7") {
                // tā / 她 [Slot: shì / 是] Zhōngguó / 中国 rén / 人 。
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start
                ) {
                    // tā / 她
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "tā", fontSize = 15.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "她", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor)
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    // Blank typing slot for shì above 是
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = typedPinyin,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = DeepNavy
                            )
                            if (!isSubmitted) {
                                Box(
                                    modifier = Modifier
                                        .width(2.dp)
                                        .height(18.dp)
                                        .background(DeepNavy.copy(alpha = cursorAlpha))
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .width(55.dp)
                                .height(2.5.dp)
                                .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "是",
                            fontFamily = KaiTiFontFamily,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Normal,
                            color = HanziColor
                        )
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    // Zhōngguó / 中国
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Zhōngguó", fontSize = 15.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "中国", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor)
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    // rén / 人
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "rén", fontSize = 15.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "人", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor)
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    Text(
                        text = " 。",
                        fontFamily = KaiTiFontFamily,
                        fontSize = 25.sp,
                        color = HanziColor,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                }
            } else {
                // tā / 他 [Slot: bú / 不] jiào / 叫 Bùdí / 布迪 。
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start
                ) {
                    // tā / 他
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "tā", fontSize = 15.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "他", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor)
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    // Blank typing slot for bú above 不
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = typedPinyin,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = DeepNavy
                            )
                            if (!isSubmitted) {
                                Box(
                                    modifier = Modifier
                                        .width(2.dp)
                                        .height(18.dp)
                                        .background(DeepNavy.copy(alpha = cursorAlpha))
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .width(55.dp)
                                .height(2.5.dp)
                                .background(Color(0xFF00C48C), shape = RoundedCornerShape(2.dp))
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "不",
                            fontFamily = KaiTiFontFamily,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Normal,
                            color = HanziColor
                        )
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    // jiào / 叫
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "jiào", fontSize = 15.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "叫", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor)
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    // Bùdí / 布迪
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Bùdí", fontSize = 15.sp, color = SlateGray)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "布迪", fontFamily = KaiTiFontFamily, fontSize = 25.sp, color = HanziColor)
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    Text(
                        text = " 。",
                        fontFamily = KaiTiFontFamily,
                        fontSize = 25.sp,
                        color = HanziColor,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f, fill = false))
        Spacer(modifier = Modifier.height(60.dp))

        // On-screen Pinyin Keyboard
        val keys = exercise.keyboardKeys
        val row1Keys = keys.take(6)
        val row2Keys = keys.drop(6).take(3)

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Row 1: 6 Keys
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
            ) {
                row1Keys.forEach { key ->
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = Color.White,
                        shadowElevation = 2.dp,
                        border = BorderStroke(1.dp, Color(0xFFE2E8F0)),
                        modifier = Modifier
                            .weight(1f)
                            .height(52.dp)
                            .bouncyClick {
                                if (!isSubmitted) onKeyTyped(key)
                            }
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = key,
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Medium,
                                color = DeepNavy
                            )
                        }
                    }
                }
            }

            // Row 2: 3 Keys (centered)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally)
            ) {
                row2Keys.forEach { key ->
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = Color.White,
                        shadowElevation = 2.dp,
                        border = BorderStroke(1.dp, Color(0xFFE2E8F0)),
                        modifier = Modifier
                            .width(54.dp)
                            .height(52.dp)
                            .bouncyClick {
                                if (!isSubmitted) onKeyTyped(key)
                            }
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = key,
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Medium,
                                color = DeepNavy
                            )
                        }
                    }
                }
            }

            // Row 3: Toggle '文 / A' on left, Backspace on right
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Toggle mode
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = Color(0xFFE2E8F0),
                    modifier = Modifier
                        .width(66.dp)
                        .height(48.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(
                            text = "文 / A",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = SlateGray
                        )
                    }
                }

                // Backspace
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = Color(0xFFD6DBE1),
                    modifier = Modifier
                        .width(66.dp)
                        .height(48.dp)
                        .bouncyClick {
                            if (!isSubmitted) onBackspace()
                        }
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.Backspace,
                            contentDescription = "Hapus",
                            tint = DeepNavy,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }
            }
        }
    }
}
