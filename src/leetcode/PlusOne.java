package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

    public static void main(String args[]) {
        int arr[] = new int[] {4,3,2,1};
//        int arr[] = new int[] {4,3,2,9};
        int result [] = new PlusOne().plusOne(arr);
        System.out.println(result);
    }

    public int[] plusOne(int[] digits) {

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int carry = 0;
        for(int i=digits.length-1; i>=0; i--) {

            sum = digits[i] + 1;


        }


        return null;
    }

}
