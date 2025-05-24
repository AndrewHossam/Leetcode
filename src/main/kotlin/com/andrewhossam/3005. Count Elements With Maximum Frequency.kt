package com.andrewhossam

fun maxFrequencyElements(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    nums.forEach {
        map[it] = map[it]?.plus(1) ?: 1
    }
    var maxFrequency = 0

    map.values.forEach {
        if (it > maxFrequency) {
            maxFrequency = it
        }
    }
    var sum = 0
    map.forEach {
        if (it.value == maxFrequency) {
            sum += it.value
        }
    }

    return sum
}
