package Striver;

import java.util.*;

public class InputOuput {
    public static void main(String[] args) {
        int a[] = { 5, 5, 4, 3, 3, 2, 7, 8, 0 };
        List<Integer> l = new ArrayList<>();
   
        System.out.println(l);
        int mid = l.size() / 2;

        Arrays.sort(a, 0, mid);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

        // String[] countries = { "Zimbabwe", "South-Africa", "India", "America",
        // "Yugoslavia", " Australia", "Denmark",
        // "France", "Netherlands", "Italy", "Germany" };
        // // sorts array in descending order
        // Arrays.sort(countries, Collections.reverseOrder());
        // // prints the sorted string array in descending order
        // System.out.println(Arrays.toString(countries));
    }
}
