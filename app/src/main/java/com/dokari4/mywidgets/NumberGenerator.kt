package com.dokari4.mywidgets

import kotlin.random.Random

//class for generate random number
internal object NumberGenerator {
    fun generate(max: Int): Int {
        val random = Random
        return random.nextInt(max)
    }
}