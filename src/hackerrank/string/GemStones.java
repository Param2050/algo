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
        int MAX_LEN = 26;
        int count[] = new int[MAX_LEN];
        int temp[];
        int gemStonesCount = 0;


        for(int i=0; i<n; i++) {
            String str = strArray[i];
            temp = new int[MAX_LEN];
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                temp[ch-'a']++;
                if(temp[ch-'a'] == 1) {
                    count[ch-'a']++;
                }
            }
            temp=null;
        }

        for(int i = 0; i<MAX_LEN; i++) {
            if(count[i] == n) {
                gemStonesCount++;
            }
        }


        return gemStonesCount;
    }

}
