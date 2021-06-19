package string;

public class CheckPalindrome {

    public static void main(String args[]) {
        String str = "A man, a; plan, a canal: Panama;";
        int res = new CheckPalindrome().isPalindrome(str);
        System.out.println("Output is  : " + res);
    }

    public int isPalindrome(String string) {

        String newString = string.replaceAll("[,:;\\s]", "");
        int i=0;
        int j = newString.length()-1;

        while(i < j) {
            if(Character.toLowerCase(newString.charAt(i)) != Character.toLowerCase(newString.charAt(j))) {
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
