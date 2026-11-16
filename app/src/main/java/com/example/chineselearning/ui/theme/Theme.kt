package com.example.chineselearning.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = PastelBlueBrand,
    onPrimary = Color.White,
    primaryContainer = PastelBlue,
    onPrimaryContainer = PastelBlueText,
    secondary = PastelYellow,
    onSecondary = PastelYellowText,
    secondaryContainer = PastelYellow,
    onSecondaryContainer = PastelYellowText,
    tertiary = PastelPink,
    background = AppBg,
    surface = Color.White,
    onBackground = DeepNavy,
    onSurface = DeepNavy
)

private val DarkColorScheme = darkColorScheme(
    primary = PastelBlueBrand,
    onPrimary = Color.White,
    primaryContainer = PastelBlue,
    onPrimaryContainer = PastelBlueText,
    secondary = PastelYellow,
    onSecondary = PastelYellowText,
    secondaryContainer = PastelYellow,
    onSecondaryContainer = PastelYellowText,
    tertiary = PastelPink,
    background = AppBg,
    surface = Color.White,
    onBackground = DeepNavy,
    onSurface = DeepNavy
)

@Composable
fun ChineseLearningTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
