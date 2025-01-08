package com.jeglikowski.easy.e0009

import kotlin.math.ceil
import kotlin.math.floor

private class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        if (x == 0) {
            return true
        }
        if (x < 10) {
            return true
        }
        return isPalindromByInts(x)
    }

    fun isPalindromByStringReversed(x: Int): Boolean {
        val xString = x.toString()
        val xStringReverse = xString.reversed()
        return xString == xStringReverse
    }

    fun isPalindromByStringHalfReversed(x: Int): Boolean {
        val xString = x.toString()
        val splitIndex = xString.length / 2.0
        val xFirstHalf = xString.substring(0, ceil(splitIndex).toInt())
        val xSecondHalf = xString.substring(floor(splitIndex).toInt(), xString.length)
        val xSecondHalfReverse = xSecondHalf.reversed()
        return xFirstHalf == xSecondHalfReverse
    }

    fun isPalindromByStringSplitIteration(x: Int): Boolean {
        val xString = x.toString()
        val xLenght = xString.length / 2
        for (i in 0..xLenght) {
            val leading = i
            val following = xString.length - 1 - i
            if (xString[i] != xString[following]) {
                return false
            }
        }
        return true
    }

    fun isPalindromByInts(x: Int): Boolean {
        val lint = mutableListOf<Int>()
        var mutableX = x
        do {
            val digit = mutableX % 10
            mutableX /= 10
            lint.add(digit)
        } while(mutableX > 0)
        val xLenght = lint.size / 2
        for (i in 0..xLenght) {
            if (lint[i] != lint[lint.size - 1 - i]) {
                return false
            }
        }
        return true
    }
}

fun main() {
    val solution = Solution()
    val x = 121
    val result = solution.isPalindrome(x)
    println(result) // true

    val x2 = -121
    val result2 = solution.isPalindrome(x2)
    println(result2) // false

    val x3 = 10
    val result3 = solution.isPalindrome(x3)
    println(result3) // false
}