import java.io.*;

public class Main {
    public static void main(String[] args) {
//    -> READING A FILE!
        String filePath = "/Users/MAC/Desktop/test/test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("File exist!");
            String line;
            while((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("Something went wrong!");
        }

//    -> WRITING A FILE!
//        try (FileWriter writer = new FileWriter("/Users/MAC/Desktop/test/test.txt")) {
//            writer.write("I LOVE PIZZA! ESPECIALLY HAWAIIAN!");
//            System.out.println("Successfully written a file!");
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("Could not locate location!");
//        }
//         catch (IOException e) {
//             System.out.println("Could not write a file");
//         }
    }
}