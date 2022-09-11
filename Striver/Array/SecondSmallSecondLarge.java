package Striver.Array;

public class SecondSmallSecondLarge {
    public static void getLargeandSmall(int a[]) {
        if (a.length == 0 || a.length == 1) {
            return;
        }
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            small = Math.min(small, a[i]);
            large = Math.max(large, a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < secondSmall && a[i] != small)
                secondSmall = a[i];
            if (a[i] > secondlarge && a[i] != large)
                secondlarge = a[i];
        }
        System.out.println(small);
        System.out.println(large);

        System.out.println(secondSmall);
        System.out.println(secondlarge);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 898 };
        getLargeandSmall(a);
    }

}
