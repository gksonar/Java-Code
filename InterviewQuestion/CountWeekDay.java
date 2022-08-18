package InterviewQuestion;

public class CountWeekDay {
    public static void main(String[] args) {
        int a[] = { 1, -1, 0, 3, 4, 5, 6, 7, 4, -5, 1 };
        for (int i = 0; i < a.length - 2; i++) {
            if ((a[i] + a[i + 1] + a[i + 2]) == 0) {
                System.out.println(a[i] + " " + a[i + 1] + " " + a[i + 2]);
            }
        }
    }
}
