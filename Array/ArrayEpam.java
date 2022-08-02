package Array;

import java.util.Arrays;

public class ArrayEpam {
    static void PrintLast(int ar[]) {
        System.out.println(ar[0]);
        System.out.println(ar[4 - 1]);
        System.out.println(ar[5 - 1]);
    }

    public static void main(String[] args) {
        int a[] = new int[5];
        Arrays.fill(a, 0, 3, 1);
        PrintLast(a);

        // int count = 0;
        // for (int i = a.length - 1; i > 0; i--) {
        // if (a[i] == 0) {
        // count++;
        // for (int j = i; j < a.length - 1; j++)
        // a[j] = a[j + 1];
        // }
        // }
        // for (int i = a.length - count; i < a.length; i++) {
        // a[i] = 0;
        // }

        System.out.println(Arrays.toString(a));
    }
}
