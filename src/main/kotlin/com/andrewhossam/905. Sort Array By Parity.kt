package com.andrewhossam

fun main(args: Array<String>) {
    println(sortArrayByParity(intArrayOf(3, 1, 2, 4)).toString())
}

fun sortArrayByParity(nums: IntArray): IntArray {
    val list = mutableListOf<Int>()

    for (num in nums) {
        if (num % 2 == 0)
            list.add(num)
    }
    for (num in nums) {
        if (num % 2 != 0)
            list.add(num)
    }
    return list.toIntArray()
}

