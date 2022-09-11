package Striver.Recursion;

public class SumOfNatural {
    public static void recursiveFun(int N, int sum) {
        if (N < 0) {
            System.out.println(sum);
            return;
        }
        recursiveFun(N - 1,( sum + (int) Math.pow (N,3)));
    }

    public static void main(String[] args) {
        int N = 5;
        // System.out.println(recursiveFun(N));
        recursiveFun(N, 0);
    }
}
