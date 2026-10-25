package com.example.chineselearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.ui.screens.MainAppContainer
import com.example.chineselearning.ui.theme.ChineseLearningTheme

class MainActivity : ComponentActivity() {

    private var ttsManager: TtsManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ttsManager = TtsManager(this)

        setContent {
            ChineseLearningTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainAppContainer(ttsManager = ttsManager)
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        ttsManager?.shutdown()
        ttsManager = null
    }
}
