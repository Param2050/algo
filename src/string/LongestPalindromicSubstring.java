package string;

public class LongestPalindromicSubstring {


    public static void main(String args[]) {
        String str = "forgeeksskeegfor";
        String result = new LongestPalindromicSubstring().longestPalindromicSubstring(str);
        System.out.println("Result {} " + result);
    }

    private String longestPalindromicSubstring(String str) {
        if (str == null || str.length() < 1) return "";
        int len = str.length();
        int low,high;
        int maxLength = 1;
        int start = 0;

        for(int i=1; i<len; i++) {

            low = i-1;
            high = i;

            while (low >=0 && high < len && str.charAt(low) == str.charAt(high)) {
                if(high-low+1 > maxLength) {
                    start = low;
                    maxLength = high-low+1;
                }
                low--;
                high++;
            }

            low = i-1;
            high = i+1;

            while (low >=0 && high < len && str.charAt(low) == str.charAt(high)) {
                if(high-low+1 > maxLength) {
                    start = low;
                    maxLength = high-low+1;
                }
                low--;
                high++;
            }
        }
        return str.substring(start, start+maxLength);
    }
}
