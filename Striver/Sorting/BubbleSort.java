package Striver.Sorting;

import java.util.*;

/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int a[] = { 13, 46, 24, 52 };
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}