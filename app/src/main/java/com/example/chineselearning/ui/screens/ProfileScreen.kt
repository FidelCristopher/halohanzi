package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.chineselearning.ui.theme.AppBg

/**
 * ProfileScreen (Halaman Navbar "Saya"):
 * Halaman kosong tanpa interaksi dan UI sesuai permintaan pengguna.
 */
@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBg)
    )
}
