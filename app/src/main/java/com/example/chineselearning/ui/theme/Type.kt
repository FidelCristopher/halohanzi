package com.example.chineselearning.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.chineselearning.R

val NunitoFontFamily = FontFamily(
    Font(R.font.nunito_regular, FontWeight.Normal),
    Font(R.font.nunito_semibold, FontWeight.SemiBold),
    Font(R.font.nunito_bold, FontWeight.Bold)
)

val KaiTiFontFamily = FontFamily(
    Font(R.font.kai_regular, FontWeight.Normal),
    Font(R.font.kai_regular, FontWeight.Medium),
    Font(R.font.kai_regular, FontWeight.SemiBold),
    Font(R.font.kai_regular, FontWeight.Bold)
)

val Typography = Typography(
    displayLarge = TextStyle(fontFamily = NunitoFontFamily, fontWeight = FontWeight.Normal),
    displayMedium = TextStyle(fontFamily = NunitoFontFamily, fontWeight = FontWeight.Normal),
    displaySmall = TextStyle(fontFamily = NunitoFontFamily, fontWeight = FontWeight.Normal),
    headlineLarge = TextStyle(fontFamily = NunitoFontFamily, fontWeight = FontWeight.SemiBold),
    headlineMedium = TextStyle(fontFamily = NunitoFontFamily, fontWeight = FontWeight.SemiBold),
    headlineSmall = TextStyle(fontFamily = NunitoFontFamily, fontWeight = FontWeight.SemiBold),
    titleLarge = TextStyle(fontFamily = NunitoFontFamily, fontWeight = FontWeight.Bold),
    titleMedium = TextStyle(fontFamily = NunitoFontFamily, fontWeight = FontWeight.SemiBold),
    titleSmall = TextStyle(fontFamily = NunitoFontFamily, fontWeight = FontWeight.Medium),
    bodyLarge = TextStyle(
        fontFamily = NunitoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = NunitoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontFamily = NunitoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),
    labelLarge = TextStyle(
        fontFamily = NunitoFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = TextStyle(
        fontFamily = NunitoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = NunitoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
