package dp;

public class EqualSumPartitionProblem {

    public static void main(String args[]) {
        int arr[] = {1,2,3,5};
        boolean res = new EqualSumPartitionProblem().canPartition(arr);
        System.out.println(res);
    }

    public boolean canPartition(int[] arr) {

        int sum = 0;
        for(int item : arr) {
            sum = sum + item;
        }

        if(sum%2 == 1)
            return false;

        sum = sum/2;

        int n = arr.length;
        boolean t[][] = new boolean[n+1][sum+1];

        for(int i=0; i<=n; i++) {
            for(int j=0; j<=sum; j++) {

                if(i == 0) {
                    t[i][j] = false;
                }

                else if(j == 0) {
                    t[i][j] = true;
                }

                else if(arr[i-1] <= j) {
                    t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][j];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }
}
