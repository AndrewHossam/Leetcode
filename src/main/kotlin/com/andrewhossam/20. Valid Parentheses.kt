package com.andrewhossam

import java.util.*

fun isValid(s: String): Boolean {
    val q: Stack<Char> = Stack()
    for (c in s) {
        if (
            c == '(' ||
            c == '{' ||
            c == '['
        ) {
            q.add(c)
        } else if (q.isEmpty()) {
            return false
        } else if (
            (c == ')' && '(' == q.peek()) ||
            (c == '}' && '{' == q.peek()) ||
            (c == ']' && '[' == q.peek())
        ) {
            q.pop()
        } else {
            return false
        }
    }
    return q.isEmpty()
}

fun main() {
    println(
        com.andrewhossam.isValid("]"),
    )
}
