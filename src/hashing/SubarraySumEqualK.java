package hashing;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualK {
    public static void main(String args[]) {
        int arr [] = {1,-1,0};
        subarraySum(arr, 0);
    }

    public static int subarraySum(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap();
        int count = 0;
        map.put(0, 1);
        int sum = 0;

        for(int i : arr) {
            sum += i;
            if( map.containsKey(sum-k) )
                count += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;

    }

}