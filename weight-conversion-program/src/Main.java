import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight Conversion Program\n");
        System.out.print("1: Convert LBs to KGs\n");
        System.out.print("2: Convert KGs to LBs\n");

        int option;
        double lbs, kgs;
        do {
            System.out.print("Choose an option: \n");
            option = scanner.nextInt();
        }
        while (option != 1 && option != 2);

        if (option == 1) {
            System.out.print("Enter the weight in LBs: \n");
            lbs = scanner.nextDouble();
            kgs = lbs / 2.205;
            System.out.printf(" [%.2f lbs] is equal to [%.2f kgs]\n", lbs, kgs);
        }
        else  {
            System.out.print("Enter the weight in KGs: \n");
            kgs = scanner.nextDouble();
            lbs = kgs * 2.205;
            System.out.printf(" [%.2f kgs] is equal to [%.2f lbs]\n", kgs, lbs);
        }

        scanner.close();
    }
}
