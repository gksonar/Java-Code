package Striver.Array;

import java.util.Arrays;

public class ArrayRotation {

    public static void reverse(int a[], int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int a[], int k) {
        k = k % a.length;
        if (k < 0) {
            k = a.length + k;
        }
        // if (k > a.length) {
        // k = k % a.length;
        // }
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
    }

    public static void leftrotate(int a[], int k) {
        k = k % a.length;
        if (k < 0) {
            k = a.length + k;
        }
        // if (k > a.length) {
        // k = k % a.length;
        // }
        reverse(a, 0, k - 1);
        reverse(a, 0, a.length - 1);
        reverse(a, 0, a.length - 1 - k);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        // rotate(a, 1);
        // System.out.println(Arrays.toString(a));
        leftrotate(a, 2);
        System.out.println(Arrays.toString(a));
    }
}
