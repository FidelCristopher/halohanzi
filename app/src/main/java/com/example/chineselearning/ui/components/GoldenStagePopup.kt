package com.example.chineselearning.ui.components

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.data.model.NodeIconType
import com.example.chineselearning.data.model.PathNode

@Composable
fun GoldenStagePopup(
    node: PathNode,
    xOffset: Dp,
    onStartClick: () -> Unit
) {
    val goldGradient = Brush.verticalGradient(
        colors = listOf(
            Color(0xFFFFEA00), // Bright golden top
            Color(0xFFFFC400)  // Deep golden bottom
        )
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Triangular notch pointing up toward the node circle (Screenshot WhatsApp Image 2026-10-26 at 22.11.46.jpeg)
        androidx.compose.foundation.Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        ) {
            val centerX = (size.width / 2f) + xOffset.toPx()
            val tipX = centerX
            val tipY = 0f
            val baseLeft = centerX - 12.dp.toPx()
            val baseRight = centerX + 12.dp.toPx()
            val baseY = size.height

            val trianglePath = Path().apply {
                moveTo(tipX, tipY)
                lineTo(baseLeft, baseY)
                lineTo(baseRight, baseY)
                close()
            }
            drawPath(path = trianglePath, color = Color(0xFFFFEA00))
        }

        // Golden Card Body with 3D bottom rim
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .shadow(elevation = 10.dp, shape = RoundedCornerShape(20.dp))
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFFFF8F00)) // 3D Bottom darker rim
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp) // Exposes 5dp bottom 3D rim
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp, bottomStart = 16.dp, bottomEnd = 16.dp))
                    .background(goldGradient)
                    .padding(horizontal = 20.dp, vertical = 18.dp)
            ) {
                // Category Header (🎓 Belajar or 🏋️ Latihan)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = when (node.iconType) {
                            NodeIconType.CAP -> "🎓 Belajar"
                            NodeIconType.DUMBBELL -> "🏋️ Latihan"
                            NodeIconType.SHUFFLE -> "🔀 Review Campuran"
                            NodeIconType.BOOK -> "📖 Kuis Cerita"
                            NodeIconType.CHEST -> "🤝 Checkpoint Bab"
                            NodeIconType.REST_AREA -> "⛽ Rest Area"
                        },
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF212121)
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))

                // Lesson / Stage Title
                Text(
                    text = if (node.title == "Sapaan 1") "Halo!" else node.title,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1E293B)
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Bottom Action Row: Big White Pill Button + "1/2" Progress
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    // White Button with 3D bottom shadow (ULANGI / MULAI)
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(48.dp)
                            .shadow(elevation = 4.dp, shape = RoundedCornerShape(24.dp))
                            .clip(RoundedCornerShape(24.dp))
                            .background(Color(0xFFE0E0E0)) // Button 3D bottom rim
                    ) {
                        Surface(
                            shape = RoundedCornerShape(24.dp),
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(45.dp)
                                .bouncyClick(onClick = onStartClick)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(
                                    text = if (node.isCompleted) "ULANGI" else "MULAI",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFFF9800),
                                    letterSpacing = 0.5.sp
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    // Progress indicator text (1/2 or 0/2)
                    Text(
                        text = if (node.isCompleted) "1/2" else "0/2",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFF8F00),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                }
            }
        }
    }
}
