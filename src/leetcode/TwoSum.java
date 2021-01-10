package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String args[]) {
//        int arr[] =new int[] {3,2,4};
        int arr[] =new int[] {2,7,11,15};
        int target = 9;
        int indexes[] = new TwoSum().twoSum(arr, target);
        System.out.println(indexes);
    }

    public int[] twoSum(int[] nums, int target) {
     int indexArr[] = new int[2];
     Map<Integer, Integer> map = new HashMap<>();

     for (int i=0; i<nums.length; i++) {
             if(map.containsKey(target-nums[i])) {
                 indexArr[0] = map.get(target-nums[i]);
                 indexArr[1] = i;
             }else {
                 map.put(nums[i], i);
             }
     }
        return indexArr;
    }

}
