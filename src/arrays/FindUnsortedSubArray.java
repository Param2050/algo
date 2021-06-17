package arrays;

import java.util.Arrays;

public class FindUnsortedSubArray {

    public static void main(String args[]) {

        int arr [] = {2,6,4,8,10,9,15};
        System.out.println("Unsorted subarray : " + findUnsortedSubarray(arr));

    }


    private static int findUnsortedSubarray(int[] arr) {

        int newArr [] = arr.clone();
        Arrays.sort(newArr);

        int start = arr.length;
        int end = 0;


        for(int i=0; i<arr.length; i++) {

            if(newArr[i] != arr[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }

        return (end-start >= 0 ? end-start+1 : 0);

    }
}
