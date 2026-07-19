package com.andrewhossam.leetcode

// 231. Power of Two
// https://leetcode.com/problems/power-of-two/

class `231-power-of-two` {
    fun main() {
        println(isPowerOfTwo(1))
    }

    fun isPowerOfTwo(n: Int): Boolean = (n > 0) && ((n and (n - 1)) == 0)
}
