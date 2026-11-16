package com.example.chineselearning.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
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
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.DeleteSweep
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.chineselearning.audio.TtsManager
import com.example.chineselearning.data.repository.HskVocabularyRepository
import com.example.chineselearning.data.repository.HskWordItem
import com.example.chineselearning.ui.components.bouncyClick
import com.example.chineselearning.ui.theme.*

private val ActivePurple = Color(0xFF6A4CE4)
private val SoftPurpleBg = Color(0xFFF3EDFF)

data class HskLevelOption(
    val level: Int,
    val label: String,
    val count: Int
)

@Composable
fun SavedVocabScreen(
    ttsManager: TtsManager?
) {
    val context = LocalContext.current
    var selectedHskLevel by rememberSaveable { mutableStateOf(1) }
    var showDropdown by remember { mutableStateOf(false) }

    var searchQuery by rememberSaveable { mutableStateOf("") }
    var selectedCategory by rememberSaveable { mutableStateOf("Semua") }
    var detailWord by remember { mutableStateOf<HskWordItem?>(null) }
    var writingWord by remember { mutableStateOf<HskWordItem?>(null) }

    val levelOptions = remember {
        listOf(
            HskLevelOption(1, "New HSK 1", 300),
            HskLevelOption(2, "New HSK 2", 200),
            HskLevelOption(3, "New HSK 3", 500),
            HskLevelOption(4, "New HSK 4", 1000),
            HskLevelOption(5, "New HSK 5", 1600),
            HskLevelOption(6, "New HSK 6", 1800)
        )
    }

    // Load words for selected HSK level
    val currentLevelWords = remember(selectedHskLevel, context) {
        HskVocabularyRepository.getWordsForLevel(context, selectedHskLevel)
    }

    // Extract categories available in current level
    val categories = remember(currentLevelWords) {
        val list = mutableListOf("Semua")
        currentLevelWords.forEach { w ->
            w.category.split("/").forEach { rawCat ->
                val cat = rawCat.trim()
                if (cat.isNotBlank() && !list.contains(cat)) {
                    list.add(cat)
                }
            }
        }
        list
    }

    // Filtered words
    val filteredList by remember(currentLevelWords, searchQuery, selectedCategory) {
        derivedStateOf {
            currentLevelWords.filter { word ->
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
                            word.meaning.lowercase().contains(query) ||
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

            // 1. TOP HEADER WITH HSK LEVEL DROPDOWN SELECTOR
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Kosakata New HSK",
                        fontFamily = PlusJakartaSansFontFamily,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Standar Baru HSK 3.0 (5.400 Kata)",
                        fontFamily = NunitoFontFamily,
                        fontSize = 12.sp,
                        color = SlateGray
                    )
                }

                // DROPDOWN BUTTON
                Box {
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = Color.White,
                        border = BorderStroke(1.2.dp, ActivePurple.copy(alpha = 0.4f)),
                        shadowElevation = 2.dp,
                        modifier = Modifier.bouncyClick(scaleDown = 0.94f) {
                            showDropdown = true
                        }
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "HSK $selectedHskLevel",
                                fontFamily = NunitoFontFamily,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = ActivePurple
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Pilih HSK",
                                tint = ActivePurple,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }

                    // DROPDOWN MENU
                    DropdownMenu(
                        expanded = showDropdown,
                        onDismissRequest = { showDropdown = false },
                        modifier = Modifier.background(Color.White)
                    ) {
                        levelOptions.forEach { opt ->
                            val isCurrent = opt.level == selectedHskLevel
                            DropdownMenuItem(
                                text = {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "${opt.label} (${opt.count} Kata)",
                                            fontFamily = NunitoFontFamily,
                                            fontSize = 13.5.sp,
                                            fontWeight = if (isCurrent) FontWeight.Bold else FontWeight.Normal,
                                            color = if (isCurrent) ActivePurple else DeepNavy
                                        )
                                        if (isCurrent) {
                                            Spacer(modifier = Modifier.width(8.dp))
                                            Icon(
                                                imageVector = Icons.Default.Check,
                                                contentDescription = "Selected",
                                                tint = ActivePurple,
                                                modifier = Modifier.size(16.dp)
                                            )
                                        }
                                    }
                                },
                                onClick = {
                                    selectedHskLevel = opt.level
                                    selectedCategory = "Semua"
                                    searchQuery = ""
                                    showDropdown = false
                                }
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // 2. SEARCH BAR & RESULT COUNTER
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp),
                    placeholder = {
                        Text(
                            text = "Cari di HSK $selectedHskLevel...",
                            fontFamily = NunitoFontFamily,
                            fontSize = 13.sp,
                            color = SlateGray
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            tint = SlateGray,
                            modifier = Modifier.size(18.dp)
                        )
                    },
                    trailingIcon = {
                        if (searchQuery.isNotBlank()) {
                            IconButton(onClick = { searchQuery = "" }) {
                                Icon(
                                    imageVector = Icons.Default.Close,
                                    contentDescription = "Clear",
                                    tint = SlateGray,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    },
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedBorderColor = ActivePurple,
                        unfocusedBorderColor = BorderGray,
                        cursorColor = ActivePurple
                    ),
                    singleLine = true
                )

                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = SoftPurpleBg,
                    border = BorderStroke(1.dp, ActivePurple.copy(alpha = 0.25f))
                ) {
                    Text(
                        text = "${filteredList.size} Kata",
                        fontFamily = NunitoFontFamily,
                        fontSize = 11.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = ActivePurple,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // 3. CATEGORY FILTER CHIPS
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                categories.forEach { cat ->
                    val isSelected = selectedCategory == cat
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = if (isSelected) ActivePurple else Color.White,
                        border = BorderStroke(1.dp, if (isSelected) ActivePurple else BorderGray),
                        shadowElevation = if (isSelected) 2.dp else 0.5.dp,
                        modifier = Modifier.bouncyClick(scaleDown = 0.94f) {
                            selectedCategory = cat
                        }
                    ) {
                        Text(
                            text = cat,
                            fontFamily = NunitoFontFamily,
                            fontSize = 11.5.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                            color = if (isSelected) Color.White else DeepNavy,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // 4. KOTAK-KOTAK KECIL GRID
            if (filteredList.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Kata tidak ditemukan di HSK $selectedHskLevel",
                            fontFamily = NunitoFontFamily,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepNavy
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Coba gunakan kata kunci lain atau pilih level HSK yang berbeda.",
                            fontFamily = NunitoFontFamily,
                            fontSize = 12.5.sp,
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
                        key = { "${selectedHskLevel}_${it.id}" }
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
                hskLevel = selectedHskLevel,
                word = word,
                onDismiss = { detailWord = null },
                onSpeak = { ttsManager?.speak(word.hanzi) },
                onPracticeWriting = {
                    val target = detailWord
                    detailWord = null
                    writingWord = target
                }
            )
        }

        // 6. HANZI WRITING PRACTICE DIALOG
        writingWord?.let { word ->
            HanziWritingPracticeDialog(
                word = word,
                ttsManager = ttsManager,
                onDismiss = { writingWord = null }
            )
        }
    }
}

/**
 * HskWordSmallTile:
 * Kotak kecil modern untuk menampilkan setiap kosakata HSK.
 */
@Composable
private fun HskWordSmallTile(
    word: HskWordItem,
    onClick: () -> Unit
) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        border = BorderStroke(1.dp, BorderGray),
        shadowElevation = 1.5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .bouncyClick(scaleDown = 0.92f, onClick = onClick)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 9.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header baris atas kotak: Nomor Index & Ikon Audio
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "#${word.id}",
                    fontFamily = NunitoFontFamily,
                    fontSize = 9.5.sp,
                    fontWeight = FontWeight.Bold,
                    color = SlateGray.copy(alpha = 0.7f)
                )

                Icon(
                    imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                    contentDescription = "Audio",
                    tint = ActivePurple.copy(alpha = 0.65f),
                    modifier = Modifier.size(13.dp)
                )
            }

            Spacer(modifier = Modifier.height(3.dp))

            // Karakter Hanzi (Kaiti calligraphy)
            Text(
                text = word.hanzi,
                fontFamily = KaiTiFontFamily,
                fontSize = 21.sp,
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
                fontSize = 11.sp,
                fontWeight = FontWeight.SemiBold,
                color = ActivePurple,
                textAlign = TextAlign.Center,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(3.dp))

            // Arti Terjemahan
            Text(
                text = word.meaning,
                fontFamily = NunitoFontFamily,
                fontSize = 10.sp,
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
    hskLevel: Int,
    word: HskWordItem,
    onDismiss: () -> Unit,
    onSpeak: () -> Unit,
    onPracticeWriting: () -> Unit
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
                    .padding(22.dp),
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
                        color = SoftPurpleBg
                    ) {
                        Text(
                            text = word.category,
                            fontFamily = NunitoFontFamily,
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.Bold,
                            color = ActivePurple,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                        )
                    }

                    Text(
                        text = "New HSK $hskLevel • #${word.id}",
                        fontFamily = NunitoFontFamily,
                        fontSize = 12.sp,
                        color = SlateGray,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Big Hanzi
                Text(
                    text = word.hanzi,
                    fontFamily = KaiTiFontFamily,
                    fontSize = 50.sp,
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
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold,
                        color = ActivePurple
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    IconButton(
                        onClick = onSpeak,
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(SoftPurpleBg)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                            contentDescription = "Speak",
                            tint = ActivePurple,
                            modifier = Modifier.size(19.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))
                HorizontalDivider(color = BorderGray, thickness = 1.dp)
                Spacer(modifier = Modifier.height(16.dp))

                // Meaning Details
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Arti / Definisi",
                        fontFamily = NunitoFontFamily,
                        fontSize = 12.sp,
                        color = SlateGray
                    )
                    Text(
                        text = word.meaning,
                        fontFamily = NunitoFontFamily,
                        fontSize = 14.5.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = DeepNavy
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Practice Writing Button (Pastel Yellow / Cream Pill)
                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = PastelYellow,
                    border = BorderStroke(1.2.dp, PastelYellowBorder),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .bouncyClick(onClick = onPracticeWriting)
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Create,
                            contentDescription = null,
                            tint = PastelYellowText,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Latihan Tulis Hanzi",
                            fontFamily = NunitoFontFamily,
                            fontSize = 14.5.sp,
                            fontWeight = FontWeight.Bold,
                            color = PastelYellowText
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Close Button
                Button(
                    onClick = onDismiss,
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = ActivePurple),
                    modifier = Modifier.fillMaxWidth().height(46.dp)
                ) {
                    Text(
                        text = "Tutup",
                        fontFamily = NunitoFontFamily,
                        fontSize = 14.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }
}

/**
 * HanziWritingPracticeDialog:
 * Dialog interaktif papan tulis kaligrafi (Mi-zi-ge) dengan watermark transparan untuk tracing karakter Hanzi.
 */
@Composable
fun HanziWritingPracticeDialog(
    word: HskWordItem,
    ttsManager: TtsManager?,
    onDismiss: () -> Unit
) {
    var currentPath by remember { mutableStateOf<Path?>(null) }
    val completedPaths = remember { mutableStateListOf<Path>() }

    Dialog(onDismissRequest = onDismiss) {
        Card(
            shape = RoundedCornerShape(26.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            border = BorderStroke(1.5.dp, BorderGray),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Header Bar (Pinyin, Audio & Close button)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = SoftPurpleBg,
                            border = BorderStroke(1.dp, ActivePurple.copy(alpha = 0.25f))
                        ) {
                            Text(
                                text = word.pinyin,
                                fontFamily = NunitoFontFamily,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = ActivePurple,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(8.dp))

                        Surface(
                            shape = CircleShape,
                            color = SoftPurpleBg,
                            border = BorderStroke(1.dp, ActivePurple.copy(alpha = 0.25f)),
                            modifier = Modifier.size(32.dp),
                            onClick = { ttsManager?.speak(word.hanzi) }
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                                    contentDescription = "Putar Suara",
                                    tint = ActivePurple,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.size(32.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Tutup",
                            tint = SlateGray
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Meaning in Indonesian / English
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = word.meaning,
                        fontFamily = NunitoFontFamily,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy,
                        textAlign = TextAlign.Center
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // --- INTERACTIVE WRITING CANVAS (260dp x 260dp) ---
                Box(
                    modifier = Modifier
                        .size(260.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(0xFFFAFBFC))
                        .border(1.5.dp, PastelYellowBorder, RoundedCornerShape(20.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    // 1. Watermark Guideline Character (Low Opacity for Tracing)
                    Text(
                        text = word.hanzi,
                        fontFamily = KaiTiFontFamily,
                        fontSize = if (word.hanzi.length > 2) 74.sp else 126.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy.copy(alpha = 0.16f),
                        textAlign = TextAlign.Center
                    )

                    // 2. Interactive Canvas for Drawing with Calligraphy Grid
                    Canvas(
                        modifier = Modifier
                            .fillMaxSize()
                            .pointerInput(word.hanzi) {
                                detectDragGestures(
                                    onDragStart = { offset ->
                                        val newPath = Path().apply { moveTo(offset.x, offset.y) }
                                        currentPath = newPath
                                    },
                                    onDrag = { change, _ ->
                                        change.consume()
                                        currentPath?.lineTo(change.position.x, change.position.y)
                                    },
                                    onDragEnd = {
                                        currentPath?.let { completedPaths.add(it) }
                                        currentPath = null
                                    },
                                    onDragCancel = {
                                        currentPath = null
                                    }
                                )
                            }
                    ) {
                        val w = size.width
                        val h = size.height
                        val dashEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
                        val gridColor = Color(0xFFCBD5E1).copy(alpha = 0.45f)

                        // Traditional Mi-zi-ge (米字格) Calligraphy Guidelines
                        drawLine(
                            color = gridColor,
                            start = Offset(0f, h / 2f),
                            end = Offset(w, h / 2f),
                            strokeWidth = 1.5f,
                            pathEffect = dashEffect
                        )
                        drawLine(
                            color = gridColor,
                            start = Offset(w / 2f, 0f),
                            end = Offset(w / 2f, h),
                            strokeWidth = 1.5f,
                            pathEffect = dashEffect
                        )
                        drawLine(
                            color = gridColor,
                            start = Offset(0f, 0f),
                            end = Offset(w, h),
                            strokeWidth = 1f,
                            pathEffect = dashEffect
                        )
                        drawLine(
                            color = gridColor,
                            start = Offset(w, 0f),
                            end = Offset(0f, h),
                            strokeWidth = 1f,
                            pathEffect = dashEffect
                        )

                        // Draw user's completed strokes
                        completedPaths.forEach { path ->
                            drawPath(
                                path = path,
                                color = DeepNavy,
                                style = Stroke(width = 13.dp.toPx(), cap = StrokeCap.Round, join = StrokeJoin.Round)
                            )
                        }

                        // Draw active current stroke
                        currentPath?.let { path ->
                            drawPath(
                                path = path,
                                color = DeepNavy,
                                style = Stroke(width = 13.dp.toPx(), cap = StrokeCap.Round, join = StrokeJoin.Round)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                // Canvas Controls (Hapus Coretan & Selesai)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    // Button 1: Hapus Coretan (Pastel Pink)
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = PastelPink,
                        border = BorderStroke(1.dp, PastelPinkBorder),
                        modifier = Modifier
                            .weight(1f)
                            .clickable {
                                completedPaths.clear()
                                currentPath = null
                            }
                    ) {
                        Row(
                            modifier = Modifier.padding(vertical = 12.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.DeleteSweep,
                                contentDescription = null,
                                tint = PastelPinkText,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Hapus Coretan",
                                fontFamily = NunitoFontFamily,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = PastelPinkText
                            )
                        }
                    }

                    // Button 2: Selesai (Active Purple)
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = ActivePurple,
                        modifier = Modifier
                            .weight(1f)
                            .clickable { onDismiss() }
                    ) {
                        Box(
                            modifier = Modifier.padding(vertical = 12.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Selesai",
                                fontFamily = NunitoFontFamily,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}
