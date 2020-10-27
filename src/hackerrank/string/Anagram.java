package hackerrank.string;


import java.util.Arrays;

// Not completed*********************************************
public class Anagram {

    public static void main(String args[]) {
        String str = "fdhlvosfpafhalll";
        System.out.println(anagram(str));
    }

    static int anagram(String s) {
        int len = s.length();

        if(len%2 == 1) {
            return -1;
        }

        int mid = len/2;
        int count=0;
        String s1 = s.substring(0, mid);
        String s2 = s.substring(mid, len);
        char[] s1Chars = s1.toCharArray();
        for (char c : s1Chars){
            int index = s2.indexOf(c);
            if (index == -1){
                count++;
            } else {
                s2 = s2.substring(0,index)+s2.substring(index+1);
            }
        }
        return count;
    }


}
