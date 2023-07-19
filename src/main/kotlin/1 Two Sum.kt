fun main() {
    twoSum(intArrayOf(3, 2, 4), 6).contentToString().print()
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i until nums.size) {
            if (i != j && nums[i] + nums[j] == target)
                return intArrayOf(i, j)
        }
    }
    return intArrayOf()
}


fun Any.print() {
    println(this)
}
