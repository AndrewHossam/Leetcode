package com.andrewhossam.hackerrank


// https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

//  $O(N)$ auxiliary space
fun countingValleys(
    steps: Int,
    path: String,
): Int {
    val arr = mutableListOf(0)
    var count = 0
    for (index in 0..<steps) {
        if (path[index] == 'U') {
            arr.add(arr.last() + 1)
        } else {
            if (arr.last() == 0) {
                count++
            }
            arr.add(arr.last() - 1)
        }
    }
    return count
}

//  $O(1)$ auxiliary space
fun countingValleys2(
    steps: Int,
    path: String,
): Int {
    var level = 0
    var vallyCount = 0
    for (char in path) {
        if (char == 'U') {
            level++
        } else {
            if (level == 0) {
                vallyCount++
            }
            level--
        }
    }
    return vallyCount
}

fun main(args: Array<String>) {
    print("Enter number of steps: ")
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
