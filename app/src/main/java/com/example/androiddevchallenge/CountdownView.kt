package com.example.androiddevchallenge

import android.os.Handler
import android.util.Log
import android.util.Log.DEBUG
import android.widget.EdgeEffect
import androidx.annotation.ColorRes
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.packFloats
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlin.random.Random


@Composable
fun CountdownView(modifier: Modifier = Modifier, numss: Array<Array<Int>>, size: Dp) {
    val viewModel: MyViewModel = viewModel()
    var blue by remember { mutableStateOf(true) }
    /*val color by animateColorAsState(
        if (blue) White else Color(0xff2b6d8c),
        animationSpec = spring(Spring.StiffnessVeryLow, 1000000f),
//        finishedListener = {
//            blue = !blue
//        }
    )*/

    val color1 by animateColorAsState(
        White,
        animationSpec = spring(Spring.StiffnessVeryLow, 500000f),
    )

    val color2 by animateColorAsState(
        Color(0xff2b6d8c),
        animationSpec = spring(Spring.StiffnessVeryLow, 500000f),
    )

    val rotation by animateFloatAsState(
        if (blue) 89f else 0f,
        animationSpec = spring(30f, 1000000f),
        finishedListener = {
            blue = !blue
        }
    )

    val rotation1 by animateFloatAsState(
        targetValue = 0f,
        animationSpec = spring(Spring.StiffnessVeryLow, 1000000f),
    )

    val rotation2 by animateFloatAsState(
        targetValue = 89f,
        animationSpec = spring(Spring.StiffnessVeryLow, 1000000f),
    )

    return LazyColumn {
        itemsIndexed(numss) { itemPosition, row ->
//            Log.d("6688", row.toString())
            LazyRow {
                itemsIndexed(row) { position, data ->
//                    Log.d("6688", data.toString())
                    Log.d("6688", "item   $itemPosition   posttion     $position")
                    Box(
                        modifier = Modifier
                            .graphicsLayer(
//                                    transformOrigin = TransformOrigin(packFloats(1f,0f)),
//                                rotationX = if(!viewModel.isRun) 89f else (if (num[viewModel.aa % 10][itemPosition][position] == 1) rotation1 else rotation2),
                                rotationX = if (viewModel.isRun) rotation else 89f
                            )
                            .width(size)
                            .height(size)
                            .padding(size / 10)
                            .background(Color.White)
                            .background(if (!viewModel.isRun) Color.White else (if (num[viewModel.aa % 10][itemPosition][position] == 1) color1 else color2))
                    )
                }
            }
        }
    }
}