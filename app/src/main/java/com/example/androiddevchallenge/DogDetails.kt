package com.example.androiddevchallenge

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlin.math.roundToInt

@Composable
fun DogDetails() {
    val viewModel: MyViewModel = viewModel()
    val index = animateFloatAsState(if (viewModel.lookPuppy) 0f else 1f)
    Box(modifier = Modifier
        .layout { measurable, constraints ->
            val placeable = measurable.measure(constraints)
            layout(placeable.width, placeable.height) {

                val offset = (index.value * placeable.width).roundToInt()
                placeable.placeRelative(offset, 0)
            }
        }
        .background(Color.White)
        .fillMaxSize()) {
        if (viewModel.lookPuppy) {
            Column(){
                LazyRow(content = {
                    items(viewModel.currentPuppy?.images!!.toList()) { img ->
                        Image(
                            painter = painterResource(id = img),
                            viewModel.currentPuppy?.name,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(350.dp)
                                .clip(RoundedCornerShape(5.dp))
                                .border(
                                    width = 2.dp,
                                    color = Color.White,
                                    shape = RoundedCornerShape(5.dp)
                                )
                        )
                    }
                })
                Box(modifier = Modifier.height(10.dp))
                Text(
                    text = "name : " + viewModel.currentPuppy?.name,
                    Modifier.padding(10.dp, 0.dp, 10.dp, 0.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Box(modifier = Modifier.height(10.dp))
                Text(
                    text = "Introduction : " + viewModel.currentPuppy?.story ,
                    Modifier.padding(10.dp, 0.dp, 10.dp, 0.dp),
                    fontStyle = FontStyle.Italic,
                    textDecoration = TextDecoration.Underline,
                    textAlign = TextAlign.Start,
                    softWrap = true
                )
            }

        }
    }
}