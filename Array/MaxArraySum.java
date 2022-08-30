package Array;

public class MaxArraySum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int min = 0, curr_sum = 0;
        int k = 4;
        for (int i = 0; i < k; i++)
            min += arr[i];

        curr_sum = min;
        for (int j = k; j < arr.length; j++) {
            curr_sum += arr[j] - arr[j - k];
            min = Math.min(min, curr_sum);
        }

        System.out.println(min);

    }

}