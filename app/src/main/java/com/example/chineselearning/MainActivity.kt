package com.example.chineselearning

import android.graphics.Color as AndroidColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.ui.screens.MainAppContainer
import com.example.chineselearning.ui.theme.AppBg
import com.example.chineselearning.ui.theme.ChineseLearningTheme

class MainActivity : ComponentActivity() {

    private var ttsManager: TtsManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                AndroidColor.TRANSPARENT,
                AndroidColor.TRANSPARENT
            ),
            navigationBarStyle = SystemBarStyle.light(
                AndroidColor.TRANSPARENT,
                AndroidColor.TRANSPARENT
            )
        )
        ttsManager = TtsManager(this)

        setContent {
            ChineseLearningTheme(darkTheme = false) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = AppBg
                ) {
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
