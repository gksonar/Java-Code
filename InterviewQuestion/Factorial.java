package InterviewQuestion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return (number * factorial(number - 1));
        }

    }

    public static int factorial1(int number) {
        if (number == 0) {
            return 1;
        } else {
            int fact = 1;
            for (int i = 1; i <= number; i++) {
                fact = fact * i;

            }
            return fact;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int fact = factorial(no);
        System.out.println(fact);
        int fact1 = factorial(no);
        System.out.println(fact1);

        sc.close();
    }
}
