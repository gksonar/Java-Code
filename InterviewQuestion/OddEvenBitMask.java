package InterviewQuestion;

public class OddEvenBitMask {
    public static int substraction(int a, int b) {
        while (b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int res = substraction(a, b);
        System.out.println("Subbstarction of A and B without using minus operator: " + res);
        b = a & 1;
        if (b == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
