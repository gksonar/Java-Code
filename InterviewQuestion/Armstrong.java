package InterviewQuestion;

public class Armstrong {

    public static void ArmstrongFun(int num) {
        int rev = 0;
        int rem = 0;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            rev = rev + (int) Math.pow(rem, 3);
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not");
        }
    }

    public static void main(String[] args) {
        int num = 153;

        ArmstrongFun(num);

    }
}
