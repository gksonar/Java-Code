package InterviewQuestion;

public class CheckAlphabate {
    public static void isAlphaDigitSymbol(char c) {
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
            System.out.println("Alphabates");
        else if (c >= 48 && c <= 57)
            System.out.println("Digit");
        else
            System.out.println("Symbol");
    }

    public static void main(String[] args) {
        char c = 'a';
        isAlphaDigitSymbol(c);

    }
}
