package Oop;

public class StaticBlock {
    static int a = 10;
    static int b;

    static {
        System.out.println("Im a static Block");
        b = a * 5;

    }

    public static void main(String[] args) {
        // StaticBlock s = new StaticBlock();
        System.out.println(a + " " + b);
        b += 3;
        System.out.println(a + " " + b);
    }
}
