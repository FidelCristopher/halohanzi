package com.example.chineselearning.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.VolumeUp
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
            containerColor = if (isActive) HighlightReading else MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = if (isActive) 3.dp else 1.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            // Header baris: nomor kalimat & tombol play audio kalimat
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(RoundedCornerShape(6.dp))
                            .background(if (isActive) JadeGreen else LightSlate),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${index + 1}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isActive) Color.White else SlateGray
                        )
                    }

                    if (isActive) {
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Sedang dibaca...",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = DarkJade
                        )
                    }
                }

                // Speaker Icon untuk baca kalimat ini saja
                FilledTonalIconButton(
                    onClick = onPlayAudio,
                    modifier = Modifier.size(32.dp),
                    colors = IconButtonDefaults.filledTonalIconButtonColors(
                        containerColor = if (isActive) JadeGreen else SoftMint,
                        contentColor = if (isActive) Color.White else DarkJade
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.VolumeUp,
                        contentDescription = "Putar Kalimat",
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Rangkaian Token Kata yang bisa di-klik satu per satu
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                sentence.tokens.forEach { token ->
                    TokenChip(
                        token = token,
                        showPinyin = showPinyin,
                        onClick = { onTokenClick(token) }
                    )
                }
            }

            // Terjemahan kalimat (dapat di-toggle)
            if (showTranslation) {
                Spacer(modifier = Modifier.height(10.dp))
                HorizontalDivider(color = LightSlate, thickness = 0.8.dp)
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = sentence.translation,
                    fontSize = 13.sp,
                    color = SlateGray,
                    lineHeight = 18.sp
                )
            }
        }
    }
}

@Composable
fun TokenChip(
    token: WordToken,
    showPinyin: Boolean,
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
            .padding(horizontal = 2.dp, vertical = 2.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(2.dp)
        ) {
            if (showPinyin && token.pinyin.isNotBlank()) {
                Text(
                    text = token.pinyin,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    color = PinyinColor
                )
            }
            Text(
                text = token.hanzi,
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
                color = HanziColor
            )
        }
    }
}
