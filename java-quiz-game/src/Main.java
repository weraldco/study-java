import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaring variables
        Scanner scanner = new Scanner(System.in);
        String start = "";                // check if the answer is y or n
                              // I'm thinking how the user might answer for now by integer.
        int score = 0;                          // Score of the user.

        //String[] recap = new String[3];
        // Welcome the user
        System.out.print("""
                    ******************************
                    Welcome to the Java Quiz Game!
                    ******************************
                    """);

        // Ask if start the quiz [y] sot start and [n] for no or quit
        while (start.isEmpty() || !start.equals("y") && !start.equals("n")) {
            System.out.print("""
                    Do you want to start your quiz ?
                    [y] yes [n] no or exit
                    """);
            start  = scanner.nextLine();
        }
        // Check the start value
        if (start.equals("y")) {
            String[] questions = {"Question 1", "Question 2", "Question 3"};
            String[][] options = {
                    {"[1] Answer 1", "[2] Answer 2", "[3] Answer 3", "[4] Answer 4"},
                    {"[1] Answer 1", "[2] Answer 2", "[3] Answer 3", "[4] Answer 4"},
                    {"[1] Answer 1", "[2] Answer 2", "[3] Answer 3", "[4] Answer 4"},
            };

            int[] answers = {1,2,1};

            // Show the question in order
            for (int i = 0; i < questions.length; i++) {
                int answer = 0;
                System.out.print(questions[i] + "\n");
                 for (String o : options[i]) {
                        System.out.print(o + "\n");

                    }
                while (answer <= 0 || answer > 4) {
                    System.out.print("Answer: ");
                    answer = scanner.nextInt();
                    if (answer <= 0 || answer > 4) {
                        System.out.print("Invalid answer!");
                    }
                }

                // When question answered correctly score++;
                if ( answer == answers[i]) {
                    System.out.print("CORRECT!!\n");
                    score++;
                }  else {
                    System.out.print("WRONG!!\n");
                }

            }

            // After all question answered print the score.
            System.out.printf("YOUR TOTAL SCORE %d\n", score);

            // Print a recap
            //for (String s : recap) {
              //  System.out.print(s + "\n");
            //}
        }
        else {
            System.out.print("Thank you for your time! See you again when you're ready!");
        }




    }
}