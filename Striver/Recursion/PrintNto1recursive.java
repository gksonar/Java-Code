package Striver.Recursion;

public class PrintNto1recursive {
    public static void recursiveFun(int a, int b) {
        if (a < b)
            return;
        System.out.println(b);
        recursiveFun(a, --b);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        recursiveFun(a, b);
    }
}
