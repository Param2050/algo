package hackerrank.string;


import java.util.Arrays;

// Not completed*********************************************
public class Anagram {

    public static void main(String args[]) {
        String str = "xaxbbbxx";
        System.out.println(anagram(str));
    }

    static int anagram(String s) {
        int len = s.length();
        if(len%2 != 0) {
            return -1;
        }
        int MAX_LEN = 26;
        int mid = len/2;
        String str1 = sort(s.substring(0, mid));
        String str2 = sort(s.substring(mid, len));
        int diff = 0;
        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i))
                diff++;
        }
        return diff;
    }

    private static String sort(String s) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

}
