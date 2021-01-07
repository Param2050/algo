package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String args[]) {
        int arr[] = new int[] {2,2,1};
        int res = new SingleNumber().singleNumber(arr);
    }

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int e : nums) {
            if(!map.containsKey(e)) {
                map.put(e, 1);
            }else {
                int i = map.get(e);
                map.put(e, i+1);
            }
        }



        return 0;
    }
}
