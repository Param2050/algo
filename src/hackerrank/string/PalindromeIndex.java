package hackerrank.string;


// Not completed*********************************************
public class PalindromeIndex {

    public static void main(String args[]) {
        String str = "baa";
        System.out.println(palindromeIndex(str));
    }

    static int palindromeIndex(String s) {
        int len = s.length();
        int i,j,a,b;
        for(i=0, j=len-1; i<len; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                break;
            }
        }
        if(i>j) {
            return -1;
        }

        for(a=i+1, b=j; a<j && b> i+1; a++, b--) {
            if(s.charAt(a) != s.charAt(b)) {
                return j;
            }
        }
        return i;
    }
}
