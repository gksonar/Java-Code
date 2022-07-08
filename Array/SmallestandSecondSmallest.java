package Array;

public class SmallestandSecondSmallest {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 9, 8, 10, 12 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        int a = arr.length;
        System.out.println("Smallest: " + arr[a - 1]);
        System.out.println("Second Smallest: " + arr[arr.length - 2]);
    }
}
