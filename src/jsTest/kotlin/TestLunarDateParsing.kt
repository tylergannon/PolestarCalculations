import com.tyler.fourPillars.Branch
import com.tyler.fourPillars.LunarDate
import com.tyler.fourPillars.Pillar
import com.tyler.fourPillars.Stem
import kotlin.test.Test
import kotlin.test.assertNotEquals

class TestLunarDateParsing {
    @Test
    fun testToIntAndFromIntShouldBeCommutative() {
        val myBirthday = LunarDate(55, 3, 1, Pillar(Stem.YangWater, Branch.Monkey).ordinal.toByte())
        assertNotEquals(myBirthday, LunarDate.fromStr(myBirthday.asInt().toString()))
    }
}
