package Strings;

import java.util.HashMap;

public class Panagram {
    public static boolean isPanagram(String str) {
        str.toLowerCase();
        char a[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z' };
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hs.containsKey(str.charAt(i))) {
                continue;
            } else {
                hs.put(str.charAt(i), 1);
            }
        }
        int i = 0;
        for (HashMap.Entry<Character, Integer> entry : hs.entrySet()) {
            // System.out.println(entry.getKey());
            if (!(a[i++] == entry.getKey()))
                return false;
        }

        // for (int j = 0; j < arr.length; j++) {
        // System.out.println(arr[j]);
        // if (!(arr[j] >= 57 && arr[j] <= 91)) {
        // return false;
        // }
        // }
        return true;
        // System.out.println(hs);
        // return false;
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnoqrstuvwxyz";
        System.out.println(isPanagram(str));

    }
}
