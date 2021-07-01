package slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsOfString {

    public static void main(String args[]) {
        List<Integer> result = findAnagrams("cbaebabacd", "abc");
        System.out.println(result);
    }

    public static List<Integer> findAnagrams(String str, String patt) {
        int len = patt.length();
        List<Integer> result = new ArrayList<>();
        if(len > str.length())
            return result;

        int base[] = new int[26];
        int curr[] = new int[26];

        for(int i=0; i<len; i++) {
            base[patt.charAt(i) - 'a']++;
            curr[str.charAt(i) - 'a']++;
        }

        if(Arrays.equals(base, curr))
            result.add(0);

        for(int i=len; i<str.length(); i++) {
            int prev = i-len;
           curr[str.charAt(prev) - 'a']--; // remove previous
           curr[str.charAt(i) - 'a']++;

           if(Arrays.equals(base, curr))
               result.add(prev+1);
        }
        return result;
    }

}
