package leetcode;

import java.util.Arrays;

public class KthLargestElement {

    public static void main(String args[]) {
        int arr[] = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int kthElem = new KthLargestElement().findKthLargest(arr, k);
        System.out.println("Kth largest element is " + kthElem);
    }

    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        int kth = Integer.MIN_VALUE;
        for(int i = nums.length-1; i>=0; i--) {
            if(--k == 0) {
                kth = nums[i];
            }
        }
//        int first = Integer.MIN_VALUE;
//        int kth = Integer.MIN_VALUE;
//
//        for(int i=0; i<nums.length; i++) {
//            if(nums[i] > first) {
//                kth = first;
//                first = nums[i];
//            } else if(nums[i] > kth && nums[i] != first) {
//                kth = nums[i];
//            }
//        }

        return kth;
    }
}
