import java.text.DecimalFormat;

public class UtilCalculation {
    public static boolean isNumberCheck(String a, String b) {
        if (a == null || b == null) {
            System.out.println("You entered an empty value");
            return false;
        }
        if (a.equals("-0")) {
            a = String.valueOf(Math.abs(Integer.parseInt(a)));
        }
        if (b.equals("-0")) {
            b = String.valueOf(Math.abs(Integer.parseInt(b)));
        }
        try {
            Calculator.first = Double.parseDouble(a);
            Calculator.second = Double.parseDouble(b);
        } catch (NumberFormatException error) {
            System.err.println("You entered an invalid value");
            return false;
        }
        return true;
    }
    public static boolean isDivisionCheck(double first, double second) {
        try {
            double div = first / second;
            if (Double.isNaN(div)) {
                throw (new ArithmeticException("NAN"));
            } else if (Double.isInfinite(div)) {
                throw (new ArithmeticException("INFINITE"));
            }
        } catch (ArithmeticException e) {
            System.err.println("4. The second number should not be 0");
            return false;
        }
        return true;
    }
    public static String numberConversion ( double result){
        DecimalFormat format = new DecimalFormat("#.##########");
        return format.format(result);
    }
}

