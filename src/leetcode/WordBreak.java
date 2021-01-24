package leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

    public static void main(String args[]) {
        String s = "catsandog";
        List<String> wordDict = new ArrayList<String>(){{
            add("cats");
            add("dog");
            add("sand");
            add("and");
            add("cat");
        }};
        boolean flag = new WordBreak().wordBreak(s, wordDict);
        System.out.println("Result " + flag);
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        for (String word : wordDict) {
            s = s.replace(word, "");
        }

        return s.isEmpty();
    }
}
