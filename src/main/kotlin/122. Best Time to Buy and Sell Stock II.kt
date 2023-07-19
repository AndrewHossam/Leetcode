fun main() {
    println(
        maxProfit(
            intArrayOf(7, 1, 5, 3, 6, 4)
        )
    )
}

//[7,1,5,3,6,4]

/*
        [0,-6,,-2,-4.-1,-3]
        [_,0,4,2,5,3]
        [0,0,0,-2,1,-1]
        [0,0,0,0,3,1]
        [0,0,0,0,0,-2]
        [0,0,0,0,0,0]
 */
fun maxProfit(prices: IntArray): Int {
    val profits = intArrayOf()
    for (i in 0 until prices.size) {
        val current = prices[i]
        (i .. prices.size).forEach { j ->
            //            profits[i][j] = current - prices[j]
        }
        println(profits[i])
    }
    return 0
}
