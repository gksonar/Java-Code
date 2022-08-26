package InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static int isprime1(long n) {

        boolean flag = true;
        List<Integer> l = new ArrayList<>();

        // Check if number is less than
        // equal to 1
        if (n == 1)
            return 1;
        else if (n == 2)
            return 1;

        for (int i = 2; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                l.add(i);
                flag = false;
            }
        }
        return (flag == true) ? 1 : l.get(0);
    }

    public static void main(String[] args) {
        System.out.println(isprime1(4));
    }
}
