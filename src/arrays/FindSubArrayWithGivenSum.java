package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSubArrayWithGivenSum {
    public static void main(String args[]) {
        int arr[] = {-10, 0, 2, -2, -20, 10};
        int sum = 20;
        new FindSubArrayWithGivenSum().findSubArrayWithGivenSum(arr, sum);
    }

    private void findSubArrayWithGivenSum(int arr[], int sum) {
        int curr_sum = 0;
        int startIndex = 0;
        int endIndex = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length-1; i++) {
            curr_sum = curr_sum + arr[i];

            if(curr_sum - sum == 0) {
                startIndex = 0;
                endIndex = i;
                break;
            }

            if(map.containsKey(curr_sum-sum)) {
               startIndex = map.get(curr_sum-sum)+1;
                endIndex = i;
                break;
            } else {
                map.put(curr_sum, i);
            }
        }

        if(endIndex == -1)
            System.out.println("NO Subarray found for the sum : " +  sum);
        else
            System.out.println(startIndex + " to " + endIndex);
    }
}
