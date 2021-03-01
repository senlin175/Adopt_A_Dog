package com.example.androiddevchallenge

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.MyViewModel

@Composable
fun Doglist(list: List<Puppy>) {
    val viewModel: MyViewModel = viewModel()
    LazyColumn {
        items(list) { data ->
            Card(
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp)
                    .clickable {
                        viewModel.toLookDog(data)
                    },
                elevation = 5.dp,
                border = BorderStroke(2.dp, Color.Black),

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                ) {
                    Image(
                        painter = painterResource(id = data.images[0]),
                        data.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .border(
                                width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(5.dp)
                            )
                    )
                    Box(modifier = Modifier.height(10.dp))
                    Text(
                        text = "name : " + data.name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Box(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Introduction : " + data.story,
                        maxLines = 5,
                        fontStyle = FontStyle.Italic,
                        textDecoration = TextDecoration.Underline,
                        textAlign = TextAlign.Start,
                        softWrap = true
                    )
                }
            }
        }
    }
}
