package com.example.chineselearning.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Chat
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val ActivePurple = Color(0xFF6A4CE4)
private val InactiveGray = Color(0xFF6E7179)

data class NavTabItem(
    val title: String,
    val icon: ImageVector,
    val hasNotificationDot: Boolean = false
)

@Composable
fun HaloHanziNavBar(
    selectedTab: Int,
    onTabSelected: (Int) -> Unit
) {
    val tabs = listOf(
        NavTabItem("Belajar", Icons.Default.School),
        NavTabItem("Latihan", Icons.Outlined.FitnessCenter),
        NavTabItem("Cerita", Icons.Outlined.AutoStories),
        NavTabItem("Imersi", Icons.AutoMirrored.Outlined.Chat, hasNotificationDot = true),
        NavTabItem("Saya", Icons.Outlined.Person)
    )

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 16.dp,
                shape = RoundedCornerShape(topStart = 22.dp, topEnd = 22.dp),
                spotColor = Color(0x22000000),
                ambientColor = Color(0x11000000)
            ),
        shape = RoundedCornerShape(topStart = 22.dp, topEnd = 22.dp),
        color = Color.White,
        border = androidx.compose.foundation.BorderStroke(0.8.dp, Color(0xFFF0F0F0))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .navigationBarsPadding()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                tabs.forEachIndexed { index, tab ->
                    val isSelected = selectedTab == index
                    val interactionSource = remember { MutableInteractionSource() }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .clickable(
                                interactionSource = interactionSource,
                                indication = null,
                                onClick = { onTabSelected(index) }
                            )
                            .padding(vertical = 4.dp)
                    ) {
                        // Icon Container with optional Notification Dot
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.size(28.dp)
                        ) {
                            Icon(
                                imageVector = tab.icon,
                                contentDescription = tab.title,
                                tint = if (isSelected) ActivePurple else InactiveGray,
                                modifier = Modifier.size(24.dp)
                            )

                            // Notification dot on Imersi tab
                            if (tab.hasNotificationDot) {
                                Box(
                                    modifier = Modifier
                                        .size(6.dp)
                                        .align(Alignment.TopEnd)
                                        .offset(x = 1.dp, y = (-1).dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFFFF3B30))
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(3.dp))

                        // Text Label
                        Text(
                            text = tab.title,
                            fontSize = 11.sp,
                            fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Medium,
                            color = if (isSelected) ActivePurple else InactiveGray,
                            letterSpacing = 0.2.sp
                        )
                    }
                }
            }
        }
    }
}
