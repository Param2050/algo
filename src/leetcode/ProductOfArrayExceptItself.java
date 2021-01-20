package leetcode;

public class ProductOfArrayExceptItself {

    public static void main(String args[]) {
        int arr[] = new int[] {1,2,3,4};
        new ProductOfArrayExceptItself().productExceptSelf(arr);
    }


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int reslutArray[] = new int[n];
        int j=0;
        for(int i=0; i<n; i++) {
            int res =1;
            j=0;
            while (j<n) {
                if(i != j) {
                    res = res * nums[j];
                }
                j++;
            }
            reslutArray[i] = res;
        }

        return reslutArray;
    }
}
