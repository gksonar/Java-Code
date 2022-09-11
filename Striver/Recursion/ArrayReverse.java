package Striver.Recursion;

import java.util.Arrays;

public class ArrayReverse {
    public static void arrayRev(int a[], int l, int r) {
        if (l >= r)
            return;
        a[l] = a[l] ^ a[r];
        a[r] = a[l] ^ a[r];
        a[l] = a[l] ^ a[r];
        arrayRev(a, l + 1, r - 1);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        arrayRev(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
