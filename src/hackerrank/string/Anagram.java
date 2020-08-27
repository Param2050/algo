package hackerrank.string;

import java.util.Arrays;


// Not completed*********************************************
public class Anagram {


    public static void main(String args[]) {
        String str = "ubu";
        System.out.println(anagram(str));
    }

    static int anagram(String s) {
        int len = s.length();

        if(len%2 != 0) {
            return -1;
        }

        int mid = len/2;
        String str1 = s.substring(0, mid);
        String str2 = s.substring(mid, len);
        int count = 0;
        return count;
    }

}
