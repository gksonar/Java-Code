package Striver.Recursion;

public class factorial {
    public static int fact(int no) {
        if (no == 1)
            return 1;
        return no * fact(no - 1);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(fact(a));

    }
}
