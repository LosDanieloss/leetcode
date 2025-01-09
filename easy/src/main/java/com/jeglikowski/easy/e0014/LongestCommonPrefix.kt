package com.jeglikowski.easy.e0014

internal class Solution {
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
