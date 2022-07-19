package InterviewQuestion;

public class Pattern {

    public static void pattern() {
        int count = 3;
        for (int row = 1; row <= 4; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print(count);
            }
            System.out.println();
            count++;
        }
        int count1 = count - 1;
        for (int row = 4; row >= 0; row--) {
            for (int i = 1; i <= row; i++) {
                System.out.print(count1);
            }

            System.out.println();
            count1--;
        }

    }

    public static void pattern1() {
        int count = 3;
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(count);
            }
            System.out.println();
            count++;
        }
        int count1 = count - 1;
        for (int row = n; row >= 1; row--) {
            for (int col = n - row; col >= 1; col--) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(count1);
            }
            System.out.println();
            count1--;
        }
    }

    public static void main(String[] args) {
        pattern();
        pattern1();
    }
}
