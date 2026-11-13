package com.example.chineselearning.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.repository.HskWord
import com.example.chineselearning.data.repository.hsk1VocabularyList
import com.example.chineselearning.ui.components.bouncyClick
import com.example.chineselearning.ui.theme.*

@Composable
fun SavedVocabScreen(
    ttsManager: TtsManager?
) {
    var searchQuery by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("Semua") }
    var detailWord by remember { mutableStateOf<HskWord?>(null) }

    val categories = remember {
        listOf("Semua", "Kata Benda", "Kata Kerja", "Kata Sifat", "Kata Ganti", "Angka", "Satuan", "Keterangan", "Partikel")
    }

    val filteredList by remember(searchQuery, selectedCategory) {
        derivedStateOf {
            hsk1VocabularyList.filter { word ->
                val matchesCategory = if (selectedCategory == "Semua") {
                    true
                } else {
                    word.category.contains(selectedCategory, ignoreCase = true)
                }

                val query = searchQuery.trim().lowercase()
                val matchesQuery = if (query.isBlank()) {
                    true
                } else {
                    word.hanzi.contains(query) ||
                            word.pinyin.lowercase().contains(query) ||
                            word.translation.lowercase().contains(query) ||
                            word.englishMeaning.lowercase().contains(query) ||
                            word.id.toString() == query
                }

                matchesCategory && matchesQuery
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBg)
            .statusBarsPadding()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(14.dp))

            // 1. HEADER (Title, Subtitle, Count Badge in Pastel Yellow)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Kosakata HSK 1",
                        fontFamily = PlusJakartaSansFontFamily,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "150 Kosakata Standar Resmi Level 1",
                        fontFamily = NunitoFontFamily,
                        fontSize = 13.sp,
                        color = SlateGray
                    )
                }

                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = PastelYellow,
                    border = BorderStroke(1.dp, PastelYellowBorder)
                ) {
                    Text(
                        text = "${filteredList.size} / 150",
                        fontFamily = NunitoFontFamily,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = PastelYellowText,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // 2. SEARCH BAR
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                placeholder = {
                    Text(
                        text = "Cari Hanzi, Pinyin, atau Arti...",
                        fontFamily = NunitoFontFamily,
                        fontSize = 13.5.sp,
                        color = SlateGray
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        tint = SlateGray,
                        modifier = Modifier.size(20.dp)
                    )
                },
                trailingIcon = {
                    if (searchQuery.isNotBlank()) {
                        IconButton(onClick = { searchQuery = "" }) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Clear",
                                tint = SlateGray,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                },
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedBorderColor = PastelBlueBrand,
                    unfocusedBorderColor = BorderGray,
                    cursorColor = PastelBlueBrand
                ),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(12.dp))

            // 3. CATEGORY FILTER CHIPS (Pastel Blue & Yellow Accents)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                categories.forEach { cat ->
                    val isSelected = selectedCategory == cat
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = if (isSelected) PastelBlue else Color.White,
                        border = BorderStroke(1.dp, if (isSelected) PastelBlueBorder else BorderGray),
                        shadowElevation = if (isSelected) 2.dp else 0.5.dp,
                        modifier = Modifier.bouncyClick(scaleDown = 0.94f) {
                            selectedCategory = cat
                        }
                    ) {
                        Text(
                            text = cat,
                            fontFamily = NunitoFontFamily,
                            fontSize = 12.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                            color = if (isSelected) PastelBlueText else DeepNavy,
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 7.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // 4. KOTAK-KOTAK KECIL GRID (150 KOSAKATA HSK 1)
            if (filteredList.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Kata tidak ditemukan",
                            fontFamily = NunitoFontFamily,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepNavy
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Coba gunakan kata kunci pencarian yang lain.",
                            fontFamily = NunitoFontFamily,
                            fontSize = 13.sp,
                            color = SlateGray
                        )
                    }
                }
            } else {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(bottom = 90.dp)
                ) {
                    items(
                        items = filteredList,
                        key = { it.id }
                    ) { word ->
                        HskWordSmallTile(
                            word = word,
                            onClick = {
                                ttsManager?.speak(word.hanzi)
                                detailWord = word
                            }
                        )
                    }
                }
            }
        }

        // 5. DETAIL POPUP DIALOG
        detailWord?.let { word ->
            HskWordDetailDialog(
                word = word,
                onDismiss = { detailWord = null },
                onSpeak = { ttsManager?.speak(word.hanzi) }
            )
        }
    }
}

/**
 * HskWordSmallTile:
 * Kotak kecil per kata dalam 3-kolom grid (Desain Kartu Mini)
 */
@Composable
private fun HskWordSmallTile(
    word: HskWord,
    onClick: () -> Unit
) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        border = BorderStroke(1.dp, BorderGray),
        shadowElevation = 1.dp,
        modifier = Modifier
            .fillMaxWidth()
            .bouncyClick(scaleDown = 0.95f, onClick = onClick)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header Bar: ID Number & Audio Speaker Icon
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "#${word.id}",
                    fontFamily = NunitoFontFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    color = SlateGray.copy(alpha = 0.7f)
                )

                Icon(
                    imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                    contentDescription = "Audio",
                    tint = PastelBlueBrand.copy(alpha = 0.65f),
                    modifier = Modifier.size(14.dp)
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            // Karakter Hanzi (Kaiti calligraphy)
            Text(
                text = word.hanzi,
                fontFamily = KaiTiFontFamily,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = DeepNavy,
                textAlign = TextAlign.Center,
                maxLines = 1
            )

            Spacer(modifier = Modifier.height(2.dp))

            // Pinyin
            Text(
                text = word.pinyin,
                fontFamily = NunitoFontFamily,
                fontSize = 11.5.sp,
                fontWeight = FontWeight.SemiBold,
                color = PastelBlueBrand,
                textAlign = TextAlign.Center,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(3.dp))

            // Arti Terjemahan Bahasa Indonesia
            Text(
                text = word.translation,
                fontFamily = NunitoFontFamily,
                fontSize = 10.5.sp,
                fontWeight = FontWeight.Normal,
                color = DeepNavy.copy(alpha = 0.85f),
                textAlign = TextAlign.Center,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

/**
 * HskWordDetailDialog:
 * Dialog detail ketika kotak kecil kosakata disentuh.
 */
@Composable
private fun HskWordDetailDialog(
    word: HskWord,
    onDismiss: () -> Unit,
    onSpeak: () -> Unit
) {
    Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(24.dp),
            color = Color.White,
            shadowElevation = 16.dp,
            border = BorderStroke(1.2.dp, BorderGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Top Category & Number
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = PastelPink,
                        border = BorderStroke(1.dp, PastelPinkBorder)
                    ) {
                        Text(
                            text = word.category,
                            fontFamily = NunitoFontFamily,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = PastelPinkText,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                        )
                    }

                    Text(
                        text = "HSK 1 • #${word.id}",
                        fontFamily = NunitoFontFamily,
                        fontSize = 12.sp,
                        color = SlateGray,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Spacer(modifier = Modifier.height(18.dp))

                // Big Hanzi
                Text(
                    text = word.hanzi,
                    fontFamily = KaiTiFontFamily,
                    fontSize = 54.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepNavy,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(6.dp))

                // Pinyin with Speaker Button
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = word.pinyin,
                        fontFamily = NunitoFontFamily,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = PastelBlueBrand
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    IconButton(
                        onClick = onSpeak,
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(PastelBlue)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                            contentDescription = "Speak",
                            tint = PastelBlueBrand,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))
                HorizontalDivider(color = BorderGray, thickness = 1.dp)
                Spacer(modifier = Modifier.height(18.dp))

                // Meaning Details
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Bahasa Indonesia",
                            fontFamily = NunitoFontFamily,
                            fontSize = 12.5.sp,
                            color = SlateGray
                        )
                        Text(
                            text = word.translation,
                            fontFamily = NunitoFontFamily,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepNavy,
                            textAlign = TextAlign.End
                        )
                    }

                    if (word.englishMeaning.isNotBlank()) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "English",
                                fontFamily = NunitoFontFamily,
                                fontSize = 12.5.sp,
                                color = SlateGray
                            )
                            Text(
                                text = word.englishMeaning,
                                fontFamily = NunitoFontFamily,
                                fontSize = 13.5.sp,
                                fontWeight = FontWeight.Medium,
                                color = DeepNavy,
                                textAlign = TextAlign.End
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Close Button in Pastel Blue Brand
                Button(
                    onClick = onDismiss,
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = PastelBlueBrand),
                    modifier = Modifier.fillMaxWidth().height(48.dp)
                ) {
                    Text(
                        text = "Tutup",
                        fontFamily = NunitoFontFamily,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }
}
