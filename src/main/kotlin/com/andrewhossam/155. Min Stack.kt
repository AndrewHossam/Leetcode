package com.andrewhossam

import java.util.*

class MinStack {
    private val q = Stack<StackItem>()
    private var minSoFar = Int.MAX_VALUE

    fun push(`val`: Int) {
        if (`val` < minSoFar) {
            minSoFar = `val`
        }

        q.push(
            StackItem(`val`, minSoFar),
        )
        println("Push:$`val`, min: $minSoFar")
    }

    fun pop() {
        q.pop()
        minSoFar =
            if (q.isEmpty()) {
                Int.MAX_VALUE
            } else {
                q.peek().minSoFar
            }
        try {
            println("pop:${q.peek().`val`}`, min: $minSoFar")
        } catch (e: Exception) {
        }
    }

    fun top(): Int {
        println("top:${q.peek().`val`}`, min: $minSoFar")
        return q.peek().`val`
    }

    fun getMin(): Int {
        println("getMin:${q.peek().`val`}`, min: $minSoFar")
        return q.peek().minSoFar
    }
}

fun main() {
    MinStack().apply {
        push(-10)
        push(14)
        getMin()
        getMin()
        push(-20)
        getMin()
        getMin()
        top()
        getMin()
        pop()
        push(10)
        push(-7)
        getMin()
        push(-7)
        pop()
        top()
        getMin()
        pop()
    }
}

data class StackItem(
    val `val`: Int,
    val minSoFar: Int,
)
