package Oop;

public class InstanceOf {

    double l, b, h;

    InstanceOf(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
}

class InstanceOfDerived extends InstanceOf {
    double weight;

    InstanceOfDerived(int l, int b, int h, int weight) {
        super(l, b, h);
        this.weight = weight;
    }

}

class InstanceOfCall {
    public static void main(String[] args) {

        InstanceOfDerived id1 = new InstanceOfDerived(2, 4, 6, 8);
        InstanceOf id2 = new InstanceOf(2, 4, 6);
        // InstanceOfDerived id3 = new InstanceOf(2, 4, 6);
        InstanceOf id4 = new InstanceOfDerived(2, 4, 6, 8);
        // accessing parent class variable using child class object only
        System.out.println(id1 instanceof InstanceOfDerived);
        System.out.println(id2 instanceof InstanceOf);

        System.out.println(id4 instanceof InstanceOf);
        System.out.println(id4 instanceof InstanceOfDerived);

    }
}