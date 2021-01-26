package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveConsecutiveDuplicatesFromString {

    public static void main(String args[]) {
        String str = "aaabccddd";
        removeConsecutiveDuplicatesFromString(str);

    }

    private static void removeConsecutiveDuplicatesFromString(String string) {
        char arr[] = string.toCharArray();
        int n = arr.length;


        int j=0;
        //aaabccddd
        for(int i=1; i<n; i++) {

            if(arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println(Arrays.copyOfRange(arr, 0, j+1));

    }

}
