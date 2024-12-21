package com.andrewhossam

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val list = mutableListOf<Boolean>()
    var max = 0
    for (candy in candies) {
        if (max < candy)
            max = candy
    }

    for (candy in candies) {
        if (candy + extraCandies >= max) {
            list.add(true)
        } else {
            list.add(false)
        }
    }
    return list
}
