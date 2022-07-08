package InterviewQuestion;

public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // System.out.println("Before Swapping:a:" + a + " b:" + b);
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("After Swapping: " + a + " " + b);

        // System.out.println("2nd\n Before Swapping:a:" + a + " b:" + b);
        // a = a + b;
        // b = a - b;
        // a = a - b;

        // System.out.println("After Swapping: " + a + " " + b);
        // System.out.println("3nd\n Before Swapping:a:" + a + " b:" + b);
        // a = a * b;
        // b = a / b;
        // a = a / b;
        // System.out.println("After Swapping: " + a + " " + b);

        // System.out.println("3nd\n Before Swapping:a:" + a + " b:" + b);
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        // System.out.println("After Swapping: " + a + " " + b);

        System.out.println("3nd\n Before Swapping:a:" + a + " b:" + b);
        b = a + b - (a = b); // a+b b = b-a
        System.out.println("After Swapping: " + a + " " + b);
    }
}
