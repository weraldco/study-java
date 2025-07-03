import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // DICE ROLLER GAME PROGRAMS
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rollTimes = 0;
        int total = 0;

        System.out.print("How many rolls: ");
        rollTimes = scanner.nextInt();
        if (rollTimes <= 0) {
            System.out.print("Rolls cannot be 0 or negative, try again!");
        } else {
            for (int i = 0; i < rollTimes; i++) {
                int diceCount = random.nextInt(1,7);

                System.out.printf("Roll # %d : %d\n",i,diceCount);
                System.out.print(dice(diceCount));
                total += diceCount;
            }
        }

        System.out.printf("Total: %d\n", total);
        scanner.close();
    }

    static String dice(int number) {
        String message = "";
        switch (number) {
            case 1 -> {
                message = " --------- \n|         |\n|    ●    |\n|         |\n --------- \n";
            }
            case 2 -> {
                message = " --------- \n| ●       |\n|         |\n|       ● |\n --------- \n";
            }
            case 3 -> {
                message = " --------- \n|    ●    |\n|    ●    |\n|    ●    |\n --------- \n";
            }
            case 4 -> {
                message = " --------- \n|  ●   ●  |\n|         |\n|  ●   ●  |\n --------- \n";
            }
            case 5 -> {
                message = " --------- \n|  ●   ●  |\n|    ●    |\n|  ●   ●  |\n --------- \n";
            }
            case 6 -> {
                message = " --------- \n|  ●   ●  |\n|  ●   ●  |\n|  ●   ●  |\n --------- \n";
            }
            default ->  message= "Invalid Roll!";
        }

        return message;
    }
}