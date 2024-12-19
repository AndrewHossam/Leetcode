import com.andrewhossam.`852-peak-index-in-a-mountain-array`
import kotlin.test.Test
import kotlin.test.assertEquals

class `852-peak-index-in-a-mountain-arrayTest` {
    val sut = `852-peak-index-in-a-mountain-array`()

    @Test
    fun case1() {
        assertEquals(
            1,
            sut.peakIndexInMountainArray(intArrayOf(0, 1, 0))
        )
    }

    @Test
    fun case2() {
        assertEquals(
            1,
            sut.peakIndexInMountainArray(intArrayOf(0, 2, 1, 0))
        )
    }

    @Test
    fun case3() {
        assertEquals(
            1,
            sut.peakIndexInMountainArray(intArrayOf(0, 10, 5, 2))
        )
    }

    @Test
    fun case4() {
        assertEquals(
            2,
            sut.peakIndexInMountainArray(intArrayOf(3, 4, 5, 1))
        )
    }

    @Test
    fun case8() {
        assertEquals(
            2,
            sut.peakIndexInMountainArray(intArrayOf(24, 69, 100, 99, 79, 78, 67, 36, 26, 19))
        )
    }

    @Test
    fun case14() {
        assertEquals(
            5,
            sut.peakIndexInMountainArray(intArrayOf(18, 29, 38, 59, 98, 100, 99, 98, 90))
        )
    }
}
