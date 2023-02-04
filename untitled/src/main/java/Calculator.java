import java.util.Scanner;

public class Calculator {
    public static double first;
    public static double second;
    public static final String EXIT = "exit";
    public static void run () {
        Scanner operands = new Scanner(System.in);
        while (operands.hasNext()) {
            String a = operands.next();
            if (!a.equals(EXIT)) {
                String b = operands.next();
                if (UtilCalculation.isNumberCheck(a, b)) {
                    print(first, second);
                }
            } else {
                break;
            }
        }
    }
    public static void print (double first, double second) {
        System.out.println("1. Result of sum is " + Calculator.plusOperation(first, second));
        System.out.println("2. Result of minus is " + Calculator.minusOperation(first, second));
        System.out.println("3. Result of multiplication is " + Calculator.multiplicationOperation(first, second));
        if (UtilCalculation.isDivisionCheck(first, second)) {
            System.out.println("4. Result of division is  " + Calculator.divisionOperation(first, second));
        }
    }
    public static String plusOperation(double first, double second) {
        return UtilCalculation.numberConversion(first + second);
    }
    public static String minusOperation(double first, double second) {
        return UtilCalculation.numberConversion(first - second);
    }
    public static String multiplicationOperation(double first, double second) {
        return UtilCalculation.numberConversion(first * second);
    }
    public static String divisionOperation(double first, double second) {
        return UtilCalculation.numberConversion(first / second);
    }
}
