package Oop;

public class AccessSpecifier {
    public int add(int a, int b) {
        return a + b;
    }

    protected int sub(int a, int b) {
        return a - b;
    }

    // int multiply(int a, int b) {
    // private int a; // Cannot access to main class
    // this.a = a;
    // return a * b;
    // }
}

class AccessSpecifierCall {
    public static void main(String[] args) {
        AccessSpecifier as = new AccessSpecifier();
        System.out.println("Public Function Call: " + as.add(10, 20));
        System.out.println("Protected Function Call :" + as.sub(10, 20));
        // System.out.println("Private Function Call: " + as.multiply(10, 20));

    }
}
