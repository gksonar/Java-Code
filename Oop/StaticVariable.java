package Oop;

public class StaticVariable {
    int counter;
    static int count;

    StaticVariable() {
        counter++;
        count++;
        System.out.println("Non Static Counter: " + counter + "-- Static Counter:  " + count);
    }

    static void Greet() {
        System.out.println("Greet Called ");
        // Hello(); // Giving an error Non static method cant acces witout instance of
        // class

        // StaticVariable sv = new StaticVariable();
        // sv.Hello();
    }

    void Hello() {
        // Greet();
        System.out.println("Hello Called");
    }

    void Hi() {
        // Greet();
        System.out.println("Hi Called");
    }

    public static void main(String[] args) {
        StaticVariable sv = new StaticVariable();
        StaticVariable sv1 = new StaticVariable();
        StaticVariable sv2 = new StaticVariable();

        // sv.Greet(); // Should be accesed in a static way
        sv.getClass();
        Greet();
        sv1.Hello();
        sv2.Hi();

    }
}
