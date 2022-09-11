package Striver.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int a[], int lb, int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (a[start] <= pivot) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        int temp = a[end];
        a[end] = a[lb];
        a[lb] = temp;

        return end;

    }

    public static void QuickSortfun(int a[], int lb, int ub) {
        if (lb < ub) {
            int pos = partition(a, lb, ub);
            QuickSortfun(a, lb, pos - 1);
            QuickSortfun(a, pos + 1, ub);
        }
    }

    public static void main(String[] args) {
        int a[] = { 10, 6, 7, 8, 9, 10, 11, 4 };
        QuickSortfun(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }
}
