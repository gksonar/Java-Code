package InterviewQuestion;

public class ReverseNumber {
    public static int ReverseNum(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 1221;
        int rev = ReverseNum(num);
        System.out.println(rev);
        if (num == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }
    }
}
