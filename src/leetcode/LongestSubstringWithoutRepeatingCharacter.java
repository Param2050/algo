package leetcode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {

    public static void main(String args[]) {
        String str = "abcabcbb";
        System.out.println("Result : " + new LongestSubstringWithoutRepeatingCharacter()
        .lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hashSet = new HashSet<>();
        int i=0;
        int j=0;
        int max = 0;

        while (j < s.length()) {
            if(!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j));
                max = Math.max(hashSet.size(), max);
                j++;
            }else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}
