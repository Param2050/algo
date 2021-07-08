package dp;

public class TargetSum {

    public static void main(String args[]) {
        int arr[] = {0,0,0,0,0,0,0,0,1};
        int diff = 1;
        System.out.println(new TargetSum().findTargetSumWays(arr, diff));
    }

    public int findTargetSumWays(int[] arr, int diff) {
        int sum = 0;
        for(int item : arr)
            sum = sum + item;

        if(diff>sum || (diff+sum)%2==1)
            return 0;

        // S1 + S2 = Sum
        // S1 - S2 = diff
        // S1 = (sum + diff)/2

        int s1 = (diff+sum)/2;
        return countNoOfSubsets(arr, s1);
    }

    private int countNoOfSubsets(int[] arr, int sum) {
        int n = arr.length;
        int t[][] = new int[n+1][sum+1];

        t[0][0] = 1;

        for(int i = 1; i <= sum; i++)
            t[0][i] = 0;

        for(int i = 1; i <= n; i++)
            t[i][0] = 1;


        for(int i=1; i<=n; i++) {
            for(int j=0; j<=sum; j++) {

                if(arr[i-1] <= j) {
                    t[i][j] = t[i-1][j - arr[i-1]] + t[i-1][j];
                }else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }

}
