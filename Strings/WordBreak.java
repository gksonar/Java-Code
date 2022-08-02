package Strings;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean flag = false;
        int nextIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (wordDict.contains(s.substring(nextIdx, i + 1))) {
                flag = true;
                nextIdx = i + 1;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("aaa");
        System.out.println(wordBreak("aaaaaaa", list));
    }

}
