package com.example.chineselearning.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.chineselearning.R

// Modern, high-legibility geometric sans-serif (Plus Jakarta Sans)
val PlusJakartaSansFontFamily = FontFamily(
    Font(R.font.plus_jakarta_sans_regular, FontWeight.Normal),
    Font(R.font.plus_jakarta_sans_medium, FontWeight.Medium),
    Font(R.font.plus_jakarta_sans_semibold, FontWeight.SemiBold),
    Font(R.font.plus_jakarta_sans_bold, FontWeight.Bold),
    Font(R.font.plus_jakarta_sans_extrabold, FontWeight.ExtraBold)
)

// Primary app UI font family
val AppFontFamily = PlusJakartaSansFontFamily

// Backward compatibility alias: redirects NunitoFontFamily references directly to Plus Jakarta Sans
val NunitoFontFamily = PlusJakartaSansFontFamily

// Authentic textbook Chinese calligraphy script
val KaiTiFontFamily = FontFamily(
    Font(R.font.kai_regular, FontWeight.Normal),
    Font(R.font.kai_regular, FontWeight.Medium),
    Font(R.font.kai_regular, FontWeight.SemiBold),
    Font(R.font.kai_regular, FontWeight.Bold)
)

val Typography = Typography(
    displayLarge = TextStyle(fontFamily = PlusJakartaSansFontFamily, fontWeight = FontWeight.Normal),
    displayMedium = TextStyle(fontFamily = PlusJakartaSansFontFamily, fontWeight = FontWeight.Normal),
    displaySmall = TextStyle(fontFamily = PlusJakartaSansFontFamily, fontWeight = FontWeight.Normal),
    headlineLarge = TextStyle(fontFamily = PlusJakartaSansFontFamily, fontWeight = FontWeight.SemiBold),
    headlineMedium = TextStyle(fontFamily = PlusJakartaSansFontFamily, fontWeight = FontWeight.SemiBold),
    headlineSmall = TextStyle(fontFamily = PlusJakartaSansFontFamily, fontWeight = FontWeight.SemiBold),
    titleLarge = TextStyle(fontFamily = PlusJakartaSansFontFamily, fontWeight = FontWeight.Bold),
    titleMedium = TextStyle(fontFamily = PlusJakartaSansFontFamily, fontWeight = FontWeight.SemiBold),
    titleSmall = TextStyle(fontFamily = PlusJakartaSansFontFamily, fontWeight = FontWeight.Medium),
    bodyLarge = TextStyle(
        fontFamily = PlusJakartaSansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.3.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = PlusJakartaSansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.2.sp
    ),
    bodySmall = TextStyle(
        fontFamily = PlusJakartaSansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.3.sp
    ),
    labelLarge = TextStyle(
        fontFamily = PlusJakartaSansFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = TextStyle(
        fontFamily = PlusJakartaSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.3.sp
    ),
    labelSmall = TextStyle(
        fontFamily = PlusJakartaSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.3.sp
    )
)
