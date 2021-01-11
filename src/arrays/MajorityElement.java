package arrays;

public class MajorityElement {

    public static void main(String args[]) {
        int arr[] = new int[]{2,2,5,4,2,};
        int res = new MajorityElement().majorityElement(arr);
        System.out.println("Majority Element : " + res);
    }

    public int majorityElement(int[] nums) {
        int majorityEle = nums[0];
        int count = 1;

        for(int i=1; i<nums.length; i++) {

            if(majorityEle == nums[i]) {
                count++;
            }else {
                count -= 1;
                if(count == 0) {
                    majorityEle = nums[i];
                    count = 1;
                }
            }
        }
        return majorityEle;
    }
}
