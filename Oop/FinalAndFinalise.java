package Oop;

public class FinalAndFinalise {
    public static void main(String[] args) {
        final int a = 15;
        int b = 15;
        System.out.println(a + b);
        // a = 15;
        final FinalMethod f = new FinalMethod(10);
        // FinalMethod f1;
        // for (int i = 0; i < 10000; i++) {
        // f1 = new FinalMethod(i);
        //

        // }
        System.out.println(f.a);
    }

}

class FinalMethod {
    int a;

    FinalMethod(int a) {
        this.a = a;
        System.out.println("object created of number: " + a);
    }

    public void test(int a) {
        this.a = a;
        System.out.println("object created of number: " + a);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object Destroyed");
    }
}