import java.util.ArrayList;

public class Day33 {

    public static void main(String[] args) {

        ArrayList<String> names =
                new ArrayList<>();

        names.add("Java");
        names.add("DSA");
        names.add("GitHub");

        names.forEach(name ->
                System.out.println(name));
    }
}