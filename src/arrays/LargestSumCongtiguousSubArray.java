package arrays;

public class LargestSumCongtiguousSubArray {
    public static void main(String args[]) {
        int arr[]= {-2, -3, 4, -1, -2, 1, 5, -3};
        new LargestSumCongtiguousSubArray().findSubArray(arr);
    }


//    -2, -3, 4, -1, -2, 1, 5, -3
    private void findSubArray(int nums[]) {
        int currSum = nums[0];
        int maxSum = currSum;

        for(int i=1; i<nums.length; i++) {
            currSum = Math.max(nums[i], nums[i] + currSum);
            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("Largest Sum Contiguous SubArray is " + maxSum);

    }

}
