package com.example.androiddevchallenge

import androidx.compose.ui.graphics.Color

/**
 * 用来显示点阵的三维数组
 */
val digit = arrayOf(
    arrayOf(
        arrayOf(0, 0, 1, 1, 1, 0, 0),
        arrayOf(0, 1, 1, 0, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 0, 1, 1, 0),
        arrayOf(0, 0, 1, 1, 1, 0, 0)
    ),
    arrayOf(
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 1, 1, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(1, 1, 1, 1, 1, 1, 1)
    ),
    arrayOf(
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0),
        arrayOf(0, 1, 1, 0, 0, 0, 0),
        arrayOf(1, 1, 0, 0, 0, 0, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 1, 1, 1, 1, 1)
    ),
    arrayOf(
        arrayOf(1, 1, 1, 1, 1, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 1, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0)
    ),
    arrayOf(
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 1, 0),
        arrayOf(0, 0, 1, 1, 1, 1, 0),
        arrayOf(0, 1, 1, 0, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 1, 1, 0),
        arrayOf(1, 1, 1, 1, 1, 1, 1),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 1, 1)
    ),
    arrayOf(
        arrayOf(1, 1, 1, 1, 1, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 0, 0),
        arrayOf(1, 1, 0, 0, 0, 0, 0),
        arrayOf(1, 1, 1, 1, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0)
    ),
    arrayOf(
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0),
        arrayOf(0, 1, 1, 0, 0, 0, 0),
        arrayOf(1, 1, 0, 0, 0, 0, 0),
        arrayOf(1, 1, 0, 1, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0)
    ),
    arrayOf(
        arrayOf(1, 1, 1, 1, 1, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0)
    ),
    arrayOf(
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0)
    ),
    arrayOf(
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 1, 1, 0, 0, 0, 0)
    ),
    arrayOf(
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 1, 1, 0),
        arrayOf(0, 1, 1, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 1, 1, 0),
        arrayOf(0, 1, 1, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 0, 0, 0)
    )
)

val num = arrayOf(
    arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
    ),arrayOf(
        arrayOf(1, 1, 0, 0),
        arrayOf(0, 1, 0, 0),
        arrayOf(0, 1, 0, 0),
        arrayOf(0, 1, 0, 0),
        arrayOf(1, 1, 1, 0),
    ),arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 0, 0),
        arrayOf(1, 1, 1, 0),
    ),arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
    ),arrayOf(
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 1),
        arrayOf(0, 0, 1, 0),
    ),arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 0, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
    ),arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 0, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
    ),arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(0, 0, 1, 0),
    ),arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
    ),arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(0, 0, 1, 0),
    ),arrayOf(
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 1, 0, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 1, 0, 0),
        arrayOf(0, 0, 0, 0),
    ),
)

val init = arrayOf(
    arrayOf(0, 0, 0, 0),
    arrayOf(0, 0, 0, 0),
    arrayOf(0, 0, 0, 0),
    arrayOf(0, 0, 0, 0),
    arrayOf(0, 0, 0, 0),
)

val ColorSer = arrayOf(
    Color.Yellow,
    Color(0xffee7600),
    Color(0xffee82ee),
    Color.Red,
    Color(0xffEE9A00),
    Color(0xffff00ff),
    Color(0xffffd700),
    Color(0xffff0000),
    Color(0xffa020f0),
    Color(0xffab82ff),
    Color(0xff9aff9a),
    Color(0xff7fffd4),
    Color(0xff00f5ff),
    Color.Magenta
)