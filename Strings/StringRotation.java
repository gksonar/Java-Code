package Strings;

public class StringRotation {
    public static String leftRotate(String s, int r) {
        String ans = s.substring(r) + s.substring(0, r);
        return ans;
    }

    public static String rotate(String s, String s1) {
        boolean flag= false;
        for (int i = 1; i <= s.length(); i++) {
            String ans = leftRotate(s, i);    
            if (ans.equals(s1)) {
                flag=true;
                break;
            }
            flag=false;
        }
        return (flag==true)? "True":"false";
    }

    public static void main(String[] args) {
        String str = "Gaurav";
        String str1 = "uravGa";
        // System.out.println(str.substring(2));
        System.out.println(rotate(str,str1));
    }
}
