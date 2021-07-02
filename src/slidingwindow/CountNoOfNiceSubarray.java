package slidingwindow;

import java.util.ArrayList;
import java.util.List;

// Not completed program need to understand the problem first

public class CountNoOfNiceSubarray {

    public static void main(String args[]) {
        int arr [] = {2,2,2,1,2,2,1,2,2,2};
        System.out.println("Min : " + minSubArrayLen(arr, 2));
    }

    public static int minSubArrayLen(int[] arr, int k) {
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();
        int oddCount = 0;
        while(j<arr.length) {
            if(arr[i] % 2 == 1)
                list.add(arr[i]);

            if(list.size() == k) {
                oddCount++;
                list.remove(i);
                i++;
            }
        j++;
        }
        return oddCount;
    }

}
