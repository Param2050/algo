package hackerrank.implementation;

public class RepeatedString {

    public static void main(String args[]) {
        int n = 10;
        String s = "abc";
        System.out.print(repeatedString(s, n));
    }

    static long repeatedString(String s, long n) {
        long q = n/s.length();
        long r = n%s.length();
        long partialStrLen = (r == 0) ? 0 : r;
        return q * getCharALengthCount(s, s.length()) + getCharALengthCount(s, partialStrLen);
    }

    static int getCharALengthCount(String s, long len) {
        int count = 0;
        for(int i=0; i<len; i++) {
            if(s.charAt(i) == 'a'){
                ++count;
            }
        }
        return count;
    }
}
