import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double balance = 100;
        double bet = 0 ;

        String[] symbols = {"🍒", "🍉", "🍋", "🍓", "⭐️"};
        String[][] combination = {symbols,symbols,symbols};
        int[] combinationRes = new int[3];
        int randomRes = 0;
        boolean isWon = false;
        boolean continuePlaying = false;
        String play = "";

        System.out.print("""
               ############################
               WELCOME TO Java Slot Machine
               Symbols: 🍒 🍉 🍋 🍓 ⭐️
               ############################
               """);

        do {
            if (balance > 0) {
                System.out.print("Yes\n");

            System.out.printf("Your balance: $%.2f\n", balance);

                do {

                    System.out.print("Place your bet: ");
                    bet = scanner.nextDouble();
                    scanner.nextLine();

                    if (bet > balance) {
                        System.out.print("Insufficient Balance!\n");
                    } else if (bet <= 0) {
                        System.out.print("Cannot bet negative or 0 amount!\n");
                    } else {
                        System.out.print("Bet " + bet + "\n");

                        System.out.print("| ");

                        for (int i = 0; i < combinationRes.length; i++) {
                            combinationRes[i] = random.nextInt(0, symbols.length);
                            System.out.print(symbols[combinationRes[i]] + " | ");
                        }
                        System.out.print("\n");

                        isWon = combinationRes[0] == combinationRes[1] && combinationRes[1] == combinationRes[2];

                        if (isWon) {
                            System.out.print("*******************\n");
                            System.out.print("Congratulations, you won!\n");
                            System.out.print("*******************\n");

                            balance += bet * 10;
                        } else {
                            System.out.print("*******************\n");
                            System.out.print("Sorry, you lost!\n");
                            System.out.print("*******************\n");

                            balance -= bet;
                        }
                    }
                }

                while ((balance < bet || bet <= 0) && balance != 0);

            do {
                System.out.print("Do you want to play more? (Y/N) ");
                play = scanner.nextLine();
            } while (!play.equalsIgnoreCase("y") && !play.equalsIgnoreCase("n"));
            continuePlaying = play.equalsIgnoreCase("y");

            } else {
                System.out.print("\nBalance is 0, not enough credit! \n");
                break;
            }
        } while (continuePlaying);

        System.out.print("Thank you for playing!\n");
        System.out.printf("YOUR BALANCE: $%.2f\n", balance);


     }
}