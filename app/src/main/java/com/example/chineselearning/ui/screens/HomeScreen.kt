package com.example.chineselearning.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import com.example.chineselearning.R
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

// Helper function to calculate a rich 3D bottom bevel rim color
fun getNodeRimColor(color: Color): Color {
    return Color(
        red = (color.red * 0.74f).coerceIn(0f, 1f),
        green = (color.green * 0.74f).coerceIn(0f, 1f),
        blue = (color.blue * 0.74f).coerceIn(0f, 1f),
        alpha = color.alpha
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onSelectLesson: (Lesson, String) -> Unit,
    onSelectStory: (Story) -> Unit
) {
    val allUnits = LearningRepository.units
    var selectedHskLevel by remember { mutableStateOf(1) }
    var showHskMenu by remember { mutableStateOf(false) }

    var activePopupNodeId by remember { mutableStateOf<String?>("u1_n3") } // Defaults to Node 3 (Halo!)

    // Winding path horizontal offsets (serpentine road sequence)
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
        contentPadding = PaddingValues(bottom = 90.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TOP APP BAR: Modern Status Capsules Row
        item {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(
                        elevation = 4.dp,
                        spotColor = Color(0x12000000),
                        ambientColor = Color(0x08000000)
                    ),
                color = Color.White,
                border = BorderStroke(1.dp, Color(0xFFF3F3F8))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Left: HSK 1 - 6 Dropdown Capsule
                    Box {
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = Color(0xFFF1ECFC),
                            border = BorderStroke(1.dp, Color(0xFFD6C8F6)),
                            modifier = Modifier.bouncyClick { showHskMenu = true }
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Shield,
                                    contentDescription = null,
                                    tint = Color(0xFF5E35B1),
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(
                                    text = "HSK $selectedHskLevel",
                                    fontFamily = NunitoFontFamily,
                                    fontSize = 12.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF5E35B1)
                                )
                                Spacer(modifier = Modifier.width(2.dp))
                                Icon(
                                    imageVector = Icons.Default.ArrowDropDown,
                                    contentDescription = "Pilih Level HSK",
                                    modifier = Modifier.size(16.dp),
                                    tint = Color(0xFF5E35B1)
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
                                            if (level == selectedHskLevel) {
                                                Icon(
                                                    imageVector = Icons.Default.Check,
                                                    contentDescription = null,
                                                    tint = Color(0xFF00C48C),
                                                    modifier = Modifier.size(16.dp)
                                                )
                                                Spacer(modifier = Modifier.width(6.dp))
                                            } else {
                                                Spacer(modifier = Modifier.width(22.dp))
                                            }
                                            Column {
                                                Text(
                                                    text = "Level HSK $level",
                                                    fontFamily = NunitoFontFamily,
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 13.sp,
                                                    color = if (level == selectedHskLevel) Color(0xFF5E35B1) else DeepNavy
                                                )
                                                Text(
                                                    text = desc,
                                                    fontFamily = NunitoFontFamily,
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

                    // Center: Crown Status Pill
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = Color(0xFFFFF9E6),
                        border = BorderStroke(1.dp, Color(0xFFFFECB3))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_crown),
                                contentDescription = "Crown",
                                tint = Color.Unspecified,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }

                    // Right: Streak Flame Capsule & Gold Coin Capsule
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        // Streak Flame Capsule
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = Color(0xFFFFF4EC),
                            border = BorderStroke(1.dp, Color(0xFFFFDBC8))
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 9.dp, vertical = 5.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.ic_fire),
                                    contentDescription = "Streak",
                                    tint = Color.Unspecified,
                                    modifier = Modifier.size(17.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "0",
                                    fontFamily = NunitoFontFamily,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFE65100)
                                )
                            }
                        }

                        // Gold Coin Capsule
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = Color(0xFFFFF8E1),
                            border = BorderStroke(1.dp, Color(0xFFFFE082))
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.ic_coin),
                                    contentDescription = "Coin",
                                    tint = Color.Unspecified,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "171",
                                    fontFamily = NunitoFontFamily,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFE65100)
                                )
                            }
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
                    Icon(
                        painter = painterResource(R.drawable.ic_rocket),
                        contentDescription = "Coming Soon",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(64.dp)
                    )
                    Spacer(modifier = Modifier.height(14.dp))
                    Text(
                        text = "Materi HSK $selectedHskLevel Segera Hadir!",
                        fontFamily = NunitoFontFamily,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepNavy
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Saat ini kita berfokus menuntaskan seluruh 150 kosakata dan 6 bab lengkap di HSK 1 terlebih dahulu.",
                        fontFamily = NunitoFontFamily,
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
                        Text(text = "Kembali ke HSK 1", fontFamily = NunitoFontFamily, fontWeight = FontWeight.Bold)
                    }
                }
            }
        } else {
            // HSK 1: RENDER ALL 6 CHAPTERS IN ONE CONTINUOUS ROAD!
            allUnits.forEachIndexed { unitIdx, chapterUnit ->
                val (bannerBg, connectorColor) = chapterThemeColors[unitIdx % chapterThemeColors.size]
                val chapterDarkRim = getNodeRimColor(bannerBg)

                // CHAPTER HEADER (Hero character for Bab 1, or Banner for Bab 2 - 6)
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 10.dp)
                    ) {
                        // Grandpa Character (Shown on Bab 1)
                        if (unitIdx == 0) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 8.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.Bottom
                            ) {
                                Row(verticalAlignment = Alignment.Bottom) {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_avatar_teacher),
                                        contentDescription = "Teacher",
                                        tint = Color.Unspecified,
                                        modifier = Modifier.size(54.dp)
                                    )
                                    // Modern Speech Bubble with 3D bevel and KaiTi font
                                    Box(
                                        modifier = Modifier
                                            .padding(bottom = 8.dp, start = 6.dp)
                                            .shadow(elevation = 6.dp, shape = RoundedCornerShape(16.dp))
                                            .clip(RoundedCornerShape(16.dp))
                                            .background(Color(0xFFC2185B))
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .padding(bottom = 3.dp)
                                                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp, bottomStart = 13.dp, bottomEnd = 13.dp))
                                                .background(
                                                    Brush.verticalGradient(
                                                        listOf(Color(0xFFEC407A), Color(0xFFE91E63))
                                                    )
                                                )
                                                .padding(horizontal = 12.dp, vertical = 6.dp)
                                        ) {
                                            Text(
                                                text = "你好！",
                                                fontFamily = KaiTiFontFamily,
                                                color = Color.White,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 14.sp
                                            )
                                        }
                                    }
                                }

                                // Chapter Pouch Progress Capsule
                                Surface(
                                    shape = RoundedCornerShape(16.dp),
                                    color = Color(0xFFFFEBEE),
                                    border = BorderStroke(1.dp, Color(0xFFFFCDD2)),
                                    shadowElevation = 2.dp
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            painter = painterResource(R.drawable.ic_pouch),
                                            contentDescription = "Pouch",
                                            tint = Color.Unspecified,
                                            modifier = Modifier.size(16.dp)
                                        )
                                        Spacer(modifier = Modifier.width(5.dp))
                                        Text(
                                            text = "1 / 3",
                                            fontFamily = NunitoFontFamily,
                                            fontSize = 11.5.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color(0xFFC62828)
                                        )
                                    }
                                }
                            }
                        }

                        // Modern 3D Elevated Chapter Card
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .shadow(elevation = 8.dp, shape = RoundedCornerShape(22.dp))
                                .clip(RoundedCornerShape(22.dp))
                                .background(chapterDarkRim)
                        ) {
                            Surface(
                                shape = RoundedCornerShape(topStart = 22.dp, topEnd = 22.dp, bottomStart = 18.dp, bottomEnd = 18.dp),
                                color = bannerBg,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 4.dp)
                                    .bouncyClick {
                                        activePopupNodeId = chapterUnit.nodes.firstOrNull()?.id
                                    }
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 18.dp, vertical = 14.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        // Integrated Unit Badge Pill
                                        Surface(
                                            shape = RoundedCornerShape(8.dp),
                                            color = connectorColor.copy(alpha = 0.5f),
                                            modifier = Modifier.padding(bottom = 6.dp)
                                        ) {
                                            Text(
                                                text = "BAB ${chapterUnit.unitNumber}",
                                                fontFamily = NunitoFontFamily,
                                                fontSize = 11.sp,
                                                fontWeight = FontWeight.ExtraBold,
                                                color = DeepNavy,
                                                letterSpacing = 0.5.sp,
                                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                                            )
                                        }

                                        Text(
                                            text = chapterUnit.bannerTitle,
                                            fontFamily = NunitoFontFamily,
                                            fontSize = 18.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = DeepNavy
                                        )
                                        Spacer(modifier = Modifier.height(2.dp))
                                        Text(
                                            text = chapterUnit.subtitle,
                                            fontFamily = NunitoFontFamily,
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = SlateGray
                                        )
                                    }

                                    // Right: Chapter Guidebook & Trophy Badge
                                    Surface(
                                        shape = RoundedCornerShape(14.dp),
                                        color = Color.White.copy(alpha = 0.85f),
                                        border = BorderStroke(1.dp, connectorColor.copy(alpha = 0.6f)),
                                        shadowElevation = 2.dp,
                                        modifier = Modifier.padding(start = 12.dp)
                                    ) {
                                        Row(
                                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            if (unitIdx == 0) {
                                                Icon(
                                                    painter = painterResource(R.drawable.ic_hand_wave),
                                                    contentDescription = null,
                                                    tint = Color.Unspecified,
                                                    modifier = Modifier.size(20.dp)
                                                )
                                            } else {
                                                Text(text = chapterUnit.emoji, fontSize = 18.sp)
                                            }
                                            Spacer(modifier = Modifier.width(4.dp))
                                            Icon(
                                                imageVector = Icons.Default.Star,
                                                contentDescription = null,
                                                tint = Color(0xFFFFB300),
                                                modifier = Modifier.size(18.dp)
                                            )
                                        }
                                    }
                                }
                            }
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
                            val maxParts = if (node.iconType == NodeIconType.DUMBBELL) 3 else 2
                            LearningRepository.toggleStageProgress(node.id, maxParts)
                        },
                        onStartLesson = {
                            activePopupNodeId = null
                            when (node.iconType) {
                                NodeIconType.CAP, NodeIconType.DUMBBELL, NodeIconType.SHUFFLE -> {
                                    val targetLesson = chapterUnit.lessons.find { it.id == node.lessonId } ?: chapterUnit.lessons.first()
                                    onSelectLesson(targetLesson, node.id)
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
 * Draws a multi-layered 3D road with subtle depth shadow,
 * and renders modern 3D pushable button stage nodes!
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
    rowHeight: Dp = 104.dp,
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
        // 1. DUAL-LAYER BEZIER ROAD (Depth shadow underneath + smooth vibrant road on top)
        if (hasNextNode) {
            androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
                val centerX = size.width / 2f
                val yCenter = size.height / 2f

                val xCurr = centerX + currXOffset.toPx()
                val xNext = centerX + nextXOffset.toPx()
                val yNext = yCenter + size.height

                val path = Path().apply {
                    moveTo(xCurr, yCenter)
                    cubicTo(
                        xCurr, yCenter + (yNext - yCenter) * 0.5f,
                        xNext, yCenter + (yNext - yCenter) * 0.5f,
                        xNext, yNext
                    )
                }

                // Road Bottom Shadow for 3D depth
                drawPath(
                    path = path,
                    color = Color(0x1A000000),
                    style = Stroke(
                        width = 16.dp.toPx(),
                        cap = StrokeCap.Round,
                        join = StrokeJoin.Round
                    )
                )

                // Road Surface
                drawPath(
                    path = path,
                    color = lineColor,
                    style = Stroke(
                        width = 12.dp.toPx(),
                        cap = StrokeCap.Round,
                        join = StrokeJoin.Round
                    )
                )
            }
        }

        // 2. THE 3D PUSHABLE BUTTON NODE CIRCLE
        Box(
            modifier = Modifier.offset(x = currXOffset),
            contentAlignment = Alignment.Center
        ) {
            val rimColor = getNodeRimColor(node.color)

            when (node.iconType) {
                NodeIconType.CAP, NodeIconType.DUMBBELL, NodeIconType.SHUFFLE, NodeIconType.BOOK -> {
                    // Modern 3D Pushable Circular Node
                    Box(
                        modifier = Modifier
                            .size(76.dp)
                            .bouncyClick(scaleDown = 0.88f, onClick = onClick),
                        contentAlignment = Alignment.Center
                    ) {
                        // 3D Bottom Base Rim (darker color behind)
                        Box(
                            modifier = Modifier
                                .size(76.dp)
                                .offset(y = 5.dp)
                                .clip(CircleShape)
                                .background(rimColor)
                        )

                        // Top Elevated Circular Face with 4dp white border and gloss highlight
                        Box(
                            modifier = Modifier
                                .size(76.dp)
                                .clip(CircleShape)
                                .background(
                                    Brush.verticalGradient(
                                        listOf(
                                            node.color,
                                            node.color.copy(alpha = 0.95f)
                                        )
                                    )
                                )
                                .border(4.dp, Color.White, CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            // Subtle gloss specular highlight at top rim
                            Box(
                                modifier = Modifier
                                    .size(width = 44.dp, height = 20.dp)
                                    .align(Alignment.TopCenter)
                                    .offset(y = 5.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.35f))
                            )

                            // Vector Icon inside Node
                            when (node.iconType) {
                                NodeIconType.CAP -> {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_cap),
                                        contentDescription = "Belajar",
                                        tint = Color.White,
                                        modifier = Modifier.size(36.dp)
                                    )
                                }
                                NodeIconType.DUMBBELL -> {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_dumbbell),
                                        contentDescription = "Latihan",
                                        tint = Color.White,
                                        modifier = Modifier.size(34.dp)
                                    )
                                }
                                NodeIconType.SHUFFLE -> {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_shuffle),
                                        contentDescription = "Review",
                                        tint = Color.White,
                                        modifier = Modifier.size(34.dp)
                                    )
                                }
                                NodeIconType.BOOK -> {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_book),
                                        contentDescription = "Kuis",
                                        tint = Color.White,
                                        modifier = Modifier.size(36.dp)
                                    )
                                }
                                else -> {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = null,
                                        tint = Color.White,
                                        modifier = Modifier.size(34.dp)
                                    )
                                }
                            }
                        }
                    }
                }

                NodeIconType.CHEST -> {
                    val chestRim = getNodeRimColor(Color(0xFFFFB300))
                    Box(
                        modifier = Modifier
                            .size(76.dp)
                            .bouncyClick(scaleDown = 0.88f, onClick = onClick),
                        contentAlignment = Alignment.Center
                    ) {
                        // 3D Bottom Base Rim
                        Box(
                            modifier = Modifier
                                .size(76.dp)
                                .offset(y = 5.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .background(chestRim)
                        )

                        // Top Elevated Face
                        Surface(
                            shape = RoundedCornerShape(20.dp),
                            color = Color(0xFFFFB300),
                            border = BorderStroke(4.dp, Color.White),
                            modifier = Modifier.size(76.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    painter = painterResource(R.drawable.ic_handshake),
                                    contentDescription = "Checkpoint",
                                    tint = Color.White,
                                    modifier = Modifier.size(40.dp)
                                )
                            }
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
                            border = BorderStroke(3.dp, Color(0xFF03A9F4)),
                            shadowElevation = 6.dp,
                            modifier = Modifier
                                .size(76.dp)
                                .bouncyClick(scaleDown = 0.88f, onClick = onClick)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    painter = painterResource(R.drawable.ic_gas_station),
                                    contentDescription = "Rest Area",
                                    tint = Color(0xFF03A9F4),
                                    modifier = Modifier.size(38.dp)
                                )
                            }
                        }
                    }
                }
            }
        }

        // 3. FLOATING GOLDEN STAGE POPUP OVERLAY
        if (isPopupActive) {
            val density = LocalDensity.current
            val offsetY = remember(density) { with(density) { 72.dp.roundToPx() } }

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
