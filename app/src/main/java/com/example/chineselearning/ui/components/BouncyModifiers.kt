package com.example.chineselearning.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.graphicsLayer

/**
 * Reusable Bouncy Click Modifier
 * Gives a tactile spring bounce effect when pressed for interactive components.
 */
fun Modifier.bouncyClick(
    scaleDown: Float = 0.93f,
    onClick: () -> Unit
): Modifier = composed {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isPressed) scaleDown else 1.0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        ),
        label = "bouncyScale"
    )

    this
        .graphicsLayer {
            scaleX = scale
            scaleY = scale
        }
        .clickable(
            interactionSource = interactionSource,
            indication = null,
            onClick = onClick
        )
}

/**
 * Shake offset modifier for incorrect answers
 */
fun Modifier.shake(trigger: Boolean): Modifier = composed {
    val shakeAnim = remember { Animatable(0f) }

    LaunchedEffect(trigger) {
        if (trigger) {
            shakeAnim.animateTo(
                targetValue = 0f,
                animationSpec = keyframes {
                    durationMillis = 400
                    0f at 0
                    (-14f) at 60
                    14f at 120
                    (-10f) at 180
                    10f at 240
                    (-5f) at 300
                    5f at 350
                    0f at 400
                }
            )
        }
    }

    this.graphicsLayer {
        translationX = shakeAnim.value
    }
}
