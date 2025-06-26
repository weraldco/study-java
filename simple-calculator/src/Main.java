import java.util.Scanner;
public class Main {
    public  static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result, firstNum = 0, secondNum = 0;
        String operation;

        System.out.print("SIMPLE CALCULATOR \n");

        // user enter the first number
        System.out.print("Enter the first number: \n");
        firstNum = scanner.nextDouble();

        // enter a second number
        System.out.print("Enter the second number: \n");
        secondNum = scanner.nextDouble();

        // choose an operation
        System.out.print("Choose an operation (+, -, *, / ): ");
        operation = scanner.next();

        if(firstNum != 0 && secondNum != 0) {
            switch (operation) {
                case "+" -> {
                    result = firstNum + secondNum;
                    System.out.printf("%.1f %s %.1f = %.1f", firstNum, operation,secondNum,result);
                }
                case "-" -> {
                    result = firstNum - secondNum;
                    System.out.printf("%.1f %s %.1f = %.1f", firstNum, operation,secondNum,result);
                }
                case "*" -> {
                    result = firstNum * secondNum;
                    System.out.printf("%.1f %s %.1f = %.1f", firstNum, operation,secondNum,result);
                }
                case "/" -> {
                    result = firstNum / secondNum;
                    System.out.printf("%.1f %s %.1f = %.1f", firstNum, operation,secondNum,result);
                }
                default -> System.out.printf("Invalid operation: %s\n", operation);
            }


        } else {
            System.out.print("You input invalid value or 0\n");
        }

        // show result.
    }
}
