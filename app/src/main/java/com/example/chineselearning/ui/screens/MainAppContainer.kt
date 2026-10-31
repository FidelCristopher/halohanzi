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
import com.example.chineselearning.ui.components.HaloHanziNavBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppContainer(
    ttsManager: TtsManager?
) {
    var selectedTab by remember { mutableStateOf(0) }
    var activeStory by remember { mutableStateOf<Story?>(null) }
    var activeLesson by remember { mutableStateOf<Lesson?>(null) }
    var activeNodeId by remember { mutableStateOf<String?>(null) }
    var activePartNumber by remember { mutableStateOf(1) }

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
            partNumber = activePartNumber,
            ttsManager = ttsManager,
            onFinish = {
                activeNodeId?.let { com.example.chineselearning.data.repository.LearningRepository.toggleStageProgress(it) }
                activeLesson = null
                activeNodeId = null
            },
            onBackClick = {
                activeLesson = null
                activeNodeId = null
            }
        )
        return
    }

    Scaffold(
        bottomBar = {
            // Floating rounded bottom navigation bar
            HaloHanziNavBar(
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
                    onSelectLesson = { lesson, nodeId ->
                        activeNodeId = nodeId
                        activePartNumber = com.example.chineselearning.data.repository.LearningRepository.getStageProgress(nodeId)
                        activeLesson = lesson
                    },
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
