package Oop;

public abstract class AbstractClass {

    abstract void Greet(String name);

    void display() {
    }

}

class HiGreet extends AbstractClass {
    String name;

    @Override
    public void Greet(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Hi Greet Call: " + name);
    }
}

class HelloGreet extends AbstractClass {
    String name;

    @Override
    public void Greet(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Hello Greet Call: " + name);
    }

    public static void main(String[] args) {
        HiGreet a = new HiGreet();
        a.Greet("Gaurav");
        a.display();

        HelloGreet b = new HelloGreet();
        b.Greet("Sonar");
        b.display();

    }
}