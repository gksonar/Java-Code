package Strings;

public class BasicString {
    public static void main(String[] args) {
        String a = "Gaurav";
        String b = "Gaurav";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String str1 = new String("Gaurav");
        String str2 = new String("Gaurav");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        // Casting

        System.out.println('a' + 'b'); // addition of ASCII Value
        System.out.println("a" + "b"); // Concatinate
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3)); // converting ascii into character
        System.out.println("a" + 3);
    }

}
