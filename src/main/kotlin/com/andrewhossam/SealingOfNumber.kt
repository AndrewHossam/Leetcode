package com.andrewhossam.com.andrewhossam

// [2,3,5,9,14,16,18] target = 15
class SealingOfNumber {
    fun solution(
        intArray: IntArray,
        target: Int,
    ): Int {
        var start = 0
        var end = intArray.size - 1

        var center: Int
        while (start <= end) {
            center = (start + end) / 2
            if (intArray[center] == target) {
                return intArray[center]
            } else if (target > intArray[end]) {
                return intArray[end]
            } else if (target > intArray[center]) {
                start = center + 1
            } else {
                end = center - 1
            }
        }
        return intArray[start]
    }
}
