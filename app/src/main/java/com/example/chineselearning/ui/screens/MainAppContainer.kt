package com.example.chineselearning.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.School
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
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 6.dp
            ) {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    icon = { Icon(imageVector = Icons.Default.School, contentDescription = "Learn") },
                    label = { Text("Learn", fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = HelloGreenDark,
                        selectedTextColor = HelloGreenDark,
                        indicatorColor = HelloMint
                    )
                )

                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    icon = { Icon(imageVector = Icons.AutoMirrored.Filled.MenuBook, contentDescription = "Stories") },
                    label = { Text("Stories", fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = HelloGreenDark,
                        selectedTextColor = HelloGreenDark,
                        indicatorColor = HelloMint
                    )
                )

                NavigationBarItem(
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 },
                    icon = { Icon(imageVector = Icons.Default.Bookmark, contentDescription = "Saved") },
                    label = { Text("Saved", fontWeight = if (selectedTab == 2) FontWeight.Bold else FontWeight.Normal) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = HelloGreenDark,
                        selectedTextColor = HelloGreenDark,
                        indicatorColor = HelloMint
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
