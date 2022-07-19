package InterviewQuestion;

import java.util.LinkedHashMap;

public class NoOfOccurancesDigit {
    public static void main(String[] args) {
        int ar[] = { 1, 1, 2, 2, 2, 3, 3, 3, 3 };
        LinkedHashMap<Integer, Integer> l = new LinkedHashMap<>();
        for (int i = 0; i < ar.length - 1; i++) {
            if (!l.containsKey(ar[i])) {
                l.put(ar[i], 1);
            } else {
                l.put(ar[i], l.get(ar[i]) + 1);
            }
        }

        for (int i : l.keySet()) {
            System.out.print(i + "" + l.get(i));

        }
    }

    // public static void main(String args[]) {
    // int a[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };

    // for (int i = 0; i < a.length; i++) {
    // a[a[i] % a.length] = a[a[i] % a.length] + a.length;
    // }
    // System.out.println("The repeating elements are : ");
    // for (int i = 0; i < a.length; i++) {
    // if (a[i] >= a.length * 2) {
    // System.out.println(i + " ");
    // }
    // }
    // }
}