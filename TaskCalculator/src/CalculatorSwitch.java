import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first value");
        double firstValue = sc.nextDouble();
        System.out.println("Choose operation: +, -, *, /, % ");
        String operator = sc.next();
        System.out.println("Write second value");
        double secondValue = sc.nextDouble();
        double result;
        switch (operator) {
            case "+" -> {
                result = firstValue + secondValue;
                System.out.println("Result is: " + result);
            }
            case "-" -> {
                result = firstValue - secondValue;
                System.out.println("Result is: " + result);
            }
            case "/" -> {
                if (secondValue == 0) {
                    System.out.println("Division by '0' is impossible. Try again");
                }
                result = firstValue / secondValue;
                System.out.println("Result is: " + result);
            }
            case "*" -> {
                result = firstValue * secondValue;
                System.out.println("Result is: " + result);
            }
            case "%" -> {
                result = firstValue % secondValue;
                System.out.println("Result is: " + result);
            }
            default -> System.out.println("Sorry, but this is a not correct value. Try again");
        }
    }
}