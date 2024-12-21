package com.andrewhossam

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    accounts.forEach {
        val sum = it.sum()
        if (sum > max)
            max = sum
    }
    return max
}

fun maximumWealth2(accounts: Array<IntArray>): Int {
    return accounts.reduce { acc, ints ->
        if (ints.sum() > acc.sum())
            ints
        else
            acc
    }.sum()
}

fun maximumWealth3(accounts: Array<IntArray>): Int {
    return accounts.maxBy {
        it.sum()
    }?.sum() ?: 0
}

fun main() {
    println(
        maximumWealth3(
            arrayOf(
                intArrayOf(2, 8, 7), intArrayOf(7, 1, 3), intArrayOf(1, 9, 5)
            )
        )
    )
}
