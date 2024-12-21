package com.andrewhossam

fun gcdOfStrings(str1: String, str2: String): String {
    var longestCommon = str2
    while (longestCommon.isNotEmpty()) {
        if (
            str1.length % longestCommon.length == 0 && str2.length % longestCommon.length == 0 &&
            longestCommon.times(str1.length / longestCommon.length) == str1 &&
            longestCommon.times(str2.length / longestCommon.length) == str2
        ) {
            return longestCommon
        } else {
            longestCommon = str2.subSequence(0, longestCommon.length - 1).toString()
        }
    }
    return longestCommon
}

private fun String.times(times: Int): String {
    var r = ""
    for (i in 0 until times) {
        r += this
    }
    return r
}

fun main() {
    println(
        gcdOfStrings("ABCABC", "AC")
    )
}
