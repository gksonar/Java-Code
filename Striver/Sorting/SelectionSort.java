package Striver.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = { 13, 46, 24, 52 };
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
