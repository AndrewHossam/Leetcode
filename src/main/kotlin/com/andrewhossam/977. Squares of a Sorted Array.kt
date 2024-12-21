package com.andrewhossam

fun sortedSquares(nums: IntArray): IntArray {
    var positiveIndex = 0
    for (i in 0 until nums.size) {
        if (nums[i] >= 0) {
            positiveIndex = i
            break
        }
    }
    // all postive
    if (positiveIndex == 0) {
        return nums.map { it.square() }.toIntArray()
    } else if (positiveIndex == nums.size - 1) { // all negative
        nums.reverse()
        return nums.map { it.square() }.toIntArray()
    } else { // mixed
        val result = mutableListOf<Int>()

        var negativeIndex = positiveIndex
        for (n in 0 until nums.size) {
            if (
                negativeIndex != 0 && positiveIndex != nums.size - 1 &&
                nums[negativeIndex - 1].square() > nums[positiveIndex + 1].square()
            ) {
                result.add(nums[++positiveIndex].square())
            } else {
                result.add(nums[--negativeIndex].square())
            }
        }
        return result.toIntArray()
    }
}

fun Int.square() = this * this
fun main() {
    println(
        sortedSquares(intArrayOf(-4, -1, 0, 3, 10))
    )
}
