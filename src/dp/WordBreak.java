package dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public static void main(String args[]) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(new WordBreak().wordBreak(s, wordDict));   
    }

    public boolean wordBreak(String str, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Boolean memo [] = new Boolean[str.length()];
        return solve(str, 0, set, memo);
    }

    private boolean solve(String str, int start, Set<String> wordDict, Boolean[] memo) {

        if(str.length() == start)
            return true;

        if(memo[start] != null)
            return memo[start];
        boolean isValid = false;
        for(int i=start; i<str.length(); i++) {
            if(wordDict.contains(str.substring(start, i+1))) {
                if(solve(str, i+1, wordDict, memo)) {
                    isValid = true;
                }
            }
        }

        memo[start] = isValid;
        return memo[start];
    }
}
