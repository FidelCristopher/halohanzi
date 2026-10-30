package com.example.chineselearning.ui.screens

import androidx.compose.animation.*
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
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.example.chineselearning.data.model.*
import com.example.chineselearning.data.repository.LearningRepository
import com.example.chineselearning.ui.components.GoldenStagePopup
import com.example.chineselearning.ui.components.bouncyClick
import com.example.chineselearning.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onSelectLesson: (Lesson, String) -> Unit,
    onSelectStory: (Story) -> Unit
) {
    val allUnits = LearningRepository.units
    var selectedHskLevel by remember { mutableStateOf(1) }
    var showHskMenu by remember { mutableStateOf(false) }

    var activePopupNodeId by remember { mutableStateOf<String?>("u1_n2") } // Defaults to Node 2 (like screenshot) or null

    // Winding path horizontal offsets (exact 8 stages serpentine sequence from Screenshot 2026-10-25 210240.png)
    val pathXOffsets = listOf(
        0.dp,        // Stage 1: Pink Cap (Center)
        75.dp,       // Stage 2: Yellow Cap (Right)
        0.dp,        // Stage 3: Yellow Dumbbell (Center)
        (-75).dp,    // Stage 4: Yellow Cap (Left)
        0.dp,        // Stage 5: Yellow Dumbbell (Center)
        75.dp,       // Stage 6: Yellow Shuffle (Right)
        0.dp,        // Stage 7: Yellow Book/Quiz (Center)
        0.dp,        // Stage 8: Golden Checkpoint Chest (Center)
        0.dp         // Transition: Rest area (Center)
    )

    // Palette per chapter for banner & connector
    val chapterThemeColors = listOf(
        Pair(Color(0xFFFCE4EC), Color(0xFFF48FB1)), // Bab 1: Pink
        Pair(Color(0xFFE1F5FE), Color(0xFF81D4FA)), // Bab 2: Sky Blue
        Pair(Color(0xFFE8F5E9), Color(0xFFA5D6A7)), // Bab 3: Fresh Green
        Pair(Color(0xFFFFF3E0), Color(0xFFFFB74D)), // Bab 4: Warm Amber
        Pair(Color(0xFFEDE7F6), Color(0xFFBA68C8)), // Bab 5: Purple
        Pair(Color(0xFFE0F2F1), Color(0xFF4DB6AC))  // Bab 6: Teal
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
                                    activePopupNodeId = chapterUnit.nodes.firstOrNull()?.id
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

                // CHAPTER NODES (Continuous Clean Bezier Path - 7-8 Stages per Chapter)
                itemsIndexed(chapterUnit.nodes) { nodeIdx, node ->
                    val currXOffset = pathXOffsets.getOrElse(nodeIdx) { 0.dp }
                    val nextXOffset = if (nodeIdx < chapterUnit.nodes.lastIndex) {
                        pathXOffsets.getOrElse(nodeIdx + 1) { 0.dp }
                    } else {
                        0.dp
                    }
                    val progressCount = LearningRepository.getStageProgress(node.id)

                    StageNodeRow(
                        node = node,
                        currXOffset = currXOffset,
                        nextXOffset = nextXOffset,
                        lineColor = if (node.iconType == NodeIconType.REST_AREA) Color(0xFF81D4FA) else connectorColor,
                        hasNextNode = (nodeIdx < chapterUnit.nodes.lastIndex || unitIdx < allUnits.lastIndex),
                        isPopupActive = (activePopupNodeId == node.id),
                        progressCount = progressCount,
                        onClick = {
                            activePopupNodeId = if (activePopupNodeId == node.id) null else node.id
                        },
                        onDismissPopup = {
                            activePopupNodeId = null
                        },
                        onTogglePartClick = {
                            LearningRepository.toggleStageProgress(node.id)
                        },
                        onStartLesson = {
                            activePopupNodeId = null
                            when (node.iconType) {
                                NodeIconType.CAP, NodeIconType.DUMBBELL, NodeIconType.SHUFFLE -> {
                                    onSelectLesson(chapterUnit.lessons.first(), node.id)
                                }
                                NodeIconType.BOOK, NodeIconType.CHEST, NodeIconType.REST_AREA -> {
                                    onSelectStory(chapterUnit.story)
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}

/**
 * StageNodeRow:
 * Draws exactly ONE continuous Bezier S-curve from the center of this circle (xCurr, yCenter)
 * to the center of the next circle (xNext, yNextCenter).
 * Both circles sit ON TOP with solid colors & thick white borders,
 * completely hiding the endpoints and ensuring the curve NEVER pierces or overlaps awkwardly!
 */
@Composable
fun StageNodeRow(
    node: PathNode,
    currXOffset: Dp,
    nextXOffset: Dp,
    lineColor: Color,
    hasNextNode: Boolean,
    isPopupActive: Boolean = false,
    progressCount: Int = 1,
    rowHeight: Dp = 100.dp,
    onClick: () -> Unit,
    onDismissPopup: () -> Unit = {},
    onTogglePartClick: () -> Unit = {},
    onStartLesson: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(rowHeight),
        contentAlignment = Alignment.Center
    ) {
        // 1. BEZIER ROAD DRAWN BEHIND (Extending from center of this circle to center of next circle)
        if (hasNextNode) {
            androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
                val centerX = size.width / 2f
                val yCenter = size.height / 2f

                val xCurr = centerX + currXOffset.toPx()
                val xNext = centerX + nextXOffset.toPx()
                val yNext = yCenter + size.height // Reaches exactly the center of the next row's circle!

                val path = Path().apply {
                    moveTo(xCurr, yCenter)
                    cubicTo(
                        xCurr, yCenter + (yNext - yCenter) * 0.5f,
                        xNext, yCenter + (yNext - yCenter) * 0.5f,
                        xNext, yNext
                    )
                }

                drawPath(
                    path = path,
                    color = lineColor,
                    style = Stroke(
                        width = 13.dp.toPx(),
                        cap = StrokeCap.Round,
                        join = StrokeJoin.Round
                    )
                )
            }
        }

        // 2. THE NODE DRAWN ON TOP (Solid background + 3.5dp white border cleanly covers the center!)
        Box(
            modifier = Modifier.offset(x = currXOffset),
            contentAlignment = Alignment.Center
        ) {
            when (node.iconType) {
                NodeIconType.CAP, NodeIconType.DUMBBELL, NodeIconType.SHUFFLE, NodeIconType.BOOK -> {
                    Box(
                        modifier = Modifier
                            .size(76.dp)
                            .shadow(elevation = 6.dp, shape = CircleShape)
                            .clip(CircleShape)
                            .background(node.color)
                            .border(3.5.dp, Color.White, CircleShape)
                            .bouncyClick(scaleDown = 0.90f, onClick = onClick),
                        contentAlignment = Alignment.Center
                    ) {
                        // Gloss specular reflection highlight
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .offset(x = 12.dp, y = (-12).dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.45f))
                        )

                        Text(
                            text = when (node.iconType) {
                                NodeIconType.CAP -> "🎓"
                                NodeIconType.DUMBBELL -> "🏋️"
                                NodeIconType.SHUFFLE -> "🔀"
                                NodeIconType.BOOK -> "📖"
                                else -> "⭐"
                            },
                            fontSize = 32.sp
                        )
                    }
                }

                NodeIconType.CHEST -> {
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = Color(0xFFFFB300),
                        border = androidx.compose.foundation.BorderStroke(3.5.dp, Color.White),
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

                NodeIconType.REST_AREA -> {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = Color(0xFFE1F5FE),
                            border = androidx.compose.foundation.BorderStroke(3.dp, Color(0xFF03A9F4)),
                            shadowElevation = 4.dp,
                            modifier = Modifier
                                .size(76.dp)
                                .bouncyClick(scaleDown = 0.90f, onClick = onClick)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(text = "⛽", fontSize = 38.sp)
                            }
                        }
                    }
                }
            }
        }

        // 3. FLOATING GOLDEN STAGE POPUP OVERLAY (Highest Layer - Does not push stages down!)
        if (isPopupActive) {
            val density = LocalDensity.current
            val offsetY = remember(density) { with(density) { 68.dp.roundToPx() } }

            Popup(
                alignment = Alignment.TopCenter,
                offset = IntOffset(0, offsetY),
                onDismissRequest = onDismissPopup,
                properties = PopupProperties(
                    focusable = true,
                    dismissOnBackPress = true,
                    dismissOnClickOutside = true
                )
            ) {
                GoldenStagePopup(
                    node = node,
                    xOffset = currXOffset,
                    progressCount = progressCount,
                    onStartClick = onStartLesson,
                    onTogglePartClick = onTogglePartClick
                )
            }
        }
    }
}
