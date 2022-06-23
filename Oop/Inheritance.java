package Oop;

public class Inheritance {
    double l, b, h;

    Inheritance() {
        this.l = -10;
        this.b = -1;
        this.h = -1;
    }

    Inheritance(double side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Inheritance(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Inheritance(Inheritance i) {
        this.l = i.l;
        this.b = i.b;
        this.h = i.h;
    }
}

class InheritanceDerived extends Inheritance {
    double weight;

    InheritanceDerived() {
        this.weight = -1;
    }

    InheritanceDerived(double l, double b, double h, double weight) {
        this.l = l;
        this.b = b;
        this.h = h;
        this.weight = weight;
    }

    InheritanceDerived(double side, double weight) {
        // this.l = side;
        // this.b = side;
        // this.h = side;
        super(side);
        this.weight = weight;
    }

    InheritanceDerived(Inheritance i) {
        this.l = i.l;
        this.b = i.b;
        this.h = i.h;
    }
}

class InheritanceCall {
    public static void main(String[] args) {
        InheritanceDerived id = new InheritanceDerived();
        // accessing parent class variable using child class object only
        System.out.println(id.weight);
        System.out.println(id.l);
        System.out.println(id.h);
        System.out.println(id.b);

        System.out.println();
        InheritanceDerived id1 = new InheritanceDerived(2, 4, 6, 8);
        // accessing parent class variable using child class object only
        System.out.println(id1.l);
        System.out.println(id1.h);
        System.out.println(id1.b);
        System.out.println(id1.weight);

        System.out.println();

        InheritanceDerived id2 = new InheritanceDerived(0025, 8);
        // accessing parent class variable using child class object only
        System.out.println(id2.l);
        System.out.println(id2.h);
        System.out.println(id2.b);
        System.out.println(id2.weight);

        System.out.println();

        InheritanceDerived id3 = new InheritanceDerived(id2);
        // id3 = id2;
        // accessing parent class variable using child class object only
        System.out.println(id3.l);
        System.out.println(id3.h);
        System.out.println(id3.b);
        System.out.println(id3.weight);

        System.out.println();
        Inheritance i = new InheritanceDerived(12, 25);
        System.out.println(i.l + "--Using Parent Class Object");

        // parent class object referes to vhild class but child class object cant get
        // instantiated with parent class
        // InheritanceDerived i = new Inheritance(25); // this is not possible
        // System.out.println(i.l + "--Using Parent Class Object");

    }
}