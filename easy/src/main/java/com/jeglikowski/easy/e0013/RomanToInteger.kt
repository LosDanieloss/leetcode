package com.jeglikowski.easy.e0013

internal class Solution {
    private val romanToIntMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun romanToInt(s: String): Int {
        var number = 0
        var previousValue = 0
        val iteration = s.length - 1
        for (i in iteration downTo 0 step 1) {
            val currentChar = s[i]
            val currentNumber = romanToIntMap[currentChar]!!
            if (currentNumber < previousValue) {
                number -= currentNumber
            } else {
                number += currentNumber
            }
            previousValue = currentNumber
        }
        return number
    }
}
