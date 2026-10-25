package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.theme.HelloGreen
import com.example.chineselearning.ui.theme.HelloGreenDark
import com.example.chineselearning.ui.theme.HelloMint

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppContainer(
    ttsManager: TtsManager?
) {
    var selectedTab by remember { mutableStateOf(0) }
    var activeStory by remember { mutableStateOf<Story?>(null) }
    var activeLesson by remember { mutableStateOf<Lesson?>(null) }

    // Graded Story Reader Mode
    if (activeStory != null) {
        StoryReaderScreen(
            story = activeStory!!,
            ttsManager = ttsManager,
            onBackClick = {
                activeStory = null
            }
        )
        return
    }

    // Lesson / Exercise Mode
    if (activeLesson != null) {
        LessonExerciseScreen(
            lesson = activeLesson!!,
            ttsManager = ttsManager,
            onFinish = {
                activeLesson = null
            },
            onBackClick = {
                activeLesson = null
            }
        )
        return
    }

    Scaffold(
        bottomBar = {
            // HelloChinese 5 Tabs Bottom Bar (Screenshot 1)
            NavigationBar(
                containerColor = Color.White,
                tonalElevation = 6.dp
            ) {
                // Tab 0: Belajar
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    icon = { Icon(imageVector = Icons.Default.School, contentDescription = "Belajar") },
                    label = { Text("Belajar", fontSize = 11.sp, fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF7E57C2),
                        selectedTextColor = Color(0xFF7E57C2),
                        indicatorColor = Color(0xFFEDE7F6)
                    )
                )

                // Tab 1: Latihan
                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    icon = { Icon(imageVector = Icons.Default.FitnessCenter, contentDescription = "Latihan") },
                    label = { Text("Latihan", fontSize = 11.sp, fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF7E57C2),
                        selectedTextColor = Color(0xFF7E57C2),
                        indicatorColor = Color(0xFFEDE7F6)
                    )
                )

                // Tab 2: Cerita
                NavigationBarItem(
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 },
                    icon = { Icon(imageVector = Icons.AutoMirrored.Filled.MenuBook, contentDescription = "Cerita") },
                    label = { Text("Cerita", fontSize = 11.sp, fontWeight = if (selectedTab == 2) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF7E57C2),
                        selectedTextColor = Color(0xFF7E57C2),
                        indicatorColor = Color(0xFFEDE7F6)
                    )
                )

                // Tab 3: Imersi (with red notification badge)
                NavigationBarItem(
                    selected = selectedTab == 3,
                    onClick = { selectedTab = 3 },
                    icon = {
                        Box {
                            Icon(imageVector = Icons.Default.Chat, contentDescription = "Imersi")
                            Box(
                                modifier = Modifier
                                    .size(7.dp)
                                    .align(Alignment.TopEnd)
                                    .clip(CircleShape)
                                    .background(Color.Red)
                            )
                        }
                    },
                    label = { Text("Imersi", fontSize = 11.sp, fontWeight = if (selectedTab == 3) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF7E57C2),
                        selectedTextColor = Color(0xFF7E57C2),
                        indicatorColor = Color(0xFFEDE7F6)
                    )
                )

                // Tab 4: Saya (Profile & Saved Vocab)
                NavigationBarItem(
                    selected = selectedTab == 4,
                    onClick = { selectedTab = 4 },
                    icon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Saya") },
                    label = { Text("Saya", fontSize = 11.sp, fontWeight = if (selectedTab == 4) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF7E57C2),
                        selectedTextColor = Color(0xFF7E57C2),
                        indicatorColor = Color(0xFFEDE7F6)
                    )
                )
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (selectedTab) {
                0 -> HomeScreen(
                    onSelectLesson = { lesson -> activeLesson = lesson },
                    onSelectStory = { story -> activeStory = story }
                )
                1 -> SavedVocabScreen(ttsManager = ttsManager)
                2 -> StoryListScreen(onSelectStory = { story -> activeStory = story })
                3 -> StoryListScreen(onSelectStory = { story -> activeStory = story })
                4 -> SavedVocabScreen(ttsManager = ttsManager)
            }
        }
    }
}
