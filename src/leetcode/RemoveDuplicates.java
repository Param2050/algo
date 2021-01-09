package leetcode;

public class RemoveDuplicates {

    public static void main(String args[]) {
      int arr[] =new int[] {0,0,1,1,1,2,2,3,3,4};
      int res = new RemoveDuplicates().removeDuplicates(arr);
      System.out.println("Result " + res);
    }

//    0,0,1,1,1,2,2,3,3,4
    public int removeDuplicates(int[] nums) {
      int count = 1;
      int last = nums[0];
      for(int i=1; i<nums.length; i++) {
          if(nums[i] == last) {
              nums[i] = -1;
          }else {
              last= nums[i];
              count++;
          }
      }
      int j=0;
      for(int i=0; i<nums.length; i++) {
          if(nums[i] != -1) {
              nums[j++] = nums[i];
          }
      }

      return count;
    }
}
