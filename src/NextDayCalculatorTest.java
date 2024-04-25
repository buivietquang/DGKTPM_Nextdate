import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class NextDayCalculatorTest {

    @Test
    public void testFindNextDay_EndOfMonth_NonLeapYear() {
        assertArrayEquals(new int[]{1, 3, 2023}, NextDayCalculator.findNextDay(28, 2, 2023));
    }

    @Test
    public void testFindNextDay_EndOfMonth_LeapYear() {
        assertArrayEquals(new int[]{29, 2, 2024}, NextDayCalculator.findNextDay(28, 2, 2024));
        assertArrayEquals(new int[]{1, 3, 2024}, NextDayCalculator.findNextDay(29, 2, 2024));
    }

    @Test
    public void testFindNextDay_EndOfYear() {
        assertArrayEquals(new int[]{1, 1, 2024}, NextDayCalculator.findNextDay(31, 12, 2023));
    }

    @Test
    public void testLeapYear() {
       
        assert(NextDayCalculator.isLeapYear(2024));  
        assert(!NextDayCalculator.isLeapYear(2023)); 
        assert(NextDayCalculator.isLeapYear(2000));  
        assert(!NextDayCalculator.isLeapYear(1900)); 
    }
}

