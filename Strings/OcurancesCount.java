package Strings;

// import java.util.HashMap;
import java.util.LinkedHashMap;

public class OcurancesCount {

    public static String getChar(String str) {
        String res = "";
        LinkedHashMap<Character, Integer> chm = new LinkedHashMap<>();
        char ch[] = str.toCharArray();
        for (char c : ch) {
            if (chm.containsKey(c)) {
                chm.put(c, chm.get(c) + 1);
            } else
                chm.put(c, 1);
        }
        for (char i : chm.keySet()) {
            // System.out.print(i + "" + chm.get(i));
            res += i + "" + chm.get(i);
        }
        // System.out.println(chm.toString());
        return res;
    }

    public static void main(String[] args) {
        String str = "Gaurav";
        System.out.println(getChar(str));

    }
}
