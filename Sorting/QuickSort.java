package Sorting;

import java.util.Arrays;

public class QuickSort {

    static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);
        for (int j = start; j < end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return (i + 1);
    }

    static void Quick(int arr[], int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            Quick(arr, start, p - 1);
            Quick(arr, p + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 8, 7, 9, 12, 15, 4 };
        Quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

}
