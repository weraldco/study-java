import java.util.Scanner;
public class Main {
    static double balance = 0;
    static double deposit,withdraw;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.print("**************\nBANKING SYSTEM\n**************\n");
            System.out.print("[1] Show Balance \n[2] Deposit\n[3] Withdraw\n[4] Exit\n");
            System.out.print("**************\n");
            System.out.print("Enter your choice (1-4): \n");
            option = scanner.nextInt();
            //switch the options
            switch (option) {
                case 1 -> {
                    showBalance(balance);
                }
                case 2 -> {
                    balance += depositCash();
                }
                case 3 -> {
                    balance -= withdrawCash();
                }
                default -> {
                    System.out.println("Cannot proceed, invalid option");
                }
            }
        }
        while (option != 4);

        System.out.print("Exiting the program..\n");

    scanner.close();
    }

    static  void showBalance(double balance) {
        System.out.printf("Outstanding Balance: $%.2f\n", balance);
    }

    static double depositCash() {
        System.out.print("Enter amount you want to deposit: \n");
        deposit = scanner.nextDouble();
        if(deposit < 0) {
            System.out.println("Cannot deposit negative amount!");
            return 0;
        }
        else {
            System.out.printf("Deposit %.2f in your account!\n", deposit);
            return  deposit;
        }
    }
    static  double withdrawCash() {
        System.out.print("Enter amount you want to withdraw: \n");
        withdraw = scanner.nextDouble();
        if (withdraw < 0) {
           System.out.println("Cannot withdraw negative amount!");
            return 0;
        } else if (withdraw > balance) {
            System.out.println("Cannot withdraw, insufficient balance!");
            return 0;
        }
        else {
            System.out.printf("Withdraw %.2f from your balance.\n", withdraw);
            return withdraw;
        }
    }

}