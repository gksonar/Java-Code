package Oop;

public class HirarchicalInheritance {
    double l, b, h;

    HirarchicalInheritance(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
}

class HirarchicalInheritanceDerived extends HirarchicalInheritance {
    double weight;

    HirarchicalInheritanceDerived(int l, int b, int h, int weight) {
        super(l, b, h);
        this.weight = weight;
    }

}

class HirarchicalDerived extends HirarchicalInheritance {
    double space;

    HirarchicalDerived(int l, int b, int h, int space) {
        super(l, b, h);
        this.space = space;
    }

}

class HirarchicalInheritanceCall {
    public static void main(String[] args) {

        HirarchicalDerived id1 = new HirarchicalDerived(2, 4, 6, 10);
        // accessing parent class variable using child class object only
        System.out.println(id1.l);
        System.out.println(id1.h);
        System.out.println(id1.b);
        System.out.println(id1.space);
        System.out.println();

        HirarchicalInheritanceDerived id2 = new HirarchicalInheritanceDerived(2, 4, 6, 15);
        // accessing parent class variable using child class object only
        System.out.println(id2.l);
        System.out.println(id2.h);
        System.out.println(id2.b);
        System.out.println(id2.weight);
        System.out.println();

    }
}
