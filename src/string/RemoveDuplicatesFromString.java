package string;

import java.util.Arrays;

public class RemoveDuplicatesFromString {

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        String res = removeDuplicatesFromString(str);
        System.out.println(res);
    }

    static String removeDuplicatesFromString(String string) {

        String newString = new String();
        for(int i=0; i<string.length(); i++) {

            char ch = string.charAt(i);

            if(newString.indexOf(ch) < 0) {
                newString = newString + ch;
            }
        }

        return newString;
    }

}
