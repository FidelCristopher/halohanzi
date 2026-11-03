package com.example.chineselearning.ui.components

import androidx.compose.foundation.background
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.data.model.NodeIconType
import com.example.chineselearning.data.model.PathNode

@Composable
fun GoldenStagePopup(
    node: PathNode,
    xOffset: Dp,
    progressCount: Int = 1,
    onStartClick: () -> Unit,
    onTogglePartClick: () -> Unit = {}
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
            .padding(horizontal = 16.dp, vertical = 2.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Triangular notch pointing up toward the node circle
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
                .shadow(elevation = 12.dp, shape = RoundedCornerShape(20.dp))
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFFFF8F00)) // 3D Bottom darker rim
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp) // Exposes 5dp bottom 3D rim
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp, bottomStart = 16.dp, bottomEnd = 16.dp))
                    .background(goldGradient)
                    .padding(horizontal = 18.dp, vertical = 18.dp)
            ) {
                // Category Header (Vector Drawable Icon + Text)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    val (iconRes, categoryTitle) = when (node.iconType) {
                        NodeIconType.CAP -> Pair(com.example.chineselearning.R.drawable.ic_cap, "Belajar")
                        NodeIconType.DUMBBELL -> Pair(com.example.chineselearning.R.drawable.ic_dumbbell, "Latihan")
                        NodeIconType.SHUFFLE -> Pair(com.example.chineselearning.R.drawable.ic_shuffle, "Review Campuran")
                        NodeIconType.BOOK -> Pair(com.example.chineselearning.R.drawable.ic_book, "Kuis Cerita")
                        NodeIconType.CHEST -> Pair(com.example.chineselearning.R.drawable.ic_handshake, "Checkpoint Bab")
                        NodeIconType.REST_AREA -> Pair(com.example.chineselearning.R.drawable.ic_gas_station, "Rest Area")
                    }

                    Icon(
                        painter = androidx.compose.ui.res.painterResource(iconRes),
                        contentDescription = categoryTitle,
                        tint = Color(0xFF212121),
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = categoryTitle,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF212121)
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))

                // Lesson / Stage Title
                Text(
                    text = node.title,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1E293B)
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Action button and progress indicator containers
                val maxParts = if (node.iconType == NodeIconType.DUMBBELL) 3 else 2
                val progressText = "$progressCount/$maxParts"
                val buttonText = if (progressCount >= maxParts || node.isCompleted) "ULANGI" else "MULAI"

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Kotak 1: Tombol Putih "ULANGI" / "MULAI" (Lebar fleksibel)
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(50.dp)
                            .shadow(elevation = 4.dp, shape = RoundedCornerShape(25.dp))
                            .clip(RoundedCornerShape(25.dp))
                            .background(Color(0xFFD6D6D6)) // 3D rim bawah tombol
                    ) {
                        Surface(
                            shape = RoundedCornerShape(25.dp),
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(46.dp)
                                .bouncyClick(onClick = onStartClick)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(
                                    text = buttonText,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFFF9800),
                                    letterSpacing = 0.5.sp
                                )
                            }
                        }
                    }

                    // Kotak 2: Kotak Putih Terpisah "1/2" (atau "2/2") - Interaktif toggle 1/2 <-> 2/2
                    Box(
                        modifier = Modifier
                            .width(76.dp)
                            .height(50.dp)
                            .shadow(elevation = 4.dp, shape = RoundedCornerShape(25.dp))
                            .clip(RoundedCornerShape(25.dp))
                            .background(Color(0xFFD6D6D6)) // 3D rim bawah kotak
                    ) {
                        Surface(
                            shape = RoundedCornerShape(25.dp),
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(46.dp)
                                .bouncyClick(onClick = onTogglePartClick)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(
                                    text = progressText,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFFF8F00),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun DumbbellShapeIcon(
    tint: Color = Color.White,
    modifier: Modifier = Modifier.size(24.dp)
) {
    androidx.compose.foundation.Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val barThickness = w * 0.24f
        val radius = androidx.compose.ui.geometry.CornerRadius(barThickness / 2f, barThickness / 2f)

        // Left weight (vertical rounded rect)
        drawRoundRect(
            color = tint,
            topLeft = androidx.compose.ui.geometry.Offset(0f, 0f),
            size = androidx.compose.ui.geometry.Size(barThickness, h),
            cornerRadius = radius
        )

        // Right weight (vertical rounded rect)
        drawRoundRect(
            color = tint,
            topLeft = androidx.compose.ui.geometry.Offset(w - barThickness, 0f),
            size = androidx.compose.ui.geometry.Size(barThickness, h),
            cornerRadius = radius
        )

        // Middle connector (horizontal bar)
        val connectorH = h * 0.24f
        drawRoundRect(
            color = tint,
            topLeft = androidx.compose.ui.geometry.Offset(barThickness * 0.7f, (h - connectorH) / 2f),
            size = androidx.compose.ui.geometry.Size(w - barThickness * 1.4f, connectorH),
            cornerRadius = androidx.compose.ui.geometry.CornerRadius(connectorH / 2f, connectorH / 2f)
        )
    }
}
