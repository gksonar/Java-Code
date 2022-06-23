package Oop;

public class CopyConstructor {

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

    CopyConstructor(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

}

class CopyConstructorCall {

    public static void main(String[] args) {
        CopyConstructor cc = new CopyConstructor(10, "Gaurav", 94.51f);
        CopyConstructor cc1 = cc;
        cc.test1("tejas");
        cc.test();
        System.out.println(cc1.roll);
        System.out.println(cc.name);
        System.out.println(cc.marks);
    }
}