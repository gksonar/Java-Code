package LoveBabbar;

import java.util.Arrays;

public class ArrayReverse {
    public static void Reverse(int a[], int start, int end) {
        while (start < end) {
            a[start] = a[start] ^ a[end];
            a[end] = a[start] ^ a[end];
            a[start] = a[start] ^ a[end];
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int start = 0;
        int end = a.length - 1;
        Reverse(a, start, end);
    }
}
