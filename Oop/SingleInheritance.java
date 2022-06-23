package Oop;

public class SingleInheritance {
    double l, b, h;

    SingleInheritance(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
}

class SingleInheritanceDerived extends SingleInheritance {
    double weight;

    SingleInheritanceDerived(int l, int b, int h, int weight) {
        super(l, b, h);
        this.weight = weight;
    }

}

class SingleInheritanceCall {
    public static void main(String[] args) {

        SingleInheritanceDerived id1 = new SingleInheritanceDerived(2, 4, 6, 8);
        // accessing parent class variable using child class object only
        System.out.println(id1.l);
        System.out.println(id1.h);
        System.out.println(id1.b);
        System.out.println(id1.weight);
        System.out.println();

    }
}