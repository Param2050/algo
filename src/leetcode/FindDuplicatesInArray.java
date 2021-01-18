package leetcode;

import java.util.Arrays;

public class FindDuplicatesInArray {

    public static void main(String args[]) {
        int arr[] = new int[]{3,1,3,4,2};
        int res = new FindDuplicatesInArray().findDuplicate(arr);
        System.out.println("Duplicate element " + res);
    }

//    arr[0], arr[1], arr[2], arr[3], arr[4]
//       3,     1,      3,      4,      2
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

}
