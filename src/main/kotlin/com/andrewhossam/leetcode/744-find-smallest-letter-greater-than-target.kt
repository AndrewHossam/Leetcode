package com.andrewhossam.leetcode

class `744-find-smallest-letter-greater-than-target` {
    fun nextGreatestLetter(
        letters: CharArray,
        target: Char,
    ): Char {
        var start = 0
        var end = letters.size - 1

        if (target >= letters.last()) {
            return letters.first()
        }

        while (start <= end) {
            val center = start + (end - start) / 2
            if (target < letters[center]) {
                end = center - 1
            } else {
                start = center + 1
            }
        }
        return letters[start]
    }
}
