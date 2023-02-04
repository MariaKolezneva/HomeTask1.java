import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilCalculationTest {

    @ParameterizedTest
    @MethodSource("params")
    public void testIsNumberCheck(boolean expected, String param1, String param2) {
        assertEquals(expected, UtilCalculation.isNumberCheck(param1, param2));
    }

    @Test
    public static List<Object[]> params() {
        List<Object[]> results = new ArrayList<>();
        results.add(new Object[]{false, null, null});
        results.add(new Object[]{true, "-0", "-0"});
        results.add(new Object[]{false, "ab&%c", "45"});
        results.add(new Object[]{false, "456.65", "dft"});
        results.add(new Object[]{false, "rty", "#$gg"});
        return results;
    }
    @ParameterizedTest
    @MethodSource("divischeck")
    public void testisDivisionCheck(boolean expected, Double param1, Double  param2) {
        assertEquals(expected, UtilCalculation.isDivisionCheck(param1, param2));
    }

    @Test
    public static List<Object[]> divischeck() {
        List<Object[]> divischeck = new ArrayList<>();
        divischeck.add(new Object[]{true, "0", "-34.53"});
        divischeck.add(new Object[]{true, "678", "34.0"});
        divischeck.add(new Object[]{false, "-5646.54", "0"});
        divischeck.add(new Object[]{false, "0", "0"});
        return divischeck;
    }
}
