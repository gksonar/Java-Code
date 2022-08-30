package Striver;

public class GCDHCF {
    public static int GcdCalculate(int a, int b) {
        int ans = 0;
        for (int i = 1; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 60, b = 40;
        System.out.println(GcdCalculate(a, b));
    }
}
