package com.example.chineselearning.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.model.Exercise
import com.example.chineselearning.data.model.MatchPairItem
import com.example.chineselearning.ui.components.bouncyClick
import com.example.chineselearning.ui.components.shake
import com.example.chineselearning.ui.theme.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun MatchPairsContent(
    exercise: Exercise,
    matchedPairIds: Set<String>,
    selectedLeftPairId: String?,
    selectedRightPairId: String?,
    lastMatchedPairId: String?,
    wrongLeftPairId: String?,
    wrongRightPairId: String?,
    shuffledRightPairs: List<MatchPairItem>,
    onMatchSuccess: (String) -> Unit,
    onMatchWrong: (String, String) -> Unit,
    onSelectLeft: (String) -> Unit,
    onSelectRight: (String) -> Unit,
    ttsManager: TtsManager?
) {
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
                                    val rightId = selectedRightPairId
                                    if (item.id == rightId) {
                                        onMatchSuccess(item.id)
                                    } else {
                                        onMatchWrong(item.id, rightId)
                                    }
                                } else {
                                    onSelectLeft(item.id)
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
                                    val leftId = selectedLeftPairId
                                    if (item.id == leftId) {
                                        onMatchSuccess(item.id)
                                    } else {
                                        onMatchWrong(leftId, item.id)
                                    }
                                } else {
                                    onSelectRight(item.id)
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
