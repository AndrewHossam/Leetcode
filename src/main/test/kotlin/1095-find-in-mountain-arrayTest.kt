import com.andrewhossam.`1095-find-in-mountain-array`
import com.andrewhossam.MountainArray
import kotlin.test.Test
import kotlin.test.assertEquals

class `1095-find-in-mountain-arrayTest` {

    @Test
    fun case1() {
        val sut = `1095-find-in-mountain-array`()

        val result = sut.findInMountainArray(
            3,
            MountainArray(intArrayOf(1, 2, 3, 4, 5, 3, 1))
        )

        assertEquals(
            2,
            result
        )
    }

    @Test
    fun case2() {
        val sut = `1095-find-in-mountain-array`()

        val result = sut.findInMountainArray(
            3,
            MountainArray(intArrayOf(0, 1, 2, 4, 2, 1))
        )

        assertEquals(
            -1,
            result
        )
    }

    @Test
    fun case3() {
        val sut = `1095-find-in-mountain-array`()

        val result = sut.findInMountainArray(
            2,
            MountainArray(intArrayOf(1, 2, 3, 4, 5, 3, 1))
        )

        assertEquals(
            1,
            result
        )
    }

    @Test
    fun case51() {
        val sut = `1095-find-in-mountain-array`()

        val result = sut.findInMountainArray(
            2,
            MountainArray(intArrayOf(1,5,2))
        )

        assertEquals(
            2,
            result
        )
    }
}
