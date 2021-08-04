package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LargestNumberFormedFromAnArray {
    public static void main(String args[]) {
        int arr[] = {54, 546, 548, 60};
//        int arr[] = {10,2};
        String largestNumber = new LargestNumberFormedFromAnArray().getLargestNum(arr);
        System.out.println("Largest number : " + largestNumber);
    }

    private String getLargestNum(int[] arr) {
        int len = arr.length;
        if(len == 0)
            return "";

        String arrStr[] = new String[len];

        for(int i=0; i<len; i++)
            arrStr[i] = Integer.toString(arr[i]);

        Arrays.sort(arrStr, (a,b)-> (b+a).compareTo(a+b));

        if(arrStr[0].equals("0"))
            return "0";

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<len; i++) {
            stringBuilder.append(arrStr[i]);
        }
        return stringBuilder.toString();
    }

}
