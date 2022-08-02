package InterviewQuestion;

public class OddEvenBitMask {
    public static void main(String[] args) {
        int a = 15;
        int b = a & 1;
        b = 10;

        while (b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }
        System.out.println(a);

        if (b == 0) {
            System.out.println("even");
        } else {
            System.out.println("False");
        }
    }
}
