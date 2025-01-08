package com.jeglikowski.easy.e0070

private class Solution {
    fun climbStairs(n: Int): Int {
        return climbStairsIterative(n)
    }

    fun climbStairsIterative(n: Int): Int {
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

    fun climbStairsRecursive(n: Int): Int {
        if (n == 1) {
            return 1
        }
        if (n == 2) {
            return 2
        }
        return climbStairsRecursive(n-1) + climbStairsRecursive(n-2)
    }
}

fun main() {
    val solution = Solution()
    val n = 2
    val result = solution.climbStairs(n)
    println(result) // 2

    val n2 = 3
    val result2 = solution.climbStairs(n2)
    println(result2) // 3

    val n3 = 4
    val result3 = solution.climbStairs(n3)
    println(result3) // 5

    val n4 = 5
    val result4 = solution.climbStairs(n4)
    println(result4) // 8

    val n5 = 6
    val result5 = solution.climbStairs(n5)
    println(result5) // 13

    val n6 = 7
    val result6 = solution.climbStairs(n6)
    println(result6) // 21
}