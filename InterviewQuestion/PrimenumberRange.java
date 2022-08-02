package InterviewQuestion;

public class PrimenumberRange {
    static boolean isPrime(int num) {
        if (num == 1 || num == 2) {
            return false;

        } else {
            for (int i = 2; i <= Math.pow(num, 0.5); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;

        }

    }

    public static void main(String[] args) {
        int n = 7;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);

            }

        }
    }

}
