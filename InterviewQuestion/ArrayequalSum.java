package InterviewQuestion;

public class ArrayequalSum {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 46, 1, 3, 7 };
        int sum = 47;
        for (int i = 0; i < arr.length; i++) {          
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
