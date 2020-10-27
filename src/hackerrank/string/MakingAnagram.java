package hackerrank.string;


import java.util.Arrays;

// Not completed*********************************************
public class MakingAnagram {

    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "amnop";
        System.out.println(makingAnagrams(str1, str2));
    }

    static int makingAnagrams(String s1, String s2) {

        int max_len = 26;
        int c1[]=new int[max_len];
        int c2[]=new int[max_len];
        int minCount = 0;

        for(int i=0; i<s1.length(); i++) {
            c1[s1.charAt(i) - 'a']++;
        }

        for(int i=0; i<s2.length(); i++) {
            c2[s2.charAt(i) - 'a']++;
        }

        for(int i=0; i<max_len; i++) {
            if(c1[i] != c2[i]) {
                minCount = minCount + Math.abs((c1[i] - c2[i]));
            }
        }

        return minCount;

    }

}
