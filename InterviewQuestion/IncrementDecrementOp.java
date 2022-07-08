package InterviewQuestion;

public class IncrementDecrementOp {
    public static void main(String[] args) {
        int a = 10, d = 20;
        int c, b;
        b = ++a; // Increment the Value and then use the values
        c = d++; // use the value and then increment the value
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(b & c);

    }
}
