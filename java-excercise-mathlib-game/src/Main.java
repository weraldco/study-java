import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable
        String noun1;
        String noun2;
        String adjective1;
        String adjective2;
        String verb1;
        String adjective3;
        String verb2;

        // User input
        System.out.print("Enter a noun (a subject or topic): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter a noun (a person): ");
        noun2 = scanner.nextLine();

        System.out.print("Enter an adjective (): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter an adjective (): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb (action): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (): ");
        adjective3 = scanner.nextLine();

        System.out.print("Enter a verb (action): ");
        verb2 = scanner.nextLine();

        // Sentences
        System.out.println("\nToday I study about " + noun1 + " lesson.");
        System.out.println("I found out that " + noun2 + " is also in the class.");
        System.out.println("She is " + adjective1 + " and " + adjective2 + ".");
        System.out.println("Before the class end, she " + verb1 + " me to go to coffee shop .");
        System.out.println("I am " + adjective3 + " but I still " + verb2 + " with her.");
        // Output
    }
}