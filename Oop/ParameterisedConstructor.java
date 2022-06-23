package Oop;

public class ParameterisedConstructor {
    int roll;
    String name;
    float marks;

    public void test() {
        System.out.println("Hello " + name);
    }

    public void test1(String name) {
        this.name = name;
        // System.out.println("Hello " + name);
    }

    ParameterisedConstructor(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

}

class ParameterisedConstructorCall {

    public static void main(String[] args) {
        ParameterisedConstructor pc = new ParameterisedConstructor(10, "Gaurav", 94.51f);
        pc.test1("tejas");
        pc.test();
        System.out.println(pc.roll);
        System.out.println(pc.name);
        System.out.println(pc.marks);
    }
}