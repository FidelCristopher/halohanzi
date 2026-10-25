package com.example.chineselearning.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.ui.theme.DarkJade
import com.example.chineselearning.ui.theme.JadeGreen
import com.example.chineselearning.ui.theme.SoftMint

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppContainer(
    ttsManager: TtsManager?
) {
    var selectedTab by remember { mutableStateOf(0) }
    var activeStory by remember { mutableStateOf<Story?>(null) }
    var activeLesson by remember { mutableStateOf<Lesson?>(null) }

    // Jika sedang di dalam mode Baca Cerita
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

    // Jika sedang di dalam mode Pelajaran / Latihan
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
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = when (selectedTab) {
                            0 -> "Belajar Mandarin"
                            1 -> "Cerita Berjenjang"
                            else -> "Kosakata Saya"
                        },
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 6.dp
            ) {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    icon = { Icon(imageVector = Icons.Default.School, contentDescription = "Kursus") },
                    label = { Text("Kursus", fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = DarkJade,
                        selectedTextColor = DarkJade,
                        indicatorColor = SoftMint
                    )
                )

                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    icon = { Icon(imageVector = Icons.Default.MenuBook, contentDescription = "Cerita") },
                    label = { Text("Cerita", fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = DarkJade,
                        selectedTextColor = DarkJade,
                        indicatorColor = SoftMint
                    )
                )

                NavigationBarItem(
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 },
                    icon = { Icon(imageVector = Icons.Default.Star, contentDescription = "Kosakata") },
                    label = { Text("Kosakata", fontWeight = if (selectedTab == 2) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = DarkJade,
                        selectedTextColor = DarkJade,
                        indicatorColor = SoftMint
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
                1 -> StoryListScreen(
                    onSelectStory = { story -> activeStory = story }
                )
                2 -> SavedVocabScreen(
                    ttsManager = ttsManager
                )
            }
        }
    }
}
