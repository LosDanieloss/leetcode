package com.jeglikowski.easy.e0058

internal class Solution {
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
