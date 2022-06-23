package Searching;

public class BinarySearch {
    public static int Binarysearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return -1;
    }

    public static int RecursiveBinarysearch(int arr[], int key, int low, int high) {

        int mid = low + (high - low) / 2;
        if (low > high) {
            return -1;
        }

        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            high = mid - 1;
            return RecursiveBinarysearch(arr, key, low, high);
        } else {
            low = mid + 1;
            return RecursiveBinarysearch(arr, key, low, high);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        System.out.println(Binarysearch(arr, 50));
        System.out.println(RecursiveBinarysearch(arr, 50, 0, arr.length - 1));

    }
}
