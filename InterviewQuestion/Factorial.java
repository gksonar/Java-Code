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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int fact = factorial(no);
        System.out.println(fact);
        sc.close();
    }
}
