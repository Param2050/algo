package string;


import java.util.Arrays;

public class AnagramString {

    static int NO_OF_CHARS = 26;

    public static void main(String args[]) {
        String str1 = "vishalx";
        String str2 = "shalxiv";

        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + "anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }

    private static boolean areAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        int len = 26;
        int arr[] = new int[len];

        for(int i=0; i<s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int c : arr) {
            if(c != 0)
                return false;
        }

        return true;
    }

}
