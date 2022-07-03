package InterviewQuestion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "MADAM5";
        String rev = "";
        String rev1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        for (int i = 0; i < str.length(); i++) {
            rev1 = str.charAt(i) + rev1;
        }
        System.out.println(rev1);

        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not");

    }
}