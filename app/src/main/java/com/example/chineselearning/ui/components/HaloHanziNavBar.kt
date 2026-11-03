package com.example.chineselearning.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Chat
import androidx.compose.material.icons.automirrored.rounded.Chat
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chineselearning.ui.theme.NunitoFontFamily

// Modern Duolingo / Expressive Palette
private val ActivePurple = Color(0xFF6A4CE4)
private val InactiveGray = Color(0xFF8E8E98)
private val FloatingBorderColor = Color(0xFFECEAF6)

data class NavTabItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNotificationDot: Boolean = false
)

@Composable
fun HaloHanziNavBar(
    selectedTab: Int,
    onTabSelected: (Int) -> Unit
) {
    val tabs = listOf(
        NavTabItem("Belajar", Icons.Rounded.School, Icons.Outlined.School),
        NavTabItem("Latihan", Icons.Rounded.FitnessCenter, Icons.Outlined.FitnessCenter),
        NavTabItem("Cerita", Icons.Rounded.AutoStories, Icons.Outlined.AutoStories),
        NavTabItem("Imersi", Icons.AutoMirrored.Rounded.Chat, Icons.AutoMirrored.Outlined.Chat, hasNotificationDot = true),
        NavTabItem("Saya", Icons.Rounded.Person, Icons.Outlined.Person)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(horizontal = 14.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        // Floating Island Surface with soft brand-tinted ambient glow
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .shadow(
                    elevation = 16.dp,
                    shape = RoundedCornerShape(30.dp),
                    spotColor = Color(0x356A4CE4),
                    ambientColor = Color(0x1A000000)
                ),
            shape = RoundedCornerShape(30.dp),
            color = Color.White,
            border = BorderStroke(1.2.dp, FloatingBorderColor)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 6.dp, vertical = 6.dp)
                    .height(62.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                tabs.forEachIndexed { index, tab ->
                    val isSelected = selectedTab == index
                    val interactionSource = remember { MutableInteractionSource() }

                    // Bouncy spring animation for selected icon scale
                    val iconScale by animateFloatAsState(
                        targetValue = if (isSelected) 1.14f else 1.0f,
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness = Spring.StiffnessLow
                        ),
                        label = "iconScale"
                    )

                    // Smooth fade and scale for pill container
                    val pillAlpha by animateFloatAsState(
                        targetValue = if (isSelected) 1f else 0f,
                        animationSpec = tween(durationMillis = 200),
                        label = "pillAlpha"
                    )

                    val activeColor by animateColorAsState(
                        targetValue = if (isSelected) ActivePurple else InactiveGray,
                        animationSpec = tween(durationMillis = 200),
                        label = "activeColor"
                    )

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .clip(RoundedCornerShape(22.dp))
                            .clickable(
                                interactionSource = interactionSource,
                                indication = null,
                                onClick = { onTabSelected(index) }
                            )
                            .padding(vertical = 2.dp)
                    ) {
                        // Capsule indicator box around the icon
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .height(32.dp)
                                .width(52.dp)
                        ) {
                            // Subtle gradient pill with hairline border for selected tab
                            if (pillAlpha > 0.01f) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(
                                            Brush.verticalGradient(
                                                listOf(
                                                    Color(0xFFF3EDFF).copy(alpha = pillAlpha),
                                                    Color(0xFFEBE0FE).copy(alpha = pillAlpha)
                                                )
                                            )
                                        )
                                        .border(
                                            width = 1.dp,
                                            color = ActivePurple.copy(alpha = 0.16f * pillAlpha),
                                            shape = RoundedCornerShape(16.dp)
                                        )
                                )
                            }

                            // Dynamic icon (Filled/Rounded when active, Outlined when inactive)
                            Icon(
                                imageVector = if (isSelected) tab.selectedIcon else tab.unselectedIcon,
                                contentDescription = tab.title,
                                tint = activeColor,
                                modifier = Modifier
                                    .size(23.dp)
                                    .scale(iconScale)
                            )

                            // Modern badge with crisp white outline ring
                            if (tab.hasNotificationDot) {
                                Box(
                                    modifier = Modifier
                                        .size(9.dp)
                                        .align(Alignment.TopEnd)
                                        .offset(x = (-7).dp, y = 1.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFFFF3B30))
                                        .border(1.5.dp, Color.White, CircleShape)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(3.dp))

                        // Text label with Nunito typography
                        Text(
                            text = tab.title,
                            fontFamily = NunitoFontFamily,
                            fontSize = 11.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.SemiBold,
                            color = activeColor,
                            letterSpacing = 0.25.sp
                        )
                    }
                }
            }
        }
    }
}
