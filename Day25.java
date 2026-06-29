import java.io.File;
import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {

        try {

            File myFile = new File("notes.txt");

            Scanner sc = new Scanner(myFile);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}