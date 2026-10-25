package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.model.UnitCourse
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onSelectLesson: (Lesson) -> Unit,
    onSelectStory: (Story) -> Unit
) {
    val units = LearningRepository.units
    var selectedUnitForSheet by remember { mutableStateOf<UnitCourse?>(null) }

    // HelloChinese style node colors
    val nodeColors = listOf(
        NodeGreen,
        NodePink,
        NodeOrange,
        NodePurple,
        NodeCyan,
        NodeRose
    )

    // Serpentine horizontal biases: 0 = center, -1 = left, 1 = right
    val horizontalOffsets = listOf(0.dp, (-60).dp, 60.dp, (-40).dp, 40.dp, 0.dp)

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBg),
        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // HelloChinese Top Header
        item {
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            shape = CircleShape,
                            color = HelloMint,
                            modifier = Modifier.size(36.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(text = "🇨🇳", fontSize = 18.sp)
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Main Course",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = DeepNavy
                                )
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowDown,
                                    contentDescription = "Select Course",
                                    tint = SlateGray,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                            Text(
                                text = "HSK 1 - 2 Beginner Track",
                                fontSize = 11.sp,
                                color = HelloGreenDark,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }

                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = HelloMintLight,
                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFC9EEDB))
                    ) {
                        Text(
                            text = "3 Units • 3 Stories",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = HelloGreenDark,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                        )
                    }
                }
            }
        }

        // Winding Course Nodes (HelloChinese Path)
        itemsIndexed(units) { index, unit ->
            val color = nodeColors[index % nodeColors.size]
            val xOffset = horizontalOffsets[index % horizontalOffsets.size]

            // Path connector line between nodes
            if (index > 0) {
                Box(
                    modifier = Modifier
                        .height(36.dp)
                        .width(4.dp)
                        .background(
                            color = BorderGray,
                            shape = RoundedCornerShape(2.dp)
                        )
                )
            }

            // Circular Learning Node
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .offset(x = xOffset)
                    .padding(vertical = 4.dp)
            ) {
                // Outer circle button with shadow
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .shadow(elevation = 6.dp, shape = CircleShape)
                        .clip(CircleShape)
                        .background(color)
                        .border(4.dp, Color.White, CircleShape)
                        .clickable { selectedUnitForSheet = unit },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = unit.emoji,
                        fontSize = 32.sp
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))

                // Node Title Label
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = MaterialTheme.colorScheme.surface,
                    shadowElevation = 1.dp
                ) {
                    Text(
                        text = unit.title,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }

                // Level Tag
                Text(
                    text = "${unit.level} • ${unit.lessons.size} Lessons",
                    fontSize = 10.sp,
                    color = SlateGray,
                    modifier = Modifier.padding(top = 2.dp)
                )
            }
        }

        // Story Shortcut Tile at the bottom of the path
        item {
            Spacer(modifier = Modifier.height(24.dp))
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onSelectStory(units[0].story) }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(HelloMint),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "📖", fontSize = 24.sp)
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Featured Graded Story",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = HelloGreenDark
                        )
                        Text(
                            text = "《${units[0].story.titleHanzi}》",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepNavy
                        )
                        Text(
                            text = units[0].story.titleTranslation,
                            fontSize = 12.sp,
                            color = SlateGray
                        )
                    }

                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = HelloGreen
                    ) {
                        Text(
                            text = "Read",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp)
                        )
                    }
                }
            }
        }
    }

    // Modal Bottom Sheet when user taps any unit node
    if (selectedUnitForSheet != null) {
        val unit = selectedUnitForSheet!!
        ModalBottomSheet(
            onDismissRequest = { selectedUnitForSheet = null },
            containerColor = MaterialTheme.colorScheme.surface
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(46.dp)
                            .clip(CircleShape)
                            .background(HelloMint),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = unit.emoji, fontSize = 24.sp)
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = "UNIT ${unit.unitNumber}: ${unit.title}",
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
                HorizontalDivider(color = LightSlate, thickness = 1.dp)
                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "Lessons in this unit:",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = SlateGray
                )

                Spacer(modifier = Modifier.height(8.dp))

                unit.lessons.forEachIndexed { lIdx, lesson ->
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = LightSlate,
                        onClick = {
                            selectedUnitForSheet = null
                            onSelectLesson(lesson)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(30.dp)
                                    .clip(CircleShape)
                                    .background(HelloGreen),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "${lIdx + 1}",
                                    color = Color.White,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = lesson.title,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = DeepNavy
                                )
                                Text(
                                    text = lesson.subtitle,
                                    fontSize = 11.sp,
                                    color = SlateGray
                                )
                            }
                            Icon(
                                imageVector = Icons.Default.ChevronRight,
                                contentDescription = "Start",
                                tint = SlateGray
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Unit Story Action
                Surface(
                    shape = RoundedCornerShape(14.dp),
                    color = SoftAmber,
                    onClick = {
                        selectedUnitForSheet = null
                        onSelectStory(unit.story)
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "📖", fontSize = 22.sp)
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Read Graded Story: 《${unit.story.titleHanzi}》",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF7A4B00)
                            )
                            Text(
                                text = "${unit.story.titleTranslation} • Test your reading",
                                fontSize = 11.sp,
                                color = Color(0xFF9E6500)
                            )
                        }
                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = "Read",
                            tint = Color(0xFF7A4B00)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}
