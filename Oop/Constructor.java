package Oop;

public class Constructor {
    int roll;
    String name;
    float marks = 10;

     Constructor() {
        roll = 10;
        name = "Gaurav";
    }

     Constructor(int roll, String name) {
        roll = this.roll;
        name = this.name;
    }

}

class ConstructorCall {
    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(c.roll);
        System.out.println(c.name);
        System.out.println(c.marks);
    }
}
