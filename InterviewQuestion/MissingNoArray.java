package InterviewQuestion;

public class MissingNoArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int sum = 0;
        int total = arr.length  * (arr.length + 1) / 2;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(total - sum);
    }

}
