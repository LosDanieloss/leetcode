package com.jeglikowski.easy.e0014

private class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val sorted = strs.sortedBy { it.length }
        val first = sorted.first()
        var prefix = first
        if (prefix.isEmpty()) {
            return first
        }
        for (sortedIndex in sorted.indices) {
            val str = strs[sortedIndex]
            for(i in prefix.indices) {
                if (str[i] != prefix[i]) {
                    prefix = prefix.substring(0, i)
                    break
                }
            }
        }
        return prefix
    }
}

fun main() {
    val solution = Solution()
    val strs = arrayOf("flower", "flow", "flight")
    val result = solution.longestCommonPrefix(strs)
    println(result) // fl

    val strs2 = arrayOf("dog", "racecar", "car")
    val result2 = solution.longestCommonPrefix(strs2)
    println(result2) // ""

    val strs3 = arrayOf("ab", "a")
    val result3 = solution.longestCommonPrefix(strs3)
    println(result3) // a
}