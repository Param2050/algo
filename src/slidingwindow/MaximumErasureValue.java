package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumErasureValue {

    public static void main(String args[]) {
        int[] arr = {5,2,1,2,5,2,1,2,5};
        int res = new MaximumErasureValue().maximumUniqueSubarray(arr);
        System.out.println(res);
    }

    public int maximumUniqueSubarray(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        Map<Integer,Integer> hashMap = new HashMap<>();
        int i = 0;
        int j = 0;

        while (j < n) {
            while (hashMap.containsKey(arr[j])) {
                hashMap.remove(arr[i]);
                currSum = currSum - arr[i];
                i++;
            }
            hashMap.put(arr[j], j);
            currSum = currSum + arr[j];
            max = Math.max(max, currSum);
            j++;
        }
        return max;
}
}

