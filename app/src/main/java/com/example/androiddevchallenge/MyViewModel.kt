/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Puppy

class MyViewModel : ViewModel() {

    var currentPuppy: Puppy? by mutableStateOf(null)
    var lookPuppy by mutableStateOf(false)
    var title by mutableStateOf("狗狗列表")

    fun toLookDog(data: Puppy) {
        lookPuppy = true
        currentPuppy = data
        title = "狗狗详情"
    }

    fun back() {
        lookPuppy = false
        title = "狗狗列表"
    }
}
