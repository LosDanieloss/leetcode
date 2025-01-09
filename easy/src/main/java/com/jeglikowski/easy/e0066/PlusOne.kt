package com.jeglikowski.easy.e0066

internal class Solution {
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
