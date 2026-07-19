package com.andrewhossam.leetcode
import java.util.*

// 150. Evaluate Reverse Polish Notation
// https://leetcode.com/problems/evaluate-reverse-polish-notation/

class `150-evaluate-reverse-polish-notation` {
    fun evalRPN(tokens: Array<String>): Int {
        val queue: Stack<Int> = Stack()
        tokens.forEach {
            when (it) {
                "+" -> {
                    queue.add(queue.pop() + queue.pop())
                }

                "-" -> {
                    val second = queue.pop()
                    val first = queue.pop()
                    queue.add(first - second)
                }

                "*" -> {
                    queue.add(queue.pop() * queue.pop())
                }

                "/" -> {
                    val second = queue.pop()
                    val first = queue.pop()
                    queue.add(first / second)
                }

                else -> {
                    queue.add(it.toInt())
                }
            }
        }
        return queue.peek()
    }
}
