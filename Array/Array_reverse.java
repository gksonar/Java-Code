package Array;

import java.util.*;

public class Array_reverse {

    static void reverse(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int arr[], int rotate_number) {
        reverse(arr, 0, arr.length - rotate_number - 1);
        reverse(arr, arr.length - rotate_number, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

    }

    public static void insertAtposition(int arr[], int index, int value) {

        for (int i = arr.length - 1; i < index - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }

    public static void Sort(int arr[]) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int arr[] = { 86, 77, 15, 93, 35, 86, 92, 49, 21, 62, 27, 90, 59, 63, 26, 40, 26, 72, 36, 11, 68, 67, 29, 82,
                30, 62, 23, 67, 35, 29, 2, 22, 58, 69, 67, 93, 56, 11, 42, 29, 73, 21, 19, 84, 37, 98, 24, 15, 70, 13,
                26, 91, 80, 56, 73, 62, 70, 96, 81, 5, 25, 84, 27, 36, 5, 46, 29, 13, 57, 24, 95, 82, 45, 14, 67, 34,
                64, 43, 50, 87, 8, 76, 78, 88 };
        // Sort(arr);
        reverse(arr, 0, arr.length - 1);
        // rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
        // insertAtposition(arr, 3, 88);
        // System.out.println(Arrays.toString(arr));
    }
}
