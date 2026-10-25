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
    var currentUnitIndex by remember { mutableStateOf(0) }
    val unit = allUnits[currentUnitIndex]

    var showUnitMenu by remember { mutableStateOf(false) }
    var selectedLessonForSheet by remember { mutableStateOf<Lesson?>(null) }

    val pathXOffsets = listOf(
        0.dp,        // Node 1: Pink Cap (Center)
        65.dp,       // Node 2: Yellow Cap (Right)
        0.dp,        // Node 3: Yellow Dumbbell H (Center)
        (-65).dp,    // Node 4: Yellow Cap (Left)
        0.dp,        // Node 5: Yellow Dumbbell H (Center)
        0.dp,        // Node 6: Gold Checkpoint Chest (Center)
        0.dp         // Node 7: Blue Rest Area Gas Pump (Center)
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFDFE)),
        contentPadding = PaddingValues(bottom = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TOP APP BAR (Screenshot 1)
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(horizontal = 16.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Left: Level 1 Shield Badge with Unit Selector Dropdown
                Box {
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = Color(0xFFEDE7F6),
                        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF7E57C2)),
                        modifier = Modifier.bouncyClick { showUnitMenu = true }
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "🛡️ Bab ${unit.unitNumber}", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color(0xFF512DA8))
                            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null, modifier = Modifier.size(16.dp), tint = Color(0xFF512DA8))
                        }
                    }

                    DropdownMenu(
                        expanded = showUnitMenu,
                        onDismissRequest = { showUnitMenu = false }
                    ) {
                        allUnits.forEachIndexed { idx, u ->
                            DropdownMenuItem(
                                text = {
                                    Column {
                                        Text(text = "Bab ${u.unitNumber}: ${u.title}", fontWeight = FontWeight.Bold, fontSize = 13.sp)
                                        Text(text = "${u.level} • ${u.subtitle}", fontSize = 11.sp, color = SlateGray)
                                    }
                                },
                                onClick = {
                                    currentUnitIndex = idx
                                    showUnitMenu = false
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

        // UNIT HEADER HERO (Screenshot 1)
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
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

                    // Fortune Bag 0 / 1
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

                // Unit Banner
                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = Color(0xFFFCE4EC),
                    modifier = Modifier
                        .fillMaxWidth()
                        .bouncyClick {
                            selectedLessonForSheet = unit.lessons.first()
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 14.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = unit.bannerTitle,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFFAD1457)
                            )
                            Text(
                                text = unit.subtitle,
                                fontSize = 11.sp,
                                color = Color(0xFFC2185B)
                            )
                        }

                        Text(text = "⭐🃏", fontSize = 20.sp)
                    }
                }

                // Sub-pill "1"
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = Color(0xFFF8BBD0),
                    modifier = Modifier.padding(top = 4.dp, start = 20.dp)
                ) {
                    Text(
                        text = "${unit.unitNumber}",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF880E4F),
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 2.dp)
                    )
                }
            }
        }

        // WINDING SERPENTINE 3D NODES (Screenshots 1, 2, 3)
        itemsIndexed(unit.nodes) { index, node ->
            val xOffset = pathXOffsets.getOrElse(index) { 0.dp }

            if (index > 0) {
                Box(
                    modifier = Modifier
                        .height(34.dp)
                        .width(28.dp)
                        .background(
                            color = if (node.iconType == NodeIconType.REST_AREA) Color(0xFF81D4FA) else Color(0xFFF8BBD0),
                            shape = RoundedCornerShape(14.dp)
                        )
                )
            }

            when (node.iconType) {
                NodeIconType.CAP, NodeIconType.DUMBBELL -> {
                    GlossyCircleNode(
                        node = node,
                        xOffset = xOffset,
                        onClick = {
                            selectedLessonForSheet = unit.lessons.first()
                        }
                    )
                }

                NodeIconType.CHEST -> {
                    GoldCheckpointNode(
                        onClick = {
                            onSelectStory(unit.story)
                        }
                    )
                }

                NodeIconType.REST_AREA -> {
                    RestAreaNode(
                        onClick = {
                            // Advance to next unit if available
                            if (currentUnitIndex < allUnits.lastIndex) {
                                currentUnitIndex++
                            }
                        }
                    )
                }
            }
        }

        // FLOATING NOTIFICATION TOOLTIP (Screenshot 1)
        item {
            Spacer(modifier = Modifier.height(20.dp))
            Surface(
                shape = RoundedCornerShape(18.dp),
                color = Color(0xFFFFB300),
                shadowElevation = 6.dp,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .bouncyClick { selectedLessonForSheet = unit.lessons.first() }
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "🔔", fontSize = 18.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Anda punya pesan baru! >",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }

                    Icon(
                        imageVector = Icons.Default.ArrowDownward,
                        contentDescription = "Buka",
                        tint = Color.White
                    )
                }
            }
        }
    }

    // Modal Bottom Sheet when user clicks a node
    if (selectedLessonForSheet != null) {
        val lesson = selectedLessonForSheet!!
        ModalBottomSheet(
            onDismissRequest = { selectedLessonForSheet = null },
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
                        Text(text = "🎓", fontSize = 26.sp)
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                    Column {
                        Text(
                            text = lesson.title,
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
                            selectedLessonForSheet = null
                            onSelectStory(unit.story)
                        }
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(text = "Baca Cerita: 《${unit.story.titleHanzi}》", fontWeight = FontWeight.Bold, color = Color(0xFF7A4B00))
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

// 3D GLOSSY CIRCLE NODE WITH BOUNCY TOUCH (Screenshots 1, 2)
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

// GOLD CHECKPOINT CHEST NODE (Screenshot 2)
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

// REST AREA NODE (Screenshot 2)
@Composable
fun RestAreaNode(
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
                text = "Rest area (Lanjut Bab)",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = Color(0xFF0288D1),
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
            )
        }
    }
}
