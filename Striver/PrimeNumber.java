package Striver;

public class PrimeNumber {
    public static boolean isPrime(int no) {
        boolean flag = true;
        if (no == 0 || no == 1) {
            return false;
        }
        if (no == 2)
            return true;
        for (int i = 3; i <= no / 2; i++) {
            if (no % i == 0) {
                flag = false;
                break;
            }
            flag = true;
        }

        return flag;
    }

    public static void main(String[] args) {
        int s = 0, e = 50;
        for (int i = s; i < e; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            } else
                continue;
        }
    }
}
