package com.andrewhossam


class MountainArray(private val intArray: IntArray) {
    fun get(index: Int): Int = intArray[index]
    fun length(): Int = intArray.size
}

// 1, 5, 2
// 0, 1, 2, 4, 2, 1

class `1095-find-in-mountain-array` {
    fun findInMountainArray(target: Int, mountainArr: MountainArray): Int {
        var start = 0
        var end = mountainArr.length() - 1
        while (start < end) {
            val mid: Int = start + (end - start) / 2

            if (mountainArr.get(mid) >= target) {
//                go left
                end = mid
            } else {
                start = mid + 1
            }
        }
        return if (mountainArr.get(end) == target) end else -1

    }
}
