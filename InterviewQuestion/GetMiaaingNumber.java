package InterviewQuestion;

public class GetMiaaingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

        int n = arr.length;

        int total = (n + 1) * (n + 2) / 2;

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.println(total - sum);
    }
}
