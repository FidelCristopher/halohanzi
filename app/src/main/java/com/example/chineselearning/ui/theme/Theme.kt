package com.example.chineselearning.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = HelloGreen,
    onPrimary = Color.White,
    primaryContainer = HelloMint,
    onPrimaryContainer = HelloGreenDark,
    secondary = WarmAmber,
    onSecondary = Color.White,
    secondaryContainer = SoftAmber,
    onSecondaryContainer = Color(0xFF8C5300),
    tertiary = RubyCoral,
    background = AppBg,
    surface = CardBg,
    onBackground = DeepNavy,
    onSurface = DeepNavy
)

private val DarkColorScheme = darkColorScheme(
    primary = HelloGreen,
    onPrimary = Color.White,
    primaryContainer = Color(0xFF00382B),
    onPrimaryContainer = HelloMint,
    secondary = WarmAmber,
    background = Color(0xFF101820),
    surface = Color(0xFF1A232E),
    onBackground = Color(0xFFF1F5F9),
    onSurface = Color(0xFFF1F5F9)
)

@Composable
fun ChineseLearningTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
