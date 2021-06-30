package slidingwindow;

public class MaxSumSubrraySizeOfSizeK {

    public static void main(String args[]) {
        int arr [] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        System.out.println(maxSumSubarrayOfSizeK(arr, 4));
    }

    private static int maxSumSubarrayOfSizeK(int[] arr, int k) {
        int i=0;
        int j=0;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int n = arr.length;
        while(j<n) {
            currSum = currSum + arr[j];
            if((j-i+1) == k) {
                maxSum = Math.max(currSum, maxSum);
                currSum = currSum - arr[i];
                i++;
            }
            j++;
        }
        return maxSum;
    }

}
