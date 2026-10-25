package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.theme.*

@Composable
fun StoryListScreen(
    onSelectStory: (Story) -> Unit
) {
    val stories = LearningRepository.stories

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBg),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = SoftMint),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp)
                ) {
                    Text(
                        text = "Graded Readers Library",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = DarkJade
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Immerse yourself in stories written with controlled vocabulary tailored to your proficiency level. Tap any character for instant definitions and listen to native audio.",
                        fontSize = 12.sp,
                        color = DeepNavy,
                        lineHeight = 17.sp
                    )
                }
            }
        }

        item {
            Text(
                text = "Select a Story to Read:",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = DeepNavy
            )
        }

        items(stories) { story ->
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onSelectStory(story) }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(54.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(SoftAmber),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = story.coverEmoji, fontSize = 28.sp)
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Surface(
                                color = SoftMint,
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text(
                                    text = story.level,
                                    color = DarkJade,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "${story.estimatedReadMinutes} min read • ${story.sentences.size} sentences",
                                fontSize = 11.sp,
                                color = SlateGray
                            )
                        }

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = story.titleHanzi,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = HanziColor
                        )

                        Text(
                            text = story.titlePinyin,
                            fontSize = 13.sp,
                            color = JadeGreen,
                            fontWeight = FontWeight.Medium
                        )

                        Text(
                            text = story.titleTranslation,
                            fontSize = 12.sp,
                            color = SlateGray
                        )
                    }

                    Icon(
                        imageVector = Icons.Default.ChevronRight,
                        contentDescription = "Open",
                        tint = SlateGray
                    )
                }
            }
        }
    }
}
