import java.util.Arrays;
import java.util.List;

public class Day35 {

    public static void main(String[] args) {

        List<String> languages =
                Arrays.asList("java", "python", "github");

        languages.stream()
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }
}
