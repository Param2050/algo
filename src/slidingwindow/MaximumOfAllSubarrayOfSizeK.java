package slidingwindow;

import java.util.*;

public class MaximumOfAllSubarrayOfSizeK {
    public static void main(String args[]) {
        int arr [] = {1,3,-1,-3,5,3,6,7};
        int result[] = maximumOfAllSubarrayOfSizeK(arr, 3);
        Arrays.stream(result).forEach((i)-> System.out.print(i));
    }

    private static int[] maximumOfAllSubarrayOfSizeK(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> nums[i2]-nums[i1]);
        int n= nums.length;
        int[] result = new int[n-k+1];
        int res = 0;
        for(int i=0; i<nums.length; i++) {

            while(!pq.isEmpty() && pq.peek()<i-k+1) {
                pq.remove();
            }

            pq.add(i);

            if(i-k+1>=0) {
                result[res++] = nums[pq.peek()];
            }
        }
        return result;
    }


}
