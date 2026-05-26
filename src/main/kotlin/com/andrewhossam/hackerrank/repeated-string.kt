package com.andrewhossam.hackerrank

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */
/* First thought is to try the brute force method duplicate the s string with n/s.size
 * Plus substring of substring from 0 to s.size%n but this won't work for very long string
 * so it let's solve the problem for the first string and multiply it with the division of n/s.size
 * then solve the substring and sum the total of 2 part
 */
fun repeatedString(
    s: String,
    n: Long,
): Long {
    val numberOfReputation = n / s.length
    val endOfSubstring = n % s.length

    val numberOfa = s.count { it == 'a' } * numberOfReputation
    val suba = s.subSequence(0, endOfSubstring.toInt()).count { it == 'a' }
    return numberOfa + suba
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()

    val result = repeatedString(s, n)
    println(result)
}
