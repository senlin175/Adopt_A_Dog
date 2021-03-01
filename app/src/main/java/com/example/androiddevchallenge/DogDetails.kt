package com.example.androiddevchallenge

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlin.math.roundToInt

@Composable
fun DogDetails() {
    val viewModel : MyViewModel = viewModel()
    viewModel.title = "狗狗详情"
    val index = animateFloatAsState(if (viewModel.lookPuppy)0f else 1f)
    Box(modifier = Modifier
        .layout { measurable, constraints ->
            val placeable = measurable.measure(constraints)
            layout(placeable.width, placeable.height) {

                val offset = (index.value * placeable.width).roundToInt()
                placeable.placeRelative(offset, 0)
            }
        }
        .background(Color.Blue)
        .fillMaxSize())
}