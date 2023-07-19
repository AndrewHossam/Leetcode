fun containsDuplicate(nums: IntArray): Boolean {
    val map = mutableMapOf<Int, Boolean>()
    nums.forEach {
        if (map[it] == true)
            return true
        else
            map[it] = true
    }
    return false
}

fun containsDuplicate2(nums: IntArray): Boolean {
    val map = mutableSetOf<Int>()
    nums.forEach {
        if (map.contains(it)) return true
        else map.add(it)
    }
    return false
}

fun main() {
    println(
        containsDuplicate2(
            intArrayOf(
                1, 2, 3, 1
            )
        )
    )
}
