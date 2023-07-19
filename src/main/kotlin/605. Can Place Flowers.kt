fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    if (n == 0) return true
    var reminder = n
    for (i in 0 until flowerbed.size) {
        if (
            (i == 0 || flowerbed[i - 1] == 0) &&
            flowerbed[i] == 0 &&
            (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)
        ) {
            flowerbed[i] = 1
            reminder--
            if (reminder == 0) {
                return true
            }
        }
    }
    return reminder == 0
}
