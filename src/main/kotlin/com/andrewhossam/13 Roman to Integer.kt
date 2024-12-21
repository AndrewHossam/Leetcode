package com.andrewhossam

fun main() {
    romanToInt("MCMXCIV").print()
}

    fun romanToInt(s: String): Int {
        var sum = 0
        var skip = false
        t@ for (i in s.indices) {
            if (skip) {
                skip = false
                continue
            }
            if (i + 1 < s.length) {
                when ("${s[i]}${s[i + 1]}") {
                    "IV" -> {
                        sum += 4
                        skip = true
                        continue@t
                    }
                    "IX" -> {
                        sum += 9
                        skip = true
                        continue@t
                    }
                    "XL" -> {
                        sum += 40
                        skip = true
                        continue@t
                    }
                    "XC" -> {
                        sum += 90
                        skip = true
                        continue@t
                    }
                    "CD" -> {
                        sum += 400
                        skip = true
                        continue@t
                    }
                    "CM" -> {
                        sum += 900
                        skip = true
                        continue@t
                    }
                }
            }
            when ("${s[i]}") {
                "I" -> {
                    sum++
                }
                "V" -> {
                    sum += 5
                }
                "X" -> {
                    sum += 10
                }
                "L" -> {
                    sum += 50
                }
                "C" -> {
                    sum += 100
                }
                "D" -> {
                    sum += 500
                }
                "M" -> {
                    sum += 1000
                }
            }
        }
        return sum
    }
