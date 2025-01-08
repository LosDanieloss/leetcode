package com.jeglikowski.easy.e0066

private class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val rangeTop = digits.size - 1
        var isCarriesOver = false
        for (i in rangeTop downTo 0) {
            val digit = digits[i]
            val newDigit = if (i == rangeTop) {
                digit + 1
            } else if (isCarriesOver) {
                isCarriesOver = false
                digit + 1
            } else {
                digit
            }
            val digitToStore = if (newDigit >= 10) {
                isCarriesOver = true
                0
            } else {
                newDigit
            }
            result.add(0, digitToStore)
        }
        if (isCarriesOver) {
            result.add(0, 1)
        }
        return result.toIntArray()
    }

}

fun main() {
    val solution = Solution()
    val digits = intArrayOf(1, 2, 3)
    val result = solution.plusOne(digits)
    println(result.toList()) // [1, 2, 4]

    val digits2 = intArrayOf(4, 3, 2, 1)
    val result2 = solution.plusOne(digits2)
    println(result2.toList()) // [4, 3, 2, 2]

    val digits3 = intArrayOf(9)
    val result3 = solution.plusOne(digits3)
    println(result3.toList()) // [1, 0]

    val digits4 = intArrayOf(9, 9)
    val result4 = solution.plusOne(digits4)
    println(result4.toList()) // [1, 0, 0]
}