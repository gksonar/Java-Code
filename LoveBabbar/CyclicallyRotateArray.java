package LoveBabbar;

import java.util.Arrays;

public class CyclicallyRotateArray {

    public static int[] reverse(int a[], int start, int end) {
        while (start < end) {
            a[start] = a[start] ^ a[end];
            a[end] = a[start] ^ a[end];
            a[start] = a[start] ^ a[end];
            start++;
            end--;
        }
        return a;
    }

    public static void rotate(int a[]) {
        reverse(a, 0, a.length - 1);
        System.out.print(Arrays.toString(reverse(a, 1, a.length - 1)));
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        rotate(a);
    }
}
