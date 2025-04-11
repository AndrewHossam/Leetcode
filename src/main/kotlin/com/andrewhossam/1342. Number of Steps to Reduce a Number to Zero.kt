package com.andrewhossam

fun numberOfSteps(num: Int): Int {
    var reminder = num
    var steps = 0
    while (reminder != 0) {
        if (reminder % 2 == 0) {
            reminder /= 2
            steps++
        } else {
            reminder--
            steps++
        }
    }
    return steps
}

fun numberOfSteps2(num: Int): Int =
    if (num == 0) {
        0
    } else if (num % 2 == 0) {
        numberOfSteps(num / 2) + 1
    } else {
        numberOfSteps(num - 1) + 1
    }

fun main() {
    println(
        numberOfSteps(90),
    )
    println(
        numberOfSteps2(90),
    )
}
