package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.UnitCourse
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.theme.*

@Composable
fun HomeScreen(
    onSelectLesson: (Lesson) -> Unit,
    onSelectStory: (Story) -> Unit
) {
    val units = LearningRepository.units

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBg),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // Welcome Card
        item {
            Card(
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = JadeGreen),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Text(
                        text = "你好！(Nǐ hǎo!)",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Master Mandarin Chinese naturally through structured lessons and contextual graded stories.",
                        fontSize = 13.sp,
                        color = Color.White.copy(alpha = 0.92f),
                        lineHeight = 19.sp
                    )
                }
            }
        }

        // Unit Course Cards
        items(units) { unit ->
            UnitCard(
                unit = unit,
                onSelectLesson = onSelectLesson,
                onSelectStory = onSelectStory
            )
        }
    }
}

@Composable
fun UnitCard(
    unit: UnitCourse,
    onSelectLesson: (Lesson) -> Unit,
    onSelectStory: (Story) -> Unit
) {
    Card(
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(18.dp)) {
            // Unit Header
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(CircleShape)
                        .background(SoftMint),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = unit.emoji, fontSize = 22.sp)
                }

                Spacer(modifier = Modifier.width(14.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            color = SoftMint,
                            shape = RoundedCornerShape(6.dp)
                        ) {
                            Text(
                                text = "UNIT ${unit.unitNumber} • ${unit.level}",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = DarkJade,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(
                        text = unit.title,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy
                    )
                    Text(
                        text = unit.subtitle,
                        fontSize = 12.sp,
                        color = SlateGray
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Lessons in this Unit
            unit.lessons.forEachIndexed { idx, lesson ->
                Surface(
                    shape = RoundedCornerShape(14.dp),
                    color = LightSlate,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                        .clickable { onSelectLesson(lesson) }
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.surface),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "${idx + 1}",
                                fontWeight = FontWeight.Bold,
                                color = JadeGreen,
                                fontSize = 14.sp
                            )
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = lesson.title,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 14.sp,
                                color = DeepNavy
                            )
                            Text(
                                text = lesson.subtitle,
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

            Spacer(modifier = Modifier.height(10.dp))

            // Unit Story Banner
            Surface(
                shape = RoundedCornerShape(16.dp),
                color = SoftAmber,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onSelectStory(unit.story) }
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = unit.story.coverEmoji, fontSize = 28.sp)
                    Spacer(modifier = Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Story: 《${unit.story.titleHanzi}》",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = Color(0xFF7A4B00)
                        )
                        Text(
                            text = "${unit.story.titleTranslation} • Tap to read",
                            fontSize = 11.sp,
                            color = Color(0xFF9E6500)
                        )
                    }
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = WarmAmber
                    ) {
                        Text(
                            text = "Read",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                        )
                    }
                }
            }
        }
    }
}
