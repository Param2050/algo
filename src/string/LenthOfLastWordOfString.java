package string;

public class LenthOfLastWordOfString {

    public static void main(String args[]) {
        String str = "Hello world";
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String str) {

        String s = str.trim();
        int count = 0;
        for(int i=s.length()-1; i>=0 ; i--) {

            if(s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

}
