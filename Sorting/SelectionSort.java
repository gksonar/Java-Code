package Sorting;

public class SelectionSort {

    public static void Selctionsort(int arr[]) {
        int n = arr.length;
        int min_index;
        for (int i = 0; i < n; i++) {
            min_index = i;
            System.out.println(i + "th:i" + i);
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                    System.out.println(min_index);
                }

            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 8, 5, 11, 7, 4 };

        Selctionsort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
