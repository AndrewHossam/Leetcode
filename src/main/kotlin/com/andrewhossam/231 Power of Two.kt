package com.andrewhossam

fun main() {
    isPowerOfTwo(1).print()
}

fun isPowerOfTwo(n: Int): Boolean = n > 0 && (n and (n - 1) == 0)
