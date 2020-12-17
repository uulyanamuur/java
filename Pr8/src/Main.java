import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task1
        writeToFile(false);
        System.out.println();

        //Task2
        readFile();
        System.out.println("\n");

        //Task3
        System.out.println("Current text file rewritten.");
        writeToFile(false);
        readFile();
        System.out.println("\n");

        //Task4
        System.out.println("Line added");
        writeToFile(true);
        System.out.println();
        readFile();

    }

    private static void writeToFile(boolean append) {
        try (FileWriter writer = new
                FileWriter("file.txt", append)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter line: ");

            String text = scanner.nextLine();
            writer.write(text);
            writer.flush();
            System.out.println("Line added");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void readFile() {
        try (FileReader reader = new
                FileReader("file.txt")) {
            int c;
            System.out.println("Lines in text file:");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}