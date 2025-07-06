import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] option = {"Rock", "Paper", "Scissor"};
        int  userOption = -1;
        int computerOption;

        boolean isPlay = false;
        String start = "";
        int userScore = 0;
        int computerScore = 0;
        System.out.print("""
                ===================
                ROCK PAPER SCISSORS
                ===================
                """);

        while (userScore != 3 && computerScore != 3) {
            System.out.print("#################################\n");
            System.out.printf("USER: %d - COMPUTER: %d\n", userScore, computerScore );
            System.out.print("[1] Rock, [2] Paper, [3] Scissors\n");
            System.out.print("#################################\n");

                System.out.print("Your turn: ");

                userOption = scanner.nextInt() - 1;
                if (userOption < 0 || userOption >2) {
                    System.out.print("Invalid Option!\n");
                } else {
                    computerOption = random.nextInt(0,3);

                    System.out.printf("You: %s VS ", option[userOption]);
                    System.out.printf("Computer: %s\n", option[computerOption]);

                    if(userOption == 0 && computerOption == 1) {
                        computerScore++;
                    }
                    else if(userOption == 1 && computerOption == 2) {
                        computerScore++;
                    }
                    else if(userOption == 2 && computerOption == 0) {
                        computerScore++;
                    }
                    else if(userOption == computerOption) {
                        computerScore++;
                        userScore++;
                    } else {
                        userScore++;
                    }
                }
        }

        System.out.print("#################################\n");
        System.out.printf("USER: %d - COMPUTER: %d\n", userScore, computerScore );
        System.out.printf("%s\n", (userScore > computerScore) ? "YOU WIN": (userScore == computerScore)  ? "TIED" : "COMPUTER WINS" );
        System.out.print("#################################\n");

    }

}