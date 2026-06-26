import java.util.HashMap;

public class Day22 {

    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Java", 95);
        marks.put("Python", 90);
        marks.put("Database", 88);

        for(String subject : marks.keySet()) {

            System.out.println(subject + " : " + marks.get(subject));
        }
    }
}