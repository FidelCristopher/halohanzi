package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.BookmarkRemove
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.theme.*

@Composable
fun SavedVocabScreen(
    ttsManager: TtsManager?
) {
    var savedWords by remember { mutableStateOf(LearningRepository.getSavedWords().toList()) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBg),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = SoftAmber),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp)
                ) {
                    Text(
                        text = "Personal Vocabulary Bank",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF7A4B00)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Words you bookmark while reading stories are stored here for convenient review and pronunciation practice anytime.",
                        fontSize = 12.sp,
                        color = DeepNavy,
                        lineHeight = 17.sp
                    )
                }
            }
        }

        if (savedWords.isEmpty()) {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "No Saved Words Yet",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Open any graded story, tap a Hanzi word you want to learn, and tap 'Save Word' to collect it here.",
                        fontSize = 13.sp,
                        color = SlateGray,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(horizontal = 24.dp)
                    )
                }
            }
        } else {
            item {
                Text(
                    text = "Saved Words (${savedWords.size}):",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepNavy
                )
            }

            items(savedWords) { word ->
                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                    modifier = Modifier.fillMaxWidth()
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

                        Row {
                            IconButton(onClick = { ttsManager?.speak(word.hanzi) }) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                                    contentDescription = "Pronounce",
                                    tint = JadeGreen
                                )
                            }

                            IconButton(
                                onClick = {
                                    LearningRepository.toggleSaveWord(word)
                                    savedWords = LearningRepository.getSavedWords().toList()
                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.BookmarkRemove,
                                    contentDescription = "Remove",
                                    tint = SlateGray
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
