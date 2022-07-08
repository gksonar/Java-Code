package InterviewQuestion;

public class BitwiseOperator {
    public static void main(String[] args) {
        int num = 5; // 0101
        int pos = 2;
        int bitmask = 1 << pos;
        if ((bitmask & num) == 0) {
            System.out.println("Position Holds '0'");
        } else {
            System.out.println("Position holds '1'");
        }

        int res = ~(num | (pos));
        System.out.println(res);

    }
}
