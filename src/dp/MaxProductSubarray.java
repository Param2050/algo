package dp;

public class MaxProductSubarray {

    public static void main(String args[]) {
        int arr[] = {-2, -40, 0, -2, -3};
        System.out.println(new MaxProductSubarray().maxProductSubarray(arr));
    }

    public static int maxProductSubarray(int[] arr) {

        int n=arr.length;
        int currMaxSorFar = arr[0];
        int currMax = arr[0];
        int currMin = arr[0];

        for(int i=1; i<n; i++) {

            if(arr[i] < 0) {
                int temp = currMin;
                currMin = currMax;
                currMax = temp;
            }
            currMin = Math.min(arr[i], currMin*arr[i]);
            currMax = Math.max(arr[i], currMax*arr[i]);
            currMaxSorFar = Math.max(currMaxSorFar, currMax);
        }

        return currMaxSorFar;
    }

}
