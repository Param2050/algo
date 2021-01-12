package leetcode;

public class ValidPalindrome {
    public static void main(String args[]) {
     String str = "race a car";
     if(new ValidPalindrome().isPalindrome(str)) {
         System.out.println("Yes");
     }else {
         System.out.println("No");
     }
    }

    public boolean isPalindrome(String s) {
        String str = s.replaceAll("\\s", "").replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int j = str.length()-1;
        String newString = str.toLowerCase();
        while (i<j) {
            if(newString.charAt(i) != newString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
