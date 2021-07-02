package slidingwindow;

public class MinimumSizeSubarraySum {

    public static void main(String args[]) {
        int arr [] = {2,3,1,2,4,3};
        System.out.println("Min : " + minSubArrayLen(7, arr));
    }

    public static int minSubArrayLen(int target, int[] arr) {

        int i=0;
        int j=0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while(j < arr.length) {
            sum += arr[j];
            if (sum >= target) {
                while (sum >= target && i <= j) {
                    min=Math.min(min,j-i+1);
                    sum -= arr[i];
                    i++;
                }
            }
            j++;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
