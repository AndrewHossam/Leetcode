import kotlin.math.max

/*
 * Complete the 'flippingMatrix' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
 */



fun flippingMatrix(matrix: Array<Array<Int>>): Int {
    // Write your code here
    var max = 0
    for (row in matrix) {
        var firstHalf = 0
        var secondHalf = 0
        row.forEachIndexed { index, i ->
            if (index < row.size / 2) {
                firstHalf += i
            } else {
                secondHalf += i
            }
        }
        max += max(firstHalf,secondHalf)
    }

    return max
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val n = readLine()!!.trim().toInt()

        val matrix = Array<Array<Int>>(2 * n, { Array<Int>(2 * n, { 0 }) })

        for (i in 0 until 2 * n) {
            matrix[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
        }

        val result = flippingMatrix(matrix)

        println(result)
    }
}


fun toBinaryString(decimalNumber: Int): String {
    // Create a string to store the binary representation.
    val binaryString = StringBuilder()
for (c in "".indices)
    // While the decimal number is not 0, do the following:
    while (decimalNumber > 0) {
        // Divide the decimal number by 2 and store the remainder in the string.
        binaryString.append(decimalNumber % 2)

        // Divide the decimal number by 2 again.
        decimalNumber /= 2
    }

    // Reverse the string.
    binaryString.reverse()

    // Return the binary string.
    return binaryString.toString()
}
