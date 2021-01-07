package leetcode;

import java.util.stream.Stream;

public class ReverseString {

    public static void main(String args[]) {
        String str = "hello";
        char result [] = new ReverseString().reverseString(str.toCharArray());
        System.out.println(result);
    }

    public char[] reverseString(char[] s) {
        int i=0;
        int j = s.length-1;

        while(i<j) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
        return s;
    }
}
