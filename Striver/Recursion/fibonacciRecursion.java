package Striver.Recursion;

public class fibonacciRecursion {
    public static int fibSeries(int no) {
        if (no < 1)
            return 0;
        return fibSeries(no - 2) + fibSeries(no - 1);
    }

    public static void main(String[] args) {
        int no = 5;
        System.out.println(fibSeries(no));
    }
}
