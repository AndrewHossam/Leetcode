fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var maxNumber = 0
    var localMax = 0
    val s = nums.map {  it}.toTypedArray()
    for (num in nums) {
        if (num == 0) {
            localMax = 0
        } else {
            localMax++
        }

        if (maxNumber > localMax){
            maxNumber = localMax
        }
    }
    return maxNumber

}

fun main() {
    println(
        findMaxConsecutiveOnes(
            intArrayOf(
                1,1,0,1,1,1
            )
        )
    )
}
