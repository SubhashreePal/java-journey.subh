import java.util.Queue;
import java.util.LinkedList;

public class Day29 {

    public static void main(String[] args) {

        Queue<String> tasks =
                new LinkedList<>();

        tasks.add("Java");
        tasks.add("DSA");
        tasks.add("GitHub");

        System.out.println(tasks.poll());

        System.out.println(tasks);
    }
}
