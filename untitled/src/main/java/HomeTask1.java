import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;


public class HomeTask1 {
    public static double first;
    public static double second;
    public static final String INV = "-0";

    public static void main(String[] args) {
        Scanner operands = new Scanner(System.in);
        String a = operands.next();
        String b = operands.next();
        if (isNumberCheck(a, b)) {
            plusOperation(first, second);
            minusOperation(first, second);
            multiplicationOperation(first, second);
            divisionOperation(first, second);
        }
    }
    public static boolean isNumberCheck(String a, String b) {
        if (a == null || b == null)  {
            System.out.println("You entered an empty value");
            return false;
        }
        if (a.equals(INV) || b.equals(INV)){
            System.out.println("Zero cannot be negative");
            return false;
        }
        try {
            first = Double.parseDouble(a);
            second = Double.parseDouble(b);
        } catch (NumberFormatException error) {
            System.err.println(error.getMessage());
            System.out.println("You entered an invalid value");
            return false;
        }
        return true;
    }

    public static void plusOperation(double first, double second) {
        System.out.println("1. The sum is " + numberConversion (first + second) );
    }

    public static void minusOperation(double first, double second) {
        System.out.println("2. The minus is " + numberConversion (first - second));
    }

    public static void multiplicationOperation(double first, double second) {
        System.out.println("3. The multiplication is " + numberConversion (first * second));
    }

    public static void divisionOperation(double first, double second) {
        if (second != 0) {
            System.out.println("4. The division is " + numberConversion (first / second));
        } else {
            System.out.println("4. You can't divide by zero");
        }
    }
    public static String numberConversion (double result){
        BigDecimal conclusion = new BigDecimal(result);
        conclusion = conclusion.setScale(2, RoundingMode.DOWN);
        DecimalFormat format = new DecimalFormat("0.#");

        return format.format(result);
    }

}
