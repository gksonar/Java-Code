package Array;

public class SmallestandSecondSmallest {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 9, 8, 10, 12 };
        for (int i = 0; i < arr.length - 1; i++) {
            // min_index = i;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Smallest: " + arr[0]);
        System.out.println("Second Smallest: " + arr[1]);
    }
}
