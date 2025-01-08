package com.jeglikowski.easy.e0020

private class Solution {
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

fun main() {
    val solution = Solution()
    val s = "()"
    val result = solution.isValid(s)
    println(result) // true

    val s2 = "()[]{}"
    val result2 = solution.isValid(s2)
    println(result2) // true

    val s3 = "(]"
    val result3 = solution.isValid(s3)
    println(result3) // false

    val s4 = "([)]"
    val result4 = solution.isValid(s4)
    println(result4) // false

    val s5 = "{[]}"
    val result5 = solution.isValid(s5)
    println(result5) // true
}