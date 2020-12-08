package string;

import java.util.Arrays;

public class RemoveDuplicatesFromString {

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        char arr [] = removeDuplicatesFromString(str);
        System.out.println(arr);
    }

    static char[] removeDuplicatesFromString(String string) {

        int NO_OF_CHARS = 26;
        int[] table = new int[NO_OF_CHARS];
        char[] chars = string.toCharArray();
        int endIndex = 0;
        for(int i = 0; i < chars.length; i++) {
            if(table[chars[i]-'a'] == 0) {
                table[chars[i] - 'a'] = -1;
                chars[endIndex++] = chars[i];
            }
        }
        return Arrays.copyOfRange(chars, 0, endIndex);

    }

}
