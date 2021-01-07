package leetcode;

public class MovesZeroes {
    public static void main(String args[]) {
        int nums [] = new int[] {0,1,0,3,12};
        int result[] = new MovesZeroes().moveZeroes(nums);
    }

    public int[] moveZeroes(int[] nums) {

        int left = 0;
        int right = 0;

        int temp;
        while (right < nums.length) {
            if(nums[right] != 0) {
                temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }

        return nums;
    }

}
