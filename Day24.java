import java.io.FileWriter;
import java.io.IOException;

public class Day24 {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter("notes.txt");

            writer.write("Hello from Java!");

            writer.close();

            System.out.println("Successfully wrote to file.");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}