package com.jeglikowski.easy.e0028

private class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val matchedIndex = -1
        var possibleOutputs = mutableMapOf<Int, Int>()
        for (i in haystack.indices) {
            val c = haystack[i]
            if (c == needle[0]) {
                possibleOutputs[i] = 0
            }
            val tmpCpy = HashMap(possibleOutputs)
            for ((possibleStart, matchedLength) in possibleOutputs) {
                if (c == needle[matchedLength]) {
                    val updatedMatchedLength = matchedLength + 1
                    if (updatedMatchedLength == needle.length) {
                        return possibleStart
                    }
                    tmpCpy[possibleStart] = updatedMatchedLength
                } else {
                    tmpCpy.remove(possibleStart)
                }
            }
            possibleOutputs = tmpCpy
        }
        return matchedIndex
    }
}

fun main() {
    val solution = Solution()
    val haystack = "hello"
    val needle = "ll"
    val result = solution.strStr(haystack, needle)
    println(result) // 2

    val haystack2 = "aaaaa"
    val needle2 = "bba"
    val result2 = solution.strStr(haystack2, needle2)
    println(result2) // -1
}