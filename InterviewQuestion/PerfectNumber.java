package InterviewQuestion;

public class PerfectNumber {
    public static void main(String[] args) {
        int a = 496, sum = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }

        }
        System.out.println(sum);
        if (a == sum) {
            System.out.println("pn");
        } else {
            System.out.println("npn");
        }
    }
}
