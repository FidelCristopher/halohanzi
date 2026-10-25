package com.example.chineselearning.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.data.model.Sentence
import com.example.chineselearning.data.model.WordToken
import com.example.chineselearning.ui.theme.*

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun KaraokeSentenceCard(
    sentence: Sentence,
    index: Int,
    isActive: Boolean,
    showPinyin: Boolean,
    showTranslation: Boolean,
    onPlayAudio: () -> Unit,
    onTokenClick: (WordToken) -> Unit
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isActive) HelloMint else MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = if (isActive) 2.dp else 0.5.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 10.dp)
        ) {
            // Header: sentence status & speaker icon
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(22.dp)
                            .clip(RoundedCornerShape(6.dp))
                            .background(if (isActive) HelloGreen else LightSlate),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${index + 1}",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isActive) Color.White else SlateGray
                        )
                    }

                    if (isActive) {
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Playing...",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = HelloGreenDark
                        )
                    }
                }

                FilledTonalIconButton(
                    onClick = onPlayAudio,
                    modifier = Modifier.size(30.dp),
                    colors = IconButtonDefaults.filledTonalIconButtonColors(
                        containerColor = if (isActive) HelloGreen else LightSlate,
                        contentColor = if (isActive) Color.White else SlateGray
                    )
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                        contentDescription = "Read Sentence",
                        modifier = Modifier.size(16.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            // HelloChinese Ruby Text Flow
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                sentence.tokens.forEach { token ->
                    TokenChip(
                        token = token,
                        showPinyin = showPinyin,
                        isActive = isActive,
                        onClick = { onTokenClick(token) }
                    )
                }
            }

            // Translation line
            if (showTranslation) {
                Spacer(modifier = Modifier.height(8.dp))
                HorizontalDivider(color = if (isActive) Color(0xFFC7EEDB) else LightSlate, thickness = 0.8.dp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = sentence.translation,
                    fontSize = 13.sp,
                    color = if (isActive) DeepNavy else SlateGray,
                    lineHeight = 17.sp
                )
            }
        }
    }
}

@Composable
fun TokenChip(
    token: WordToken,
    showPinyin: Boolean,
    isActive: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }

    Surface(
        shape = RoundedCornerShape(8.dp),
        color = Color.Transparent,
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 1.dp, vertical = 1.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(1.dp)
        ) {
            if (showPinyin && token.pinyin.isNotBlank()) {
                Text(
                    text = token.pinyin,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    color = if (isActive) HelloGreenDark else PinyinColor
                )
            }
            Text(
                text = token.hanzi,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                // HelloChinese active highlight: turns vibrant green when active!
                color = if (isActive) ActiveSentenceGreen else HanziColor
            )
        }
    }
}
