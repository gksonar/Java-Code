package Striver.Sorting;

import java.util.Arrays;

public class MergeSort {
    static void Merge(int a[], int lb, int mid, int ub) {
        int b[] = new int[a.length];
        int i = lb;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ub) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
                k++;
            } else {
                b[k] = a[j];
                j++;
                k++;
            }
        }
        if (i > mid) {
            while (j <= ub) {
                b[k] = a[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                b[k] = a[i];
                k++;
                i++;
            }
        }
        for (int k2 = 0; k2 < b.length; k2++) {
            a[k2]=b[k2];
        }
    }

    static void MergeSortfun(int a[], int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            MergeSortfun(a, lb, mid);
            MergeSortfun(a, mid + 1, ub);
            Merge(a, lb, mid, ub);
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
        MergeSortfun(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
