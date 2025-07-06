import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "grapes", "orange", "coconut"};
        String target;
        boolean isFound = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Search item: ");
        target = scanner.nextLine();

        // LET THE USER A STRING
        for (int i =0; i < fruits.length; i++) {

            if(fruits[i].equals(target)) {
                System.out.printf("%s found in index: %d", target, i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.printf("%s was not found", target );
        }

    }
}