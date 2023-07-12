import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // createNewFile();
        // getFileInfo();
        readFile();
        writeFile("This is an example text.");
        readFile();
    }

    public static void createNewFile() {
        File file = new File("/Users/erimsaholut/IdeaProjects/files/students.txt");
        try {

            if (file.createNewFile())
                System.out.println("File created");
            else
                System.out.println("This file already exits");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo() {
        File file = new File("/Users/erimsaholut/IdeaProjects/files/students.txt");
        if (file.exists()) {
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File name: " + file.getName());
            System.out.println("File size (byte): " + file.length());
            System.out.println("Is file readable: " + file.canRead());
            System.out.println("Is file writable: " + file.canWrite());
            System.out.println("Is file executable: " + file.canExecute());

        }
    }

    public static void readFile() {
        File file = new File("/Users/erimsaholut/IdeaProjects/files/students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(String addThis) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/erimsaholut/IdeaProjects/files/students.txt", true));
            writer.newLine();
            writer.write(addThis);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}