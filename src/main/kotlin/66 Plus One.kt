//import java.math.BigDecimal
//
//fun main() {
//    Solution().plusOne(
//        intArrayOf(
//            7,
//            2,
//            8,
//            5,
//            0,
//            9,
//            1,
//            2,
//            9,
//            5,
//            3,
//            6,
//            6,
//            7,
//            3,
//            2,
//            8,
//            4,
//            3,
//            7,
//            9,
//            5,
//            7,
//            7,
//            4,
//            7,
//            4,
//            9,
//            4,
//            7,
//            0,
//            1,
//            1,
//            1,
//            7,
//            4,
//            0,
//            0,
//            6
//        )
//    )
//}
//
//class Solution {
////    fun plusOne(digits: IntArray): IntArray {
////        val s = digits.joinToString("").toBigDecimal().plus(BigDecimal.ONE).toString()
////        val array = IntArray(s.length)
////        s.forEachIndexed { index, c ->
////            array[index] = c.toString().toInt()
////        }
////        return array
////    }
//
//    fun plusOne(digits: IntArray): IntArray {
//        var indexedValue = digits.lastIndex
//        while (digits[indexedValue] != 9) {
//            plusOne(digits.copyOfRange(0, indexedValue))
//        }
//
//    }
//}
