import com.tyler.fourPillars.*
import org.junit.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class LunarDateTest {
    @Test
    fun verifyPillarsFor_April_07_1978() {
        val myBirthday = LunarDate.forDate(LocalDate.of(1978, 4, 7))
        assertEquals(3, myBirthday.monthNumber)
        assertEquals(55, myBirthday.yearInEpoch)
        assertEquals(Pillar(Stem.YangEarth, Branch.Horse), myBirthday.yearPillar)
        assertEquals(Pillar(Stem.YangFire, Branch.Dragon), myBirthday.monthPillar)
        assertEquals(Pillar(Stem.YangWater, Branch.Monkey), myBirthday.hourPillar(Branch.Monkey))
    }

//    110 + 3 % 10 = 3
//    118 + 4

    @Test
    fun verifyPillarsFor_Jun_18_1982() {
        val vanessaBirthday = LunarDate.forDate(LocalDate.of(1982, 6, 18))
        assertEquals(4, vanessaBirthday.monthNumber)
        assertEquals(27, vanessaBirthday.dayOfMonth)
        assertEquals(59, vanessaBirthday.yearInEpoch)
        assertEquals(Pillar(Stem.YangWater, Branch.Dog), vanessaBirthday.yearPillar)
        assertEquals(Pillar(Stem.YinWood, Branch.Snake), vanessaBirthday.monthPillar)
        assertEquals(Pillar(Stem.YangWater, Branch.Monkey), vanessaBirthday.dayPillar)
        assertEquals(Pillar(Stem.YangEarth, Branch.Monkey), vanessaBirthday.hourPillar(Branch.Monkey))

    }
}
