package com.jeglikowski.easy.e0067

internal class Solution {
    fun addBinary(a: String, b: String): String {
        val paddedA = a.padStart(b.length, '0')
        val paddedB = b.padStart(a.length, '0')
        val builder = StringBuilder()
        var isCarriesOver = false
        for (i in paddedA.length - 1 downTo 0) {
            val digitA = paddedA[i].digitToInt()
            val digitB = paddedB[i].digitToInt()
            val result = if (isCarriesOver) {
                digitA + digitB + 1
            } else {
                digitA + digitB
            }
            isCarriesOver = result >= 2
            val insert = result % 2
            builder.append(insert.toString())
        }
        if (isCarriesOver) {
            builder.append('1')
        }
        return builder.reverse().toString()
    }
}
