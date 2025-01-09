package com.jeglikowski.easy.e0069

import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

internal class Solution {
    fun mySqrt(x: Int): Int {
        return halfX(x.toLong()).toInt()
    }

    private fun halfX(x: Long): Long {
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

    private fun recursivePow(x: Int): Int {
        return recursive(0, x)
    }

    private fun recursive(i: Int, x: Int): Int {
        val twoPower = 2.0.pow(i)
        val end = twoPower * twoPower
        if (end >= x) {
            return i
        } else {
            return recursive(i+1, x)
        }
    }

    private fun dummyPow(x: Int): Int {
        for (i in 0..x) {
            val pow = i * i
            if (pow > x || pow < 0) {
                return i - 1
            }
        }
        return x
    }

    private fun stdSqrt(x: Int): Int = floor(sqrt(x.toDouble())).toInt()
}
