package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class MaxNoOfVowelsInSubstringOfGivenLength {

    public static void main(String args[]) {
        String str = "tryhard";
        System.out.println("Min : " + maxVowels(str, 4));
    }

    public static int maxVowels(String str, int k) {
        int i=0;
        int j=0;
        String vowels = "aeiou";
        int maxCount = Integer.MIN_VALUE;
        List<String> list = new ArrayList<>();
        while(j<str.length()) {
            String ch = String.valueOf(str.charAt(j));
            if(vowels.contains(ch)) {
                list.add(ch);
            }

            if(j-i+1 == k) {
               maxCount = Math.max(maxCount, list.size());
               if(!list.isEmpty()) {
                   list.remove(String.valueOf((str.charAt(i))));
               }
               i++;
            }
            j++;

        }

        return maxCount != Integer.MIN_VALUE ? maxCount : 0;
    }

}
