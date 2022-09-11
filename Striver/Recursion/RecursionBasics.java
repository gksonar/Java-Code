package Striver.Recursion;

public class RecursionBasics {
    public static void function(int no) {
        if (no < 10) {
            System.out.println(no);
            function(++no);
        }
    }

    public static void main(String[] args) {
        function(1);
    }
}
