package leetcode;

public class MergeIntervals {

    public static void main(String args[]) {
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        new MergeIntervals().merge(arr);
    }

    public int[][] merge(int[][] nums) {

        int j=1;
        for(int i=0; i<4; i++) {
            if(nums[i][j] < nums[i+1] [j-1]) {

            }
        }
        return null;
    }
}
