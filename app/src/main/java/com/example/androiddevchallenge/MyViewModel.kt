package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Puppy

class MyViewModel : ViewModel() {


    var currentPuppy : Puppy? by mutableStateOf(null)
    var lookPuppy by mutableStateOf(false)
    var title by mutableStateOf("狗狗列表")

    fun toLookDog(data : Puppy){
        lookPuppy = true
        currentPuppy = data
    }

    fun back() {
        lookPuppy = false
    }
}