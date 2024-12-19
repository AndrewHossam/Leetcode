import com.andrewhossam.`34-find-first-and-last-position-of-element-in-sorted-array`
import kotlin.test.Test
import kotlin.test.assertContentEquals

class `34Test` {
    val sut = `34-find-first-and-last-position-of-element-in-sorted-array`()

    @Test
    fun case1() {
        assertContentEquals(
            intArrayOf(3, 4),
            sut.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8)
        )
    }

    @Test
    fun case2() {
        assertContentEquals(
            intArrayOf(-1, -1),
            sut.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6)
        )
    }

    @Test
    fun case3() {
        assertContentEquals(
            intArrayOf(-1, -1),
            sut.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 0)
        )
    }

    @Test
    fun case65() {
        assertContentEquals(
            intArrayOf(3, 4),
            sut.searchRange(intArrayOf(5,7,7,8,8,10), 8)
        )
    }

    @Test
    fun case71() {
        assertContentEquals(
            intArrayOf(10, 13),
            sut.searchRange(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 8, 10, 10), 4)
        )
    }
}
