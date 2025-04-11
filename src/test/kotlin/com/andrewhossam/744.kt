import com.andrewhossam.`find-smallest-letter-greater-than-target-744`
import kotlin.test.Test
import kotlin.test.assertEquals

class `find-smallest-letter-greater-than-target-744Test` {
    val sut = `find-smallest-letter-greater-than-target-744`()

    @Test
    fun case1() {
        assertEquals(
            'c',
            sut.nextGreatestLetter(
                charArrayOf('c', 'f', 'j'),
                'a',
            ),
        )
    }

    @Test
    fun case2() {
        assertEquals(
            'f',
            sut.nextGreatestLetter(
                charArrayOf('c', 'f', 'j'),
                'c',
            ),
        )
    }

    @Test
    fun case3() {
        assertEquals(
            'x',
            sut.nextGreatestLetter(
                charArrayOf('x', 'x', 'y', 'y'),
                'z',
            ),
        )
    }

    @Test
    fun case4() {
        assertEquals(
            'c',
            sut.nextGreatestLetter(
                charArrayOf('c', 'f', 'j'),
                'j',
            ),
        )
    }
}
