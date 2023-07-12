import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("src/nums.txt"));
            String line = null;

            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Total = " + total);

        } catch (FileNotFoundException err) {
            System.out.println("Error occured: " + err);
        } finally {
            reader.close();
        }
    }

}