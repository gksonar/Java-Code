package Striver;

public class Palindrome {
    public static boolean isPalindrome(int a) {
        int org = a , sum=0 , rem =0;
        while (a>0) {
            rem = a %10;
            sum =sum * 10 +rem;
            a = a / 10 ; 
        }
        return (org==sum)?true:false;
    }

    public static void main(String[] args) {
        int a = 121;
        System.out.println((isPalindrome(a) ? "Palindrome" : "Not"));
    }
}
