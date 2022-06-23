package Oop;

public class MethodOverloading {

    public static void main(String[] args) {

        Methods mo = new Methods();
        mo.add(10, 20);
        mo.add(10, 20, 30);
    }
}

class Methods {
    int a = 10;
    int b = 20;
    int c = 30;

    void add(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Add two Variable: " + (a + b));
    }

    void add(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        System.out.println("Add Three Variable: " + (a + b + c));
    }
}