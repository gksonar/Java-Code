package Sorting;

public class Merged_sort {

    public static void divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    public static void conquer(int arr[], int start, int mid, int end) {
        int merged[] = new int[end - start + 1];

        int id1 = start;
        int id2 = mid + 1;
        int x = 0;

        while (id1 <= mid && id2 <= end) {
            if (arr[id1] <= arr[id2]) {
                merged[x] = arr[id1];
                x++;
                id1++;
            } else {
                merged[x] = arr[id2];
                x++;
                id2++;
            }
        }

        while (id1 <= mid) {
            merged[x] = arr[id1];
            x++;
            id1++;
        }

        while (id2 <= end) {
            merged[x] = arr[id2];
            x++;
            id2++;
        }
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 8, 5, 11, 7, 4 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
