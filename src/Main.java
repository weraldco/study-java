import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter you age: ");
//        int age = scanner.nextInt();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old!");

//       Calculate the area of a rectagle
//        Formula : A = L x W;
        System.out.println("Getting the Area of  RECTANGLE");
        System.out.println("Width: ");
        double width = scanner.nextDouble();

        System.out.println("Length: ");
        double length = scanner.nextDouble();

        double area = width * length;

        System.out.println("AREA: " + area + " cm²");
        scanner.close();
    }
}