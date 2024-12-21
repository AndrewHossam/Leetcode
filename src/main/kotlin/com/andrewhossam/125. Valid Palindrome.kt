package com.andrewhossam

fun isPalindrome(s: String): Boolean {
    var start = 0
    var end = s.length - 1
    while (start < end) {
        if (s[start].isValidChar().not()) {
            start++
        } else if (s[end].isValidChar().not()) {
            end--
        } else {
            if (s[start].toLowerCase() == s[end].toLowerCase()) {
                start++
                end--
            } else {
                return false
            }
        }
    }
    return true
}

fun Char.isValidChar(): Boolean {
    return (toInt() >= 'A'.toInt() && toInt() <= 'Z'.toInt()) ||
            (toInt() >= 'a'.toInt() && toInt() <= 'z'.toInt()) ||
            (toInt() >= '0'.toInt() && toInt() <= '9'.toInt())
}

fun Char.toLowerCase(): Char {
    return if ((toInt() >= 'A'.toInt() && toInt() <= 'Z'.toInt())) {
        (this.toInt() + 32).toChar()
    } else this
}

fun main() {
    print(
        isPalindrome("a")
    )
}
