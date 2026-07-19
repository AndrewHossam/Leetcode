package com.andrewhossam.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class `412-fizz-buzzTest` {
    val sut = `412-fizz-buzz`()

    @Test
    fun case1() {
        assertEquals(
            expected = listOf("1", "2", "Fizz"),
            actual = sut.fizzBuzz(3),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            expected = listOf("1", "2", "Fizz", "4", "Buzz"),
            actual = sut.fizzBuzz(5),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            expected = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"),
            actual = sut.fizzBuzz(15),
        )
    }
}
