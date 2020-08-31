package hackerrank.string;


import java.util.*;

// Not completed*********************************************
public class WeightedUniformString {

    public static void main(String args[]) {
        String str = "aaabbbbcccddd";
        int q[] = new int[] {9, 7, 8, 12, 5};
        String res[] = weightedUniformStrings(str, q);
        for(int i=0; i<res.length; i++) {
            System.out.println(res[i]);
        }
    }

    static String[] weightedUniformStrings(String s, int[] queries) {
        String result [] = new String[queries.length];

        Set<Integer> totalCount = new HashSet<>();
        int currentWeight = 0;
        char prevLetter = ' ';
        for(char currLetter : s.toCharArray()) {

            if(currLetter != prevLetter) {
                currentWeight = currLetter - 'a' + 1;
            } else {
                currentWeight += currLetter - 'a' + 1;
            }

            prevLetter = currLetter;
            totalCount.add(currentWeight);
        }

        for(int i=0; i<queries.length; i++) {
            int q = queries[i];
            if(totalCount.contains(q)) {
                result[i] = "Yes";
            }else {
                result[i] = "No";
            }
        }

        return result;
    }


}



/**
 String result [] = new String[queries.length];
 String allChars = "abcdefhgijklmnopqrstuvwxyz";
 int mex_len = 26;
 int count[] = new int[mex_len];
 HashMap<Character, Integer> map = new HashMap<>();

 for(int i=0; i<s.length(); i++) {
 count[s.charAt(i) - 'a']++;
 }

 int charValue = 1;
 List<Integer> totalCount = new ArrayList<>();
 for(int i=0; i<allChars.length(); i++) {
 char ch = allChars.charAt(i);
 map.put(ch, charValue++);
 if(count[ch - 'a'] != 0) {
 int val = (count[ch - 'a'] * map.get(ch));
 totalCount.add(val);
 }
 }

 for(int i=0; i<queries.length; i++) {
 int q = queries[i];
 if(totalCount.contains(q)) {
 result[i] = "YES";
 }else {
 result[i] = "NO";
 }
 }
 return result;
 **/