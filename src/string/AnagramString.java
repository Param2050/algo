package string;


import java.util.Arrays;

public class AnagramString {

    static int NO_OF_CHARS = 26;

    public static void main(String args[]) {
        char str1[] = ("vishalx").toCharArray();
        char str2[] = ("shalvi").toCharArray();

        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + "anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }

    private static boolean areAnagram(char str1[], char str2[]) {

        if(str1.length != str2.length)
            return false;

        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);

        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);

        for(int i=0; i<str1.length; i++) {
            count1[str1[i] - 'a']++;
            count2[str2[i] - 'a']++;
        }

        for(int i=0; i<NO_OF_CHARS; i++) {
            if(count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }

}
