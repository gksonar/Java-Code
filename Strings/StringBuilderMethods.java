package Strings;

import java.util.Scanner;

public class StringBuilderMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        System.out.println(sb);

        sb.insert(0, "S");
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.setCharAt(3, 'G');
        System.out.println(sb);

        sb.replace(1, 2, "GGG");
        System.out.println(sb);

        sb.append(" Sonar");
        System.out.println(sb);

        System.out.println(sb.charAt(5));

        sc.close();

    }
}
