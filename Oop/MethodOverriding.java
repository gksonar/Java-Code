package Oop;

class Shapes {
        void area() {
        System.out.println("Shapes Area Called");
    }
}

class Square extends Shapes {
    @Override // This annotation represents the method is overridden or not.
        void area() {
        System.out.println("Square Area Called");
    }
}

class Circle extends Shapes {
    @Override
        void area() {
        System.out.println("Circle Area Called");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area();
        // Circle c1 = new Circle(); // Here directly call the method using class name
        // so dont acchieved method
        // // Overriding
        // c1.area();
        Shapes c = new Circle();
        c.area();

        Shapes sq = new Square();
        sq.area();

    }
}
