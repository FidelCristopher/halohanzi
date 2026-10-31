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

                // Action button and progress indicator containers
                val progressText = "$progressCount/2"
                val buttonText = if (progressCount >= 2 || node.isCompleted) "ULANGI" else "MULAI"

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
