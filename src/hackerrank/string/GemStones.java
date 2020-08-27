package hackerrank.string;


import java.util.Arrays;
import java.util.LinkedHashSet;

// Not completed*********************************************
public class GemStones {


    public static void main(String args[]) {
        String str[] = new String[] {"abcdde", "baccd", "eeabg"};
        System.out.println(gemstones(str));
    }

    static int gemstones(String[] strArray) {
        int n = strArray.length;
        int MAX_LEN = 123;
        int count[] = new int[MAX_LEN];

        int gemStonesCount = 0;


        for(int i=0; i<n; i++) {
            String rawsStr = strArray[i];
            String str = removeDuplicates(rawsStr);
            for(int j=0; j<str.length(); j++) {
                count[str.charAt(j)]++;
            }
        }

        for(int i = 97; i<MAX_LEN; i++) {
            if(count[i] == n) {
                gemStonesCount++;
            }
        }


        return gemStonesCount;
    }

    static String removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));

        // print string after deleting duplicate elements
        StringBuilder builder = new StringBuilder();
        for(Character ch : lhs) {
            builder.append(ch);
        }
        return builder.toString();
    }

}
