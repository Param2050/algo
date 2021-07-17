package arrays;

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        int result = new ThreeSumClosest().threeSumClosest(arr, target);
        System.out.println(result);
    }


    public int threeSumClosest(int[] arr, int target) {

        Arrays.sort(arr);
        int n = arr.length;
        int k=n-1;
        int ans = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            int j = i+1;

            while(j < k) {

                int curr = arr[i] + arr[j] + arr[k];
                if(curr == target)
                    return curr;

                if(curr < target)
                    j++;
                else
                    k--;

                if(Math.abs(target-curr) < Math.abs(target-ans) ||
                    ans == Integer.MIN_VALUE) {
                    ans = curr;
                }
            }
        }

        return ans;
    }

}
