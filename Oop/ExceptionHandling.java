package Oop;

public class ExceptionHandling {
    public static void main(String[] args) {
        int ans = 0;
        int a = 10, b = 0;
        try {
            ans = divide(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (ans == 0) {
                System.out.println("Im always Executing..");
            } else
                System.out.println(ans);

        }
    }

    static int divide(int a, int b) throws ArithmeticException { // throws keyword use
        if (b == 0)
            throw new ArithmeticException("Do not enter a Zero Value"); // throw keyword use
        return a + b;
    }
}
