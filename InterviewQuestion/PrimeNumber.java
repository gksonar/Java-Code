package InterviewQuestion;

public class PrimeNumber {
    public static boolean isPrime(int no) {
        int m = no / 2;
        if (no == 1 || no == 2) {
            return true;
        } else {
            for (int i = 2; i <= m; i++) {
                if (no % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public static void isRangePrime(int no) {

        // boolean a = true;
        for (int i = 2; i <= no; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }

    }

    public static void main(String[] args) {
        int a = 97;
        System.out.println(isPrime(a));

        // int a = 2;
        isRangePrime(15);
    }
}
