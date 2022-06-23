package Sorting;

public class InsertionSort {

    static void Insertionsort(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int key;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 8, 5, 11, 7, 4 };

        Insertionsort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
