package com.example.chineselearning.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.model.Word
import com.example.chineselearning.data.model.WordToken
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.theme.*

@Composable
fun WordDetailDialog(
    token: WordToken?,
    ttsManager: TtsManager?,
    onDismiss: () -> Unit
) {
    if (token == null) return

    var isSaved by remember(token) {
        mutableStateOf(LearningRepository.isWordSaved(token.hanzi))
    }

    Dialog(onDismissRequest = onDismiss) {
        Card(
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Top Action Bar inside Dialog
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = SoftMint,
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(
                            text = "Quick Dictionary",
                            color = DarkJade,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                        )
                    }

                    Row {
                        IconButton(onClick = {
                            val wordObj = Word(
                                id = "saved_${token.hanzi}",
                                hanzi = token.hanzi,
                                pinyin = token.pinyin,
                                translation = token.meaning,
                                partOfSpeech = "Vocabulary",
                                exampleHanzi = token.hanzi,
                                examplePinyin = token.pinyin,
                                exampleTranslation = token.meaning
                            )
                            isSaved = LearningRepository.toggleSaveWord(wordObj)
                        }) {
                            Icon(
                                imageVector = if (isSaved) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                                contentDescription = "Bookmark Word",
                                tint = if (isSaved) WarmAmber else SlateGray
                            )
                        }

                        IconButton(onClick = onDismiss) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Close",
                                tint = SlateGray
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Hanzi Large Character
                Text(
                    text = token.hanzi,
                    fontSize = 44.sp,
                    fontWeight = FontWeight.Bold,
                    color = HanziColor
                )

                // Pinyin
                if (token.pinyin.isNotBlank()) {
                    Text(
                        text = token.pinyin,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = JadeGreen
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Native Audio Button
                Button(
                    onClick = {
                        ttsManager?.speak(token.hanzi, speedRate = 0.8f)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = SoftMint,
                        contentColor = DarkJade
                    ),
                    shape = RoundedCornerShape(20.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                        contentDescription = "Listen",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = "Pronounce", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))
                HorizontalDivider(color = LightSlate, thickness = 1.dp)
                Spacer(modifier = Modifier.height(16.dp))

                // Definition Card
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(LightSlate)
                        .padding(14.dp)
                ) {
                    Text(
                        text = "Definition:",
                        fontSize = 12.sp,
                        color = SlateGray,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = token.meaning,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy
                    )

                    if (token.detail.isNotBlank()) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = token.detail,
                            fontSize = 13.sp,
                            color = SlateGray,
                            lineHeight = 18.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Action Buttons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Text(text = "Close")
                    }

                    Button(
                        onClick = {
                            val wordObj = Word(
                                id = "saved_${token.hanzi}",
                                hanzi = token.hanzi,
                                pinyin = token.pinyin,
                                translation = token.meaning,
                                partOfSpeech = "Vocabulary",
                                exampleHanzi = token.hanzi,
                                examplePinyin = token.pinyin,
                                exampleTranslation = token.meaning
                            )
                            isSaved = LearningRepository.toggleSaveWord(wordObj)
                        },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(14.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isSaved) WarmAmber else JadeGreen
                        )
                    ) {
                        Text(
                            text = if (isSaved) "Saved ★" else "+ Save Word",
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}
