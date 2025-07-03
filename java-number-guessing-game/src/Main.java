import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to guessing game!");

        int guess = 0;
        int randomNumber = random.nextInt(1,10);
        int attemps = 1;
        String status = "lost";

        while (guess != randomNumber && attemps != 6) {
            System.out.printf("Attemps %d\n",attemps);
            System.out.print("Enter your guess number: ");
            guess = scanner.nextInt();

            if(guess < 1 || guess > 10) {
                System.out.printf("Your guess is %d and it's INVALID!!\n", guess);
            }
            else {
                if (randomNumber > guess) {
                    System.out.printf("You guess is %d and it's to low!\n",guess);
                }
                else if (randomNumber < guess) {
                    System.out.printf("Your guess is %d and it's to high!\n", guess);
                }
                else {
                    status = "won";
                    System.out.println("Congrats you guess it right!");
                }
            }

            attemps++;

        }

        if (status == "lost") {
            System.out.println("You lost! Out of attemps!");
        }
    scanner.close();
    }
}