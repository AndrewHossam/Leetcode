package com.andrewhossam

class `852-peak-index-in-a-mountain-array` {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var start = 0
        var end = arr.size - 1

        while (start < end) {
            val mid = start + (end - start) / 2

            if (arr[mid + 1] > arr[mid]) {
                start = mid + 1
            } else {
                end = mid
            }
        }
        return start
    }

    fun bruteForce(arr: IntArray): Int {
        var highestNumberIndex = 0

        for (i in 1..<arr.size) {
            if (arr[i] > arr[i - 1]) {
                highestNumberIndex = i
            } else {
                break
            }
        }

        return highestNumberIndex
    }

    fun binarySearch(
        arr: IntArray,
        target: Int,
    ): Int {
        var start = 0
        var end = arr.size - 1

        while (start <= end) {
            val mid = start + (end - start) / 2
            if (arr[mid] == target) {
                return mid
            } else if (target > arr[mid]) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return arr[start]
    }
}
