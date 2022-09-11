package Striver;

public class KitePattern {
    public static void main(String[] args) {
        int no = 5;
        pattern(no);

        // kitep(no);
    }

    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void kitep(int no) {
        for (int i = 1; i <= no; i++) {
            for (int j = 0; j < no - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = no - 1; i > 0; i--) {
            for (int j = 0; j < no - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= no / 2; i++) {
            for (int j = 0; j < no - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
