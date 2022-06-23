package Oop;

public class MultilevelInnheritance {
    double l, b, h;

    MultilevelInnheritance(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
}

class MultilevelInnheritanceDerived extends MultilevelInnheritance {
    double weight;

    MultilevelInnheritanceDerived(int l, int b, int h, int weight) {
        super(l, b, h);
        this.weight = weight;
    }

}

class MultilevelDerived extends MultilevelInnheritanceDerived {
    double space;

    MultilevelDerived(int l, int b, int h, int weight, int space) {
        super(l, b, h, weight);
        this.space = space;
    }

}

class MultilevelInnheritanceCall {
    public static void main(String[] args) {

        MultilevelDerived id1 = new MultilevelDerived(2, 4, 6, 8, 10);
        // accessing parent class variable using child class object only
        System.out.println(id1.l);
        System.out.println(id1.h);
        System.out.println(id1.b);
        System.out.println(id1.weight);
        System.out.println(id1.space);
        System.out.println();

    }
}
