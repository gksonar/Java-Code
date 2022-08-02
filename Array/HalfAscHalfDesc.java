//start 18:15
package Array;

public class HalfAscHalfDesc {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 4, 1, 3, 9, 8 };
        int k = 4;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < k; j++) {
                if (arr[i] >= arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            for (int l = k; l < arr.length - 1; l++) {
                // System.out.println("Array: " + arr[i]);
                if (arr[l] <= arr[l + 1]) {
                    int temp = arr[l];
                    arr[l] = arr[l + 1];
                    arr[l + 1] = temp;

                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}