import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/Marilag.wav";
        File file = new File(filePath);

        try (Scanner scanner  = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")) {
                System.out.print("""
                        P = Play
                        S = Pause
                        R = Reset
                        Q = Quit
                        """);

                System.out.print("Choice: ");
                response = scanner.next().toUpperCase();

                switch ( response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch(UnsupportedAudioFileException e) {
            System.out.println("File not supported!");
        }
        catch(IOException e) {
            System.out.println("Something went wrong!");
        }
        catch(LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        finally {
            System.out.println("Thank you for playing music!");
        }
    }
}