package LoopPatterns;

public class Patterns {
    public static void main(String[] args) {

        pattern1(5);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
    }

    public static void pattern1(int n) {
        System.out.println("Pattern 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        System.out.println("Pattern 2");

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern3(int n) {
        System.out.println("Pattern 3");

        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern4(int n) {
        System.out.println("Pattern 4");

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    public static void pattern5(int n) {
        System.out.println("Pattern 5");

        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern6(int n) {
        System.out.println("Pattern 6");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // for (int row = n - 1; row >= 1; row--) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

    }

    public static void pattern7(int n) {
        System.out.println("Pattern 7");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        System.out.println("Pattern 8");
        for (int row = n; row >= 1; row--) {

            for (int col = n - row; col >= 1; col--) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        System.out.println("Pattern 9");
        for (int row = 1; row <= 5; row++) {

            for (int col = 1; col <= (row - n); col++) {
                System.out.print(" ");
            }
            for (int col = (row - n); col <= (row * 2) - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {

        System.out.println("Pattern 10");
        for (int row = 0; row < n; row++) {
            int k;
            for (k = n - row; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int col = k; col < (row * 2) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int row = 5; row >= 0; row--) {
            int k;
            for (k = n - row; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int col = k; col < (row * 2) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}