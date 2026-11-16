package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.chineselearning.ui.theme.AppBg

/**
 * ImersiScreen (Halaman Navbar "Imersi"):
 * Halaman kosong / clean placeholder tanpa aksi interaktif sesuai permintaan pengguna.
 */
@Composable
fun ImersiScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBg)
    )
}
