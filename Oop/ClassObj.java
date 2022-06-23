package Oop;

class Student {
    int roll = 10;
    String name = "Gaurav";
    float marks = 20.20f;
}

public class ClassObj {
    public static void main(String[] args) {
        // Student s1;
        Student s1 = new Student();
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);
    }
}
