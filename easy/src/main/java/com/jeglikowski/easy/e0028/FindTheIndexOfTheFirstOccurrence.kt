package com.jeglikowski.easy.e0028

internal class Solution {
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
