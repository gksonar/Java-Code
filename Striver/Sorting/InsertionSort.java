package Striver.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = { 10, 5, 6, 7, 8, 9 };

        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
