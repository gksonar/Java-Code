package Striver;

public class AllDivisors {
    public static void Divisors(int a) {
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int a = 5;
        Divisors(a);
    }
}
