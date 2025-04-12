import com.andrewhossam.countSymmetricIntegers
import kotlin.test.Test
import kotlin.test.assertEquals

class `2843Test` {
    @Test
    fun Test1() {
        assertEquals(
            9,
            countSymmetricIntegers(1, 100),
        )
    }

    @Test
    fun Test2() {
        assertEquals(4, countSymmetricIntegers(1200, 1230))
    }
}
