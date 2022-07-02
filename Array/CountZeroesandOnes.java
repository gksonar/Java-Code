package Array;

public class CountZeroesandOnes {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 1, 1, 1, 0 };
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        System.out.println("count of ones: " + sum);
        System.out.println("count of zeros: " + (arr.length - sum));
    }

}
