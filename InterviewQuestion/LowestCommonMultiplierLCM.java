package InterviewQuestion;

import java.util.Scanner;

public class LowestCommonMultiplierLCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int g = 0;
        for (int i = 1; i <= a; i++) {

            if (a % i == 0 && b % i == 0) {
                g = i;
            }
        }
        int lcm = a * b / g;
        System.out.println("Lowest Common Multiplier: " + lcm);
        System.out.println("Greatest Common Divisor: " + g);
        s.close();
    }
}
