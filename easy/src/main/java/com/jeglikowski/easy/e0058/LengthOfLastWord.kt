package com.jeglikowski.easy.e0058

private class Solution {
    fun lengthOfLastWord(s: String): Int {
        var count = 0
        var isShouldResetCount = false
        for (c in s) {
            if (c != ' ') {
                if (isShouldResetCount) {
                    count = 0
                    isShouldResetCount = false
                }
                count += 1
            } else {
                isShouldResetCount = true
            }
        }
        return count
    }
}

fun main() {
    val solution = Solution()
    val s = "Hello World"
    val result = solution.lengthOfLastWord(s)
    println(result) // 5

    val s2 = "   fly me   to   the moon  "
    val result2 = solution.lengthOfLastWord(s2)
    println(result2) // 4

    val s3 = "luffy is still joyboy"
    val result3 = solution.lengthOfLastWord(s3)
    println(result3) // 6
}