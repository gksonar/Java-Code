package Oop;

public class ConstructorOverloading {
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

    ConstructorOverloading(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    ConstructorOverloading(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

}

class ConstructorOverloadingCall {

    public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading(10, "Gaurav", 94.51f);
        ConstructorOverloading co1 = new ConstructorOverloading(10, "Gaurav");

        co.test1("tejas");
        co.test();
        System.out.println("Object 1");
        System.out.println(co.roll);
        System.out.println(co.name);
        System.out.println(co.marks);

        System.out.println("Object 2");
        System.out.println(co1.roll);
        System.out.println(co1.name);
    }
}
