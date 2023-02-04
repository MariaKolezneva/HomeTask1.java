import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeTask1Test {

    @ParameterizedTest
    @MethodSource("params")
    public void testIsNumberCheck(boolean expected, String param1, String param2) {
        assertEquals(expected, UtilCalculation.isNumberCheck(param1, param2));
    }

    @Test
    public static List<Object[]> params() {
       List<Object[]> results = new ArrayList<>();
       results.add(new Object[] {false,null,null});
       results.add(new Object[] {true, "-0","-0"});
       results.add(new Object[]{false, "ab&%c", "45"});
       results.add(new Object[]{false, "456.65", "dft"});
       results.add(new Object[]{false, "rty", "#$gg"});
       return results;
    }

    @ParameterizedTest
    @MethodSource("sum")
    public void testPlusOperation(String expected, Double param1, Double  param2) {
        assertEquals(expected, Calculator.plusOperation(param1, param2));
    }
    @Test
    public static List<Object[]> sum(){
    List<Object[]> sum = new ArrayList<>();
    sum.add (new Object[]{"5856653", "345", "5856308"});
    sum.add (new Object[]{"108,6633", "65.54", "43.1233"});
    sum.add (new Object[]{"0", "0", "0"});
    sum.add (new Object[]{"-619", "-34", "-585"});
    sum.add (new Object[]{"61,5577756545", "3", "58.5577756545"});
    return sum;
    }

    @ParameterizedTest
    @MethodSource("minus")
    public void testMinusOperation(String expected, Double param1, Double  param2) {
        assertEquals(expected, Calculator.minusOperation(param1, param2));

    }
    @Test
    public static List<Object[]> minus(){
        List<Object[]> minus = new ArrayList<>();
        minus.add (new Object[]{"-3451,563", "5", "3456.563"});
        minus.add (new Object[]{"644", "678", "34"});
        minus.add (new Object[]{"332,21619", "678.09696", "345.88077"});
        minus.add (new Object[]{"-5879,54", "-5646.54", "233"});
        minus.add (new Object[]{"0", "0", "0"});
        return minus;
    }

    @ParameterizedTest
    @MethodSource("multi")
    public void testMultiplicationOperation(String expected, Double param1, Double  param2) {
        assertEquals(expected, Calculator.multiplicationOperation(param1, param2));
    }

    @Test
    public static List<Object[]> multi() {
        List<Object[]> multi = new ArrayList<>();
        multi.add(new Object[]{"-172,65", "5", "-34.53"});
        multi.add(new Object[]{"23052", "678", "34"});
        multi.add(new Object[]{"234540,6986594592", "678.09696", "345.88077"});
        multi.add(new Object[]{"1315643,82", "-5646.54", "-233"});
        multi.add(new Object[]{"0", "0", "0"});
        return multi;
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

    @ParameterizedTest
    @MethodSource("divis")
    public void testDivisionOperation(String expected, Double param1, Double  param2) {
        assertEquals(expected, Calculator.divisionOperation(param1, param2));
    }

    @Test
    public static List<Object[]> divis() {
        List<Object[]> divis = new ArrayList<>();
        divis.add(new Object[]{"-0,1448016218", "5", "-34.53"});
        divis.add(new Object[]{"131", "655", "5"});
        divis.add(new Object[]{"1,9604933804", "678.09696", "345.88077"});
        divis.add(new Object[]{"2823", "-5646", "-2"});
        return divis;
    }
}