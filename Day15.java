class Person {

    String name = "Subhashree";

    void showName() {
        System.out.println(name);
    }
}

class Student extends Person {

    int roll = 101;

    void showRoll() {
        System.out.println(roll);
    }
}

public class Day15 {

    public static void main(String[] args) {

        Student s = new Student();

        s.showName();
        s.showRoll();
    }
}