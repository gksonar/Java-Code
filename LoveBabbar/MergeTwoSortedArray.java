package LoveBabbar;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 0, 0, 0 };
        int b[] = { 4, 5, 6 };
        int m = a.length - 1;
        int n = b.length - 1;
        int index = m;
        while (n > 0) {
            if (m > 0 && a[m - 1] > b[n - 1]) {
                a[index] = a[m - 1];
                m--;
            } else {
                a[index] = b[n - 1];
                n--;
            }
            index--;
        }
        System.out.println(Arrays.toString(a));
    }
}