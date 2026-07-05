import java.util.Stack;

public class Day31 {

    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        books.push("Java");
        books.push("DSA");
        books.push("GitHub");

        System.out.println(books.pop());

        System.out.println(books);
    }
}
