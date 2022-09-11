package Striver.Recursion;

public class sumOfNumbers {
    public static int recursive(int no) {
        if(no==0){
            return 0;
        }
        return no + recursive(no-1);
    }
    public static void main(String[] args) {
        int no = 5;
        System.out.println(recursive(no));
    }
}
