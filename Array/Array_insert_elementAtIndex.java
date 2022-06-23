package Array;

import java.util.*;

public class Array_insert_elementAtIndex {
    public static void insertAtposition(int arr[], int index, int value) {

        for (int i = arr.length - 1; i < index - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value; 
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));
        insertAtposition(arr, 3, 88);
        System.out.println(Arrays.toString(arr));
    }
}
