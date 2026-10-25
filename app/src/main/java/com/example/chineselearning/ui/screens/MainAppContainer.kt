package com.example.chineselearning.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.ui.components.HelloChineseNavBar

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
            // HelloChinese Exact Bottom Navbar (Screenshot 2026-10-25 210240.png)
            HelloChineseNavBar(
                selectedTab = selectedTab,
                onTabSelected = { selectedTab = it }
            )
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
