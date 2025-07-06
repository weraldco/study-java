import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};
        String userOption = "";
        String computerOption = "";
        int randomComputer;
        boolean continuePlaying = false;
        String playMore = "";

        do {
            int userScore = 0;
            int computerScore = 0;

            while (userScore != 3 && computerScore != 3) {
                System.out.print("#####################\n");
                System.out.printf("USER: %d - COMPUTER: %d\n", userScore, computerScore);
                System.out.print("#####################\n");

                System.out.print("Enter your move (rock, paper, scissors): ");
                userOption = scanner.nextLine();

                if (userOption.equals("rock") || userOption.equals("paper") ||  userOption.equals("scissors") ) {
                    randomComputer = random.nextInt(0,3);
                    computerOption = options[randomComputer];

                    System.out.printf("Computer choice: %s\n", computerOption);

                    if (userOption.equals("rock")  && computerOption.equals("paper") ) {
                        computerScore++;
                        System.out.print("COMPUTER WINS!\n");
                    } else if (userOption.equals("paper")  && computerOption.equals("scissors") ) {
                        computerScore++;
                        System.out.print("COMPUTER WINS!\n");
                    } else if (userOption.equals("scissors")  && computerOption.equals("rock") ) {
                        computerScore++;
                        System.out.print("COMPUTER WINS!\n");
                    } else if (userOption.equals(computerOption) ) {
                        computerScore++;
                        userScore++;
                        System.out.print("TIED!\n");
                    } else {
                        userScore++;
                        System.out.print("YOU WINS!\n");
                    }
                } else {
                    System.out.print("Invalid move!\n");
                }
            }
            System.out.print("#####################\n");
            System.out.printf("USER: %d - COMPUTER: %d\n", userScore, computerScore);
            System.out.printf("RESULT: %s\n", (userScore > computerScore ? "YOU WIN!" : userScore == computerScore ? "TIED!" : "COMPUTER WINS!"));

            System.out.print("#####################\n");


            System.out.print("Play more? [y] Yes, [n] No or type any to exit:");
            playMore = scanner.nextLine();

            if(playMore.equalsIgnoreCase("y")) {
                continuePlaying = true;

            } else if(playMore.equalsIgnoreCase("n")) {
                continuePlaying = false;
                System.out.print("Thank you for playing!\n");

            } else {
                continuePlaying = false;
                System.out.print("Thank you for playing!\n");
            }

        } while (continuePlaying );


    }
}