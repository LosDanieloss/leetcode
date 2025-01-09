package com.jeglikowski.easy.e0070

internal class Solution {
    fun climbStairs(n: Int): Int {
        return climbStairsIterative(n)
    }

    private fun climbStairsIterative(n: Int): Int {
        if (n == 1) {
            return 1
        }
        if (n == 2) {
            return 2
        }
        var prevStep = 2
        var stepBeforePrev = 1
        var sum = 0
        for (i in 3..n) {
            sum = prevStep + stepBeforePrev
            stepBeforePrev = prevStep
            prevStep = sum
        }
        return sum
    }

    private fun climbStairsRecursive(n: Int): Int {
        if (n == 1) {
            return 1
        }
        if (n == 2) {
            return 2
        }
        return climbStairsRecursive(n-1) + climbStairsRecursive(n-2)
    }
}
