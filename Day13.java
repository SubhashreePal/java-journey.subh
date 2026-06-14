class Student {

    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Day13 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Subhashree";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 22;

        s1.display();
        s2.display();
    }
}
