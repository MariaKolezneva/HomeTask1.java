import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeTask1 {
    public static double first;
    public static double second;
    public static final String EXIT = "exit";

    public static void main(String[] args) {
        Scanner operands = new Scanner(System.in);
        while (operands.hasNext()) {
            String a = operands.next();
            if (!a.equals(EXIT)) {
                String b = operands.next();
                if (isNumberCheck(a, b)) {
                    plusOperation(first, second);
                    minusOperation(first, second);
                    multiplicationOperation(first, second);
                    divisionOperation(first, second);
                }
            } else {
                break;
            }
        }
    }
    public static boolean isNumberCheck(String a, String b) {
        if (a == null || b == null) {
            System.out.println("You entered an empty value");
            return false;
        }
            if (a.equals("-0")) {
                a =String.valueOf(Math.abs(Integer.parseInt(a)));
            } if (b.equals("-0")){
            b = String.valueOf(Math.abs(Integer.parseInt(b)));
            }try {
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
        System.out.println("1. The sum is " + numberConversion(first + second));
    }

    public static void minusOperation(double first, double second) {
        System.out.println("2. The minus is " + numberConversion(first - second));
    }

    public static void multiplicationOperation(double first, double second) {
        System.out.println("3. The multiplication is " + numberConversion(first * second));
    }

    public static void divisionOperation(double first, double second) {
        try {
            double div = first / second;
            if(Double.isNaN(div)){
                throw(new ArithmeticException("NAN"));
            }
            else if(Double.isInfinite(div)){
                throw(new ArithmeticException("INFINITE"));
            }
            System.out.println("4. The division is " + numberConversion(div));
        } catch (ArithmeticException e) {
            System.out.println("4. The second number should not be 0");
        }
    }
    public static String numberConversion (double result){
        DecimalFormat format = new DecimalFormat("#.##########");
        return format.format(result);
    }
}
