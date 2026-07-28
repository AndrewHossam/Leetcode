package com.andrewhossam.leetcode

import kotlin.math.max
import kotlin.math.min

// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class `121-best-time-to-buy-and-sell-stock` {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0
        var minPrice = prices.first()
        var maxProfit = 0

        for (price in prices) {
            minPrice = min(minPrice, price)
            maxProfit = max(price - minPrice, maxProfit)
        }
        return maxProfit
    }
}

