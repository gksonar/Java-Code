package Array;

public class MaxArraySum {
    public static void main(String[] args) {
        int arr[] = { 10, 11, 3, 4, 5, 6, 1, 2, 3 };
        int max = 0, curr_sum = 0;
        int k = 3;
        for (int i = 0; i < k; i++)
            max += arr[i];

        curr_sum = max;
        for (int j = k; j < arr.length; j++) {
            curr_sum += arr[j] - arr[j - k];
            max = Math.max(max, curr_sum);
        }

        System.out.println(max);

    }
}