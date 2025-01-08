package com.jeglikowski.easy.e0069

import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

private class Solution {
    fun mySqrt(x: Int): Int {
        return halfX(x.toLong()).toInt()
    }

    fun halfX(x: Long): Long {
        if (x <= 1) {
            return x
        }

        var lower = 1L
        var higher = x
        while (lower <= higher) {
            val half = lower + (higher - lower) / 2
            val pow = half * half
            if (pow == x) {
                return half
            }
            if (lower + 1 == higher) {
                return lower
            }
            if (pow > x) {
                higher = half
            } else if (pow < x) {
                lower = half
            } else {
                return half
            }
        }
        return lower
    }

    fun recursivePow(x: Int): Int {
        return recursive(0, x)
    }

    fun recursive(i: Int, x: Int): Int {
        val twoPower = 2.0.pow(i)
        val end = twoPower * twoPower
        if (end >= x) {
            return i
        } else {
            return recursive(i+1, x)
        }
    }

    fun dummyPow(x: Int): Int {
        for (i in 0..x) {
            val pow = i * i
            if (pow > x || pow < 0) {
                return i - 1
            }
        }
        return x
    }

    fun stdSqrt(x: Int): Int = floor(sqrt(x.toDouble())).toInt()
}

fun main() {
    val solution = Solution()
    val x = 4
    val result = solution.mySqrt(x)
    println(result) // 2

    val x2 = 8
    val result2 = solution.mySqrt(x2)
    println(result2) // 2

    val x3 = 9
    val result3 = solution.mySqrt(x3)
    println(result3) // 3

    val x4 = 16
    val result4 = solution.mySqrt(x4)
    println(result4) // 4

    val x5 = 2147395599
    val result5 = solution.mySqrt(x5)
    println(result5) // 46339
}