import java.util.Scanner;
public class Main {
   public static  void main(String[] args){
      // Enriched Switch -> A replacement to many else if statement (Java 14 features)

      String day = "Sunday";

//      switch(day) {
//         case "Monday" -> System.out.printf("It's %s today! I hate %s", day,day);
//         case "Friday" -> System.out.printf("It's %s and I'm excited to weekend",day);
//         case "Saturday" -> System.out.printf("It's %s let's have fun!",day);
//         default -> System.out.println("Invalid day!");
//      }

//      Multiple cases in 1 case
      switch (day) {
         case "Monday", "Tuesday", "Wednesday" -> System.out.printf("It's %s today and It's weekday!", day);
         case "Friday" -> System.out.printf("It's %s and I'm excited to weekend", day);
         case "Saturday", "Sunday" -> System.out.printf("It's %s and it's weekend, let's have fun!", day);
         default -> System.out.printf("%s is not a day!", day);
      }



       // Ternary Operator -> return 1 of 2 values if a condition is true
       // usage: (condition) ? ifTrue : ifFalse;




      /*

       // .substring() = A method used to extract a portion of a string.
       // example: string.substring(start_index, end_index)


       Scanner scanner = new Scanner(System.in);
       String email,username,domain;
       // String email = "testemail@gmail.com";

       do {
           System.out.print("Enter your email: ");
           email = scanner.nextLine();

       } while (!email.contains("@") && email.lastIndexOf(".") == -1);


       if (email.contains("@") && email.lastIndexOf(".") != -1) {
           username = email.substring(0,email.indexOf("@"));
           System.out.printf("username: %s\n", username);

           domain = email.substring(email.indexOf("@") + 1);
           System.out.printf("domain: %s\n", domain);
       } else {
           System.out.printf("Email %s is invalid!\n", email);
       }


        scanner.close();

      */
   }
}
