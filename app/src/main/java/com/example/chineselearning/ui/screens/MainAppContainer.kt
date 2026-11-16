package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.ui.components.HaloHanziNavBar
import com.example.chineselearning.ui.theme.AppBg

@Composable
fun MainAppContainer(
    ttsManager: TtsManager?
) {
    var selectedTab by remember { mutableStateOf(0) }
    var activeStory by remember { mutableStateOf<Story?>(null) }
    var activeLesson by remember { mutableStateOf<Lesson?>(null) }
    var activeNodeId by remember { mutableStateOf<String?>(null) }
    var activePartNumber by remember { mutableStateOf(1) }

    // Hoisted and saveable LazyListState to preserve exact scroll position across navigation
    val homeListState = rememberSaveable(saver = LazyListState.Saver) {
        LazyListState()
    }
    val storyListState = rememberSaveable(saver = LazyListState.Saver) {
        LazyListState()
    }

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
                activeNodeId?.let { id ->
                    val maxParts = if (activeLesson?.id == "u1_l2" || activeLesson?.id == "u1_l4" || activeNodeId == "u1_n3" || activeNodeId == "u1_n5" || activeLesson?.exercisesPart3?.isNotEmpty() == true) 3 else 2
                    com.example.chineselearning.data.repository.LearningRepository.toggleStageProgress(id, maxParts)
                }
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

    // Edge-to-edge Fullscreen container with seamless floating bottom navigation bar
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBg)
    ) {
        // Main Screen Content (flows edge-to-edge behind the floating navbar)
        Box(modifier = Modifier.fillMaxSize()) {
            when (selectedTab) {
                0 -> HomeScreen(
                    lazyListState = homeListState,
                    onSelectLesson = { lesson, nodeId ->
                        activeNodeId = nodeId
                        activePartNumber = com.example.chineselearning.data.repository.LearningRepository.getStageProgress(nodeId)
                        activeLesson = lesson
                    },
                    onSelectStory = { story -> activeStory = story }
                )
                1 -> SavedVocabScreen(ttsManager = ttsManager)
                2 -> StoryListScreen(
                    lazyListState = storyListState,
                    onSelectStory = { story -> activeStory = story }
                )
                3 -> ImersiScreen()
                4 -> ProfileScreen()
            }
        }

        // Floating rounded bottom navigation bar overlay
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
        ) {
            HaloHanziNavBar(
                selectedTab = selectedTab,
                onTabSelected = { selectedTab = it }
            )
        }
    }
}
