package com.example.chineselearning.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.data.model.*
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.components.bouncyClick
import com.example.chineselearning.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onSelectLesson: (Lesson) -> Unit,
    onSelectStory: (Story) -> Unit
) {
    val allUnits = LearningRepository.units
    var selectedHskLevel by remember { mutableStateOf(1) }
    var showHskMenu by remember { mutableStateOf(false) }

    var selectedLessonForSheet by remember { mutableStateOf<Lesson?>(null) }
    var selectedUnitForSheet by remember { mutableStateOf<UnitCourse?>(null) }

    // Winding path horizontal offsets (repeats smoothly across all chapters)
    val pathXOffsets = listOf(
        0.dp,        // Center
        65.dp,       // Right
        0.dp,        // Center
        (-65).dp,    // Left
        0.dp,        // Center
        0.dp,        // Checkpoint (Center)
        0.dp         // Rest Area (Center)
    )

    // Palette per chapter for banner & connector
    val chapterThemeColors = listOf(
        Pair(Color(0xFFFCE4EC), Color(0xFFF8BBD0)), // Bab 1: Pink
        Pair(Color(0xFFE1F5FE), Color(0xFF81D4FA)), // Bab 2: Sky Blue
        Pair(Color(0xFFE8F5E9), Color(0xFFA5D6A7)), // Bab 3: Fresh Green
        Pair(Color(0xFFFFF3E0), Color(0xFFFFCC80)), // Bab 4: Warm Amber
        Pair(Color(0xFFEDE7F6), Color(0xFFD1C4E9)), // Bab 5: Purple
        Pair(Color(0xFFE0F2F1), Color(0xFF80CBC4))  // Bab 6: Teal
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFDFE)),
        contentPadding = PaddingValues(bottom = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TOP APP BAR: HSK 1 - 6 Dropdown Selector (Screenshot 1)
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(horizontal = 16.dp, vertical = 6.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Left: HSK 1 - 6 Dropdown Button
                Box {
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = Color(0xFFEDE7F6),
                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF7E57C2)),
                        modifier = Modifier.bouncyClick { showHskMenu = true }
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "🛡️ HSK $selectedHskLevel",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF512DA8)
                            )
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Pilih Level HSK",
                                modifier = Modifier.size(16.dp),
                                tint = Color(0xFF512DA8)
                            )
                        }
                    }

                    // HSK 1 to HSK 6 Dropdown Menu
                    DropdownMenu(
                        expanded = showHskMenu,
                        onDismissRequest = { showHskMenu = false }
                    ) {
                        listOf(
                            1 to "HSK 1: Pemula (150 Kosakata)",
                            2 to "HSK 2: Dasar (300 Kosakata)",
                            3 to "HSK 3: Menengah (600 Kosakata)",
                            4 to "HSK 4: Menengah Atas (1200 Kosakata)",
                            5 to "HSK 5: Lanjutan (2500 Kosakata)",
                            6 to "HSK 6: Mahir (5000 Kosakata)"
                        ).forEach { (level, desc) ->
                            DropdownMenuItem(
                                text = {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Text(
                                            text = if (level == selectedHskLevel) "✓ " else "   ",
                                            fontWeight = FontWeight.Bold,
                                            color = Color(0xFF00C48C)
                                        )
                                        Column {
                                            Text(
                                                text = "Level HSK $level",
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 13.sp,
                                                color = if (level == selectedHskLevel) Color(0xFF512DA8) else DeepNavy
                                            )
                                            Text(
                                                text = desc,
                                                fontSize = 11.sp,
                                                color = SlateGray
                                            )
                                        }
                                    }
                                },
                                onClick = {
                                    selectedHskLevel = level
                                    showHskMenu = false
                                }
                            )
                        }
                    }
                }

                // Center: Rainbow Crown
                Text(text = "👑", fontSize = 24.sp)

                // Right: Streak Flame & Gold Coin
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "🔥", fontSize = 16.sp)
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(text = "0", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = SlateGray)
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = Color(0xFFFFF8E1),
                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFFFD54F))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "🪙", fontSize = 14.sp)
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = "171", fontSize = 13.sp, fontWeight = FontWeight.Bold, color = Color(0xFFE65100))
                        }
                    }
                }
            }
        }

        // IF USER CHOOSES HSK 2 - 6: Friendly placeholder banner
        if (selectedHskLevel != 1) {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(40.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "🚀", fontSize = 54.sp)
                    Spacer(modifier = Modifier.height(14.dp))
                    Text(
                        text = "Materi HSK $selectedHskLevel Segera Hadir!",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Saat ini kita berfokus menuntaskan seluruh 150 kosakata dan 6 bab lengkap di HSK 1 terlebih dahulu.",
                        fontSize = 13.sp,
                        color = SlateGray,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(
                        onClick = { selectedHskLevel = 1 },
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00C48C))
                    ) {
                        Text(text = "Kembali ke HSK 1")
                    }
                }
            }
        } else {
            // HSK 1: RENDER ALL 6 CHAPTERS IN ONE CONTINUOUS ROAD!
            allUnits.forEachIndexed { unitIdx, chapterUnit ->
                val (bannerBg, connectorColor) = chapterThemeColors[unitIdx % chapterThemeColors.size]

                // CHAPTER HEADER (Hero character for Bab 1, or Banner for Bab 2 - 6)
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 12.dp)
                    ) {
                        // Grandpa Character (Shown on Bab 1)
                        if (unitIdx == 0) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.Bottom
                            ) {
                                Row(verticalAlignment = Alignment.Bottom) {
                                    Text(text = "👴", fontSize = 54.sp)
                                    Surface(
                                        shape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp, bottomEnd = 12.dp),
                                        color = Color(0xFFE91E63),
                                        modifier = Modifier.padding(bottom = 12.dp, start = 4.dp)
                                    ) {
                                        Text(
                                            text = "你好！",
                                            color = Color.White,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 12.sp,
                                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                        )
                                    }
                                }

                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = Color(0xFFFFEBEE),
                                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE57373))
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(text = "💰", fontSize = 14.sp)
                                        Spacer(modifier = Modifier.width(4.dp))
                                        Text(text = "0 / 1", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = Color(0xFFC62828))
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                        }

                        // Chapter Banner (Screenshot 1)
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = bannerBg,
                            modifier = Modifier
                                .fillMaxWidth()
                                .bouncyClick {
                                    selectedUnitForSheet = chapterUnit
                                    selectedLessonForSheet = chapterUnit.lessons.first()
                                }
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp, vertical = 14.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = "Bab ${chapterUnit.unitNumber}: ${chapterUnit.bannerTitle}",
                                        fontSize = 17.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = DeepNavy
                                    )
                                    Text(
                                        text = chapterUnit.subtitle,
                                        fontSize = 11.sp,
                                        color = SlateGray
                                    )
                                }

                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(text = chapterUnit.emoji, fontSize = 22.sp)
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(text = "⭐", fontSize = 18.sp)
                                }
                            }
                        }

                        // Sub-pill "Bab X"
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = connectorColor,
                            modifier = Modifier.padding(top = 4.dp, start = 20.dp)
                        ) {
                            Text(
                                text = "Bab ${chapterUnit.unitNumber}",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = DeepNavy,
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 2.dp)
                            )
                        }
                    }
                }

                // CHAPTER NODES (Winding Path)
                itemsIndexed(chapterUnit.nodes) { nodeIdx, node ->
                    val globalIdx = (unitIdx * 5) + nodeIdx
                    val xOffset = pathXOffsets.getOrElse(globalIdx % pathXOffsets.size) { 0.dp }

                    // Connector ribbon
                    Box(
                        modifier = Modifier
                            .height(34.dp)
                            .width(28.dp)
                            .background(
                                color = if (node.iconType == NodeIconType.REST_AREA) Color(0xFF81D4FA) else connectorColor,
                                shape = RoundedCornerShape(14.dp)
                            )
                    )

                    when (node.iconType) {
                        NodeIconType.CAP, NodeIconType.DUMBBELL -> {
                            GlossyCircleNode(
                                node = node,
                                xOffset = xOffset,
                                onClick = {
                                    selectedUnitForSheet = chapterUnit
                                    selectedLessonForSheet = chapterUnit.lessons.first()
                                }
                            )
                        }

                        NodeIconType.CHEST -> {
                            GoldCheckpointNode(
                                onClick = {
                                    onSelectStory(chapterUnit.story)
                                }
                            )
                        }

                        NodeIconType.REST_AREA -> {
                            RestAreaNode(
                                label = "Rest area (Lanjut Bab ${chapterUnit.unitNumber + 1})",
                                onClick = {
                                    onSelectStory(chapterUnit.story)
                                }
                            )
                        }
                    }
                }
            }
        }
    }

    // Modal Bottom Sheet when user clicks any node or chapter
    if (selectedLessonForSheet != null && selectedUnitForSheet != null) {
        val lesson = selectedLessonForSheet!!
        val unitItem = selectedUnitForSheet!!

        ModalBottomSheet(
            onDismissRequest = {
                selectedLessonForSheet = null
                selectedUnitForSheet = null
            },
            containerColor = MaterialTheme.colorScheme.surface
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFE91E63)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = unitItem.emoji, fontSize = 26.sp)
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                    Column {
                        Text(
                            text = "Bab ${unitItem.unitNumber}: ${lesson.title}",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepNavy
                        )
                        Text(
                            text = "${lesson.exercises.size} Latihan interaktif HSK 1",
                            fontSize = 12.sp,
                            color = SlateGray
                        )
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                Surface(
                    shape = RoundedCornerShape(26.dp),
                    color = Color(0xFF00C48C),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp)
                        .bouncyClick {
                            val targetLesson = lesson
                            selectedLessonForSheet = null
                            selectedUnitForSheet = null
                            onSelectLesson(targetLesson)
                        }
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(text = "MULAI BELAJAR", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.White)
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Surface(
                    shape = RoundedCornerShape(25.dp),
                    color = Color(0xFFFFF8E1),
                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFFFD54F)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .bouncyClick {
                            val targetStory = unitItem.story
                            selectedLessonForSheet = null
                            selectedUnitForSheet = null
                            onSelectStory(targetStory)
                        }
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(text = "Baca Cerita: 《${unitItem.story.titleHanzi}》", fontWeight = FontWeight.Bold, color = Color(0xFF7A4B00))
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

// 3D GLOSSY CIRCLE NODE WITH BOUNCY TOUCH
@Composable
fun GlossyCircleNode(
    node: PathNode,
    xOffset: androidx.compose.ui.unit.Dp,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .offset(x = xOffset)
            .padding(vertical = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .size(76.dp)
                .shadow(elevation = 6.dp, shape = CircleShape)
                .clip(CircleShape)
                .background(node.color)
                .border(3.dp, Color.White, CircleShape)
                .bouncyClick(scaleDown = 0.90f, onClick = onClick),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .offset(x = 12.dp, y = (-12).dp)
                    .clip(CircleShape)
                    .background(Color.White.copy(alpha = 0.45f))
            )

            Text(
                text = if (node.iconType == NodeIconType.CAP) "🎓" else "🏋️",
                fontSize = 32.sp
            )
        }
    }
}

// GOLD CHECKPOINT CHEST NODE
@Composable
fun GoldCheckpointNode(
    onClick: () -> Unit
) {
    Surface(
        shape = RoundedCornerShape(18.dp),
        color = Color(0xFFFFB300),
        border = androidx.compose.foundation.BorderStroke(3.dp, Color.White),
        shadowElevation = 6.dp,
        modifier = Modifier
            .size(76.dp)
            .bouncyClick(scaleDown = 0.90f, onClick = onClick)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = "🤝", fontSize = 36.sp)
        }
    }
}

// REST AREA NODE
@Composable
fun RestAreaNode(
    label: String = "Rest area",
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 10.dp)
    ) {
        Surface(
            shape = CircleShape,
            color = Color(0xFFE1F5FE),
            border = androidx.compose.foundation.BorderStroke(2.dp, Color(0xFF03A9F4)),
            modifier = Modifier
                .size(76.dp)
                .bouncyClick(scaleDown = 0.90f, onClick = onClick)
        ) {
            Box(contentAlignment = Alignment.Center) {
                Text(text = "⛽", fontSize = 38.sp)
            }
        }

        Surface(
            shape = RoundedCornerShape(10.dp),
            color = Color(0xFFE1F5FE),
            modifier = Modifier.padding(top = 6.dp)
        ) {
            Text(
                text = label,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = Color(0xFF0288D1),
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
            )
        }
    }
}
