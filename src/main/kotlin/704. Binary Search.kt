fun search(nums: IntArray, target: Int): Int {
    var startIndex = 0
    var endIndex = nums.size - 1
    while (endIndex >= startIndex) {
        if (nums[(endIndex + startIndex) / 2] == target)
            return (endIndex + startIndex) / 2

        if (target > nums[(endIndex + startIndex) / 2]) {
            startIndex = ((endIndex + startIndex) / 2) + 1
        } else
            endIndex = ((endIndex + startIndex) / 2) - 1
    }
    return -1
}


fun main() {
    println(
        search(
            intArrayOf(
                -1, 0, 3, 5, 9, 12
            ),
            9
        )
    )
}
