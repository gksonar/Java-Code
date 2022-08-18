package StriverPlacementSeries;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] MergeTwoSortedArrays(int a[], int b[]) {
        int c[] = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else
                c[k++] = b[j++];
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

        return c;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        int b[] = { 4, 5, 6 };
        System.out.println(Arrays.toString(MergeTwoSortedArrays(a, b)));
    }
}
