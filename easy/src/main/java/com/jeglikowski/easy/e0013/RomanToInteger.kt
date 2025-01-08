package com.jeglikowski.easy.e0013

private class Solution {
    val romanToIntMap = mapOf(
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

fun main() {
    val solution = Solution()
    val s = "III"
    val result = solution.romanToInt(s)
    println(result) // 3

    val s2 = "IV"
    val result2 = solution.romanToInt(s2)
    println(result2) // 4

    val s3 = "IX"
    val result3 = solution.romanToInt(s3)
    println(result3) // 9

    val s4 = "LVIII"
    val result4 = solution.romanToInt(s4)
    println(result4) // 58

    val s5 = "MCMXCIV"
    val result5 = solution.romanToInt(s5)
    println(result5) // 1994
}