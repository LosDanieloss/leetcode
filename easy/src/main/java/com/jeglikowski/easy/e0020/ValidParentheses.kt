package com.jeglikowski.easy.e0020

internal class Solution {
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) {
            return true
        }
        if (s.length % 2 != 0) {
            return false
        }

        val stack = ArrayDeque<Char>()
        for (c in s) {
            val maybeMatchingClosingBracket = mapToClosingBracket(c)
            if (maybeMatchingClosingBracket != null) {
                stack.addFirst(maybeMatchingClosingBracket)
            } else {
                if (stack.isEmpty()) {
                    return false
                }
                val expectedClosingBracket = stack.removeFirst()
                if (c != expectedClosingBracket) {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }

    fun mapToClosingBracket(c: Char): Char? {
        if (c == '(') {
            return ')'
        }
        if (c == '{') {
            return '}'
        }
        if (c == '[') {
            return ']'
        }
        return null
    }
}
