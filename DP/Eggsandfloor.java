package DP;

public class Eggsandfloor {
    public static int eggsdrop(int e, int f) {
        if (f == 0 || f == 1)
            return f;
        if (e == 1) {
            return f;
        }
        int min = Integer.MAX_VALUE;
        int res;
        for (int i = 1; i <= f; i++) {
            res = Math.max(eggsdrop(e - 1, i - 1), eggsdrop(e, f - i));
            if (res < min) {
                min = res;
            }

        }
        return min + 1;

    }

    public static void main(String[] args) {

        int a = eggsdrop(2, 10);

        System.out.println(a);

    }
}
