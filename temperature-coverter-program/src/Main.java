import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp, result;
        String option;
        System.out.print("Enter a temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to: type (c) celsius, type (f) fahrenheit: \n");
        option = scanner.next();

        result = (option.toLowerCase() == "c") ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("Temperature: %.2f is equal to %.2f %s",temp, result,(option == "c") ? "Celsius" : "Fahrenheit");

        scanner.close();
    }
}
