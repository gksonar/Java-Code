package Striver.Recursion;

public class PrintNames5Times {
    public static void recursiveFun(int i, int N, String s) {
        if (i == N) {
            return;
        }
        System.out.println(s);
        recursiveFun(++i, N, s);
    }

    public static void main(String[] args) {
        String s = " Gaurav ";
        int i = 0;
        int N = 5;
        recursiveFun(i, N, s);
    }
}
