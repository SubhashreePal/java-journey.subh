import java.io.File;
import java.io.IOException;

public class Day23 {

    public static void main(String[] args) {

        try {

            File myFile = new File("notes.txt");

            if (myFile.createNewFile()) {
                System.out.println("File created!");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
