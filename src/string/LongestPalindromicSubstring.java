package string;

public class LongestPalindromicSubstring {

    int resultStart;
    int resultLength;

    public static void main(String args[]) {
        String str = "kgnitin";
        String result = new LongestPalindromicSubstring().longestPalindromicSubstring(str);
        System.out.println("Result {} " + result);
    }

    private String longestPalindromicSubstring(String str) {
        int strLen = str.length();

        if(strLen < 2)
            return str;

        for(int start=0; start<strLen-1; start++) {
            expandRange(str, start, start);
            expandRange(str, start, start+1);
        }

        return str.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String str, int begin, int end) {

        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }

        if(resultLength < (end-begin-1)) {
            resultStart = begin+1;
            resultLength = end-begin-1;
        }

    }
}
