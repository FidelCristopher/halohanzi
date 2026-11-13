package com.example.chineselearning.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.R
import com.example.chineselearning.data.model.Story
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.theme.*

@Composable
fun StoryListScreen(
    onSelectStory: (Story) -> Unit
) {
    val allStories = LearningRepository.stories

    var selectedHskFilter by remember { mutableStateOf("Semua") }
    var selectedCategoryFilter by remember { mutableStateOf("Semua Topik") }
    var searchQuery by remember { mutableStateOf("") }

    val hskLevels = listOf("Semua", "HSK 1", "HSK 2", "HSK 3")

    val categories = remember(allStories) {
        val topicList = mutableListOf("Semua Topik")
        allStories.forEach { story ->
            val primaryCategory = story.category.split("&").firstOrNull()?.trim() ?: story.category
            if (primaryCategory.isNotEmpty() && !topicList.contains(primaryCategory)) {
                topicList.add(primaryCategory)
            }
        }
        topicList
    }

    // Filtered Stories calculation
    val filteredStories = remember(selectedHskFilter, selectedCategoryFilter, searchQuery, allStories) {
        allStories.filter { story ->
            val matchesHsk = when (selectedHskFilter) {
                "Semua" -> true
                else -> story.level.equals(selectedHskFilter, ignoreCase = true)
            }
            val matchesCategory = when (selectedCategoryFilter) {
                "Semua Topik" -> true
                else -> story.category.contains(selectedCategoryFilter, ignoreCase = true)
            }
            val matchesSearch = if (searchQuery.isBlank()) {
                true
            } else {
                story.titleHanzi.contains(searchQuery, ignoreCase = true) ||
                        story.titlePinyin.contains(searchQuery, ignoreCase = true) ||
                        story.titleTranslation.contains(searchQuery, ignoreCase = true) ||
                        story.description.contains(searchQuery, ignoreCase = true)
            }

            matchesHsk && matchesCategory && matchesSearch
        }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBg),
        contentPadding = PaddingValues(
            start = 16.dp,
            end = 16.dp,
            top = 16.dp,
            bottom = 100.dp // Accommodate floating bottom navigation bar
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // --- 1. HERO HEADER SECTION ---
        item {
            Text(
                text = "Pustaka Cerita Mandarin",
                fontFamily = AppFontFamily,
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                color = DeepNavy,
                modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
            )
        }

        // --- 2. SEARCH BAR ---
        item {
            StorySearchBar(
                query = searchQuery,
                onQueryChange = { searchQuery = it },
                onClearQuery = { searchQuery = "" }
            )
        }

        // --- 3. HSK LEVEL FILTER TABS ---
        item {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Pilih Tingkat Kemampuan (HSK):",
                        fontFamily = AppFontFamily,
                        fontSize = 13.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy
                    )
                    if (selectedHskFilter != "Semua" || selectedCategoryFilter != "Semua Topik" || searchQuery.isNotEmpty()) {
                        Text(
                            text = "Reset Filter",
                            fontFamily = AppFontFamily,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = HanziGreenDark,
                            modifier = Modifier
                                .clickable {
                                    selectedHskFilter = "Semua"
                                    selectedCategoryFilter = "Semua Topik"
                                    searchQuery = ""
                                }
                                .padding(4.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    hskLevels.forEach { level ->
                        val count = if (level == "Semua") {
                            allStories.size
                        } else {
                            allStories.count { it.level.equals(level, ignoreCase = true) }
                        }
                        val isSelected = selectedHskFilter == level

                        HskLevelFilterChip(
                            label = level,
                            count = count,
                            isSelected = isSelected,
                            onSelect = { selectedHskFilter = level }
                        )
                    }
                }
            }
        }

        // --- 4. TOPIC / CATEGORY CHIPS ---
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                categories.forEach { category ->
                    val isSelected = selectedCategoryFilter == category
                    TopicFilterChip(
                        title = category,
                        isSelected = isSelected,
                        onSelect = { selectedCategoryFilter = category }
                    )
                }
            }
        }

        // --- 5. RESULT COUNT HEADER ---
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Daftar Cerita (${filteredStories.size})",
                    fontFamily = AppFontFamily,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepNavy
                )
                if (selectedHskFilter != "Semua") {
                    Surface(
                        color = HanziMint,
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(
                            text = "Filter: $selectedHskFilter",
                            fontFamily = AppFontFamily,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = HanziGreenDark,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                        )
                    }
                }
            }
        }

        // --- 6. STORY CARDS OR EMPTY STATE ---
        if (filteredStories.isEmpty()) {
            item {
                StoryEmptyState(
                    selectedHsk = selectedHskFilter,
                    selectedCategory = selectedCategoryFilter,
                    searchQuery = searchQuery,
                    onResetFilter = {
                        selectedHskFilter = "Semua"
                        selectedCategoryFilter = "Semua Topik"
                        searchQuery = ""
                    }
                )
            }
        } else {
            items(filteredStories, key = { it.id }) { story ->
                ModernStoryCard(
                    story = story,
                    onCardClick = { onSelectStory(story) }
                )
            }
        }
    }
}

// -------------------------------------------------------------
// SUB-COMPONENTS: SEARCH BAR
// -------------------------------------------------------------
@Composable
private fun StorySearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    onClearQuery: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        border = BorderStroke(1.dp, BorderGray),
        shadowElevation = 1.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_story_search),
                contentDescription = "Search",
                tint = SlateGray,
                modifier = Modifier.size(18.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Box(modifier = Modifier.weight(1f)) {
                if (query.isEmpty()) {
                    Text(
                        text = "Cari judul cerita, pinyin, atau topik...",
                        fontFamily = AppFontFamily,
                        fontSize = 13.5.sp,
                        color = SlateGray.copy(alpha = 0.7f)
                    )
                }
                BasicTextField(
                    value = query,
                    onValueChange = onQueryChange,
                    singleLine = true,
                    textStyle = TextStyle(
                        fontFamily = AppFontFamily,
                        fontSize = 13.5.sp,
                        color = DeepNavy,
                        fontWeight = FontWeight.Medium
                    ),
                    cursorBrush = SolidColor(HanziGreenDark),
                    modifier = Modifier.fillMaxWidth()
                )
            }

            if (query.isNotEmpty()) {
                Spacer(modifier = Modifier.width(6.dp))
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Clear",
                    tint = SlateGray,
                    modifier = Modifier
                        .size(18.dp)
                        .clickable { onClearQuery() }
                )
            }
        }
    }
}

// -------------------------------------------------------------
// SUB-COMPONENTS: HSK LEVEL FILTER CHIP
// -------------------------------------------------------------
@Composable
private fun HskLevelFilterChip(
    label: String,
    count: Int,
    isSelected: Boolean,
    onSelect: () -> Unit
) {
    val backgroundColor by animateColorAsState(
        targetValue = if (isSelected) PastelMint else Color.White,
        animationSpec = spring(),
        label = "chipBg"
    )
    val contentColor by animateColorAsState(
        targetValue = if (isSelected) PastelMintText else DeepNavy,
        label = "chipContent"
    )
    val borderColor = if (isSelected) HanziGreen else BorderGray

    Surface(
        onClick = onSelect,
        shape = RoundedCornerShape(14.dp),
        color = backgroundColor,
        border = BorderStroke(1.2.dp, borderColor)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 9.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_story_level_badge),
                contentDescription = null,
                tint = contentColor,
                modifier = Modifier.size(14.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = label,
                fontFamily = AppFontFamily,
                fontSize = 13.sp,
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.SemiBold,
                color = contentColor
            )
            Spacer(modifier = Modifier.width(6.dp))
            // Pill count
            Surface(
                shape = CircleShape,
                color = if (isSelected) PastelMintBorder else LightSlate
            ) {
                Text(
                    text = count.toString(),
                    fontFamily = AppFontFamily,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (isSelected) PastelMintText else SlateGray,
                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 1.dp)
                )
            }
        }
    }
}

// -------------------------------------------------------------
// SUB-COMPONENTS: TOPIC FILTER CHIP
// -------------------------------------------------------------
@Composable
private fun TopicFilterChip(
    title: String,
    isSelected: Boolean,
    onSelect: () -> Unit
) {
    val backgroundColor = if (isSelected) PastelCream else Color.White
    val contentColor = if (isSelected) PastelCreamText else SlateGray
    val borderColor = if (isSelected) PastelCreamBorder else BorderGray

    Surface(
        onClick = onSelect,
        shape = RoundedCornerShape(20.dp),
        color = backgroundColor,
        border = BorderStroke(1.dp, borderColor)
    ) {
        Text(
            text = title,
            fontFamily = AppFontFamily,
            fontSize = 12.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
            color = contentColor,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
        )
    }
}

// -------------------------------------------------------------
// SUB-COMPONENTS: MODERN STORY CARD
// -------------------------------------------------------------
@Composable
private fun ModernStoryCard(
    story: Story,
    onCardClick: () -> Unit
) {
    Card(
        onClick = onCardClick,
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, Color(0xFFE2E8F0)),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            // --- TOP BANNER VISUAL (140dp) ---
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .clip(RoundedCornerShape(topStart = 22.dp, topEnd = 22.dp))
            ) {
                if (story.coverImageRes != 0) {
                    Image(
                        painter = painterResource(story.coverImageRes),
                        contentDescription = story.titleHanzi,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )

                    // Scrim gradient for text contrast
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(
                                        Color.Black.copy(alpha = 0.55f),
                                        Color.Transparent,
                                        Color.Black.copy(alpha = 0.65f)
                                    )
                                )
                            )
                    )
                } else {
                    // Stylized Chinese Calligraphic Art Banner (Zero Emoji)
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFF007557),
                                        Color(0xFF008C69),
                                        Color(0xFF0D9488)
                                    )
                                )
                            )
                    ) {
                        // Watermark Hanzi Characters in Background
                        Text(
                            text = story.titleHanzi.take(3),
                            fontFamily = KaiTiFontFamily,
                            fontSize = 76.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White.copy(alpha = 0.15f),
                            modifier = Modifier
                                .align(Alignment.CenterEnd)
                                .offset(x = 10.dp)
                        )

                        // Traditional Seal Emblem Badge on the left
                        Row(
                            modifier = Modifier
                                .align(Alignment.CenterStart)
                                .padding(start = 18.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = Color.White.copy(alpha = 0.2f),
                                border = BorderStroke(1.5.dp, Color.White.copy(alpha = 0.5f))
                            ) {
                                Text(
                                    text = story.titleHanzi.firstOrNull()?.toString() ?: "文",
                                    fontFamily = KaiTiFontFamily,
                                    fontSize = 28.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = story.titleHanzi,
                                    fontFamily = KaiTiFontFamily,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }

                // --- TOP OVERLAYS ON BANNER ---
                // Top-Left: HSK Level Pill (Pastel Tonal Badge per HSK)
                val (hskBg, hskText, hskBorder) = when {
                    story.level.contains("1") -> Triple(PastelMint, PastelMintText, PastelMintBorder)
                    story.level.contains("2") -> Triple(PastelCream, PastelCreamText, PastelCreamBorder)
                    else -> Triple(PastelLavender, PastelLavenderText, PastelLavenderBorder)
                }
                Surface(
                    color = hskBg,
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, hskBorder),
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(12.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_story_level_badge),
                            contentDescription = null,
                            tint = hskText,
                            modifier = Modifier.size(11.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = story.level,
                            fontFamily = AppFontFamily,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = hskText
                        )
                    }
                }

                // Top-Right: Category Tag
                Surface(
                    color = Color.Black.copy(alpha = 0.6f),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(12.dp)
                ) {
                    Text(
                        text = story.category,
                        fontFamily = AppFontFamily,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }

                // Bottom-Right: Estimated Read Time
                Surface(
                    color = Color.Black.copy(alpha = 0.6f),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(12.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_story_timer),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(12.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "${story.estimatedReadMinutes} mnt baca",
                            fontFamily = AppFontFamily,
                            fontSize = 11.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }

            // --- CARD CONTENT BODY ---
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                // Chinese Title
                Text(
                    text = story.titleHanzi,
                    fontFamily = KaiTiFontFamily,
                    fontSize = 21.sp,
                    fontWeight = FontWeight.Bold,
                    color = HanziColor
                )

                Spacer(modifier = Modifier.height(2.dp))

                // Pinyin Title
                Text(
                    text = story.titlePinyin,
                    fontFamily = AppFontFamily,
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = HanziGreenDark
                )

                Spacer(modifier = Modifier.height(2.dp))

                // Indonesian Translation Title
                Text(
                    text = story.titleTranslation,
                    fontFamily = AppFontFamily,
                    fontSize = 12.5.sp,
                    color = SlateGray,
                    fontWeight = FontWeight.Medium
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Story Blurb / Description
                Text(
                    text = story.description,
                    fontFamily = AppFontFamily,
                    fontSize = 12.5.sp,
                    color = Color(0xFF475569),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    lineHeight = 17.5.sp
                )

                Spacer(modifier = Modifier.height(12.dp))

                HorizontalDivider(color = Color(0xFFF1F5F9), thickness = 1.dp)

                Spacer(modifier = Modifier.height(12.dp))

                // Bottom Metadata & CTA Action
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    // Feature badges (Sentences + Quiz count)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Sentence count
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painter = painterResource(R.drawable.ic_story_sentences),
                                contentDescription = null,
                                tint = SlateGray,
                                modifier = Modifier.size(13.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "${story.sentences.size} kalimat",
                                fontFamily = AppFontFamily,
                                fontSize = 11.5.sp,
                                color = SlateGray,
                                fontWeight = FontWeight.Medium
                            )
                        }

                        // Quiz questions
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painter = painterResource(R.drawable.ic_story_quiz_check),
                                contentDescription = null,
                                tint = HanziGreenDark,
                                modifier = Modifier.size(13.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "${story.questions.size} kuis",
                                fontFamily = AppFontFamily,
                                fontSize = 11.5.sp,
                                color = HanziGreenDark,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }

                    // "Baca Cerita" Action Pill Button
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = PastelMint,
                        border = BorderStroke(1.dp, PastelMintBorder)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_story_book_open),
                                contentDescription = null,
                                tint = PastelMintText,
                                modifier = Modifier.size(13.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Baca",
                                fontFamily = AppFontFamily,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = PastelMintText
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = null,
                                tint = PastelMintText,
                                modifier = Modifier.size(12.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

// -------------------------------------------------------------
// SUB-COMPONENTS: EMPTY STATE
// -------------------------------------------------------------
@Composable
private fun StoryEmptyState(
    selectedHsk: String,
    selectedCategory: String,
    searchQuery: String,
    onResetFilter: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp),
        shape = RoundedCornerShape(22.dp),
        color = Color.White,
        border = BorderStroke(1.dp, BorderGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(68.dp)
                    .clip(CircleShape)
                    .background(HanziMint),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_book),
                    contentDescription = null,
                    tint = HanziGreenDark,
                    modifier = Modifier.size(32.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Belum Ada Cerita Ditemukan",
                fontFamily = AppFontFamily,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = DeepNavy
            )

            Spacer(modifier = Modifier.height(6.dp))

            val explanationText = when {
                searchQuery.isNotBlank() ->
                    "Tidak ada cerita yang cocok dengan kata kunci \"$searchQuery\"."
                selectedHsk != "Semua" ->
                    "Cerita untuk tingkat $selectedHsk sedang disiapkan. Sementara itu, silakan jelajahi cerita di tingkat lainnya."
                selectedCategory != "Semua Topik" ->
                    "Belum ada cerita dengan kategori topik \"$selectedCategory\"."
                else ->
                    "Daftar cerita belum tersedia untuk saat ini."
            }

            Text(
                text = explanationText,
                fontFamily = AppFontFamily,
                fontSize = 13.sp,
                color = SlateGray,
                lineHeight = 18.sp,
                modifier = Modifier.padding(horizontal = 12.dp)
            )

            Spacer(modifier = Modifier.height(18.dp))

            Button(
                onClick = onResetFilter,
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = HanziGreenDark)
            ) {
                Text(
                    text = "Tampilkan Semua Cerita",
                    fontFamily = AppFontFamily,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}
