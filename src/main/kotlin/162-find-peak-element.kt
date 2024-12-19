package com.andrewhossam

class `162-find-peak-element` {
    fun findPeakElement(arr: IntArray): Int {
        var start = 0
        var end = arr.size - 1

        while (start < end) {
            val mid = start + (end - start) / 2

            // right or left
            // look for right
            if (arr[mid + 1] > arr[mid]) {
                start = mid + 1
            } else {
                end = mid
            }
        }
        return start

    }
}
