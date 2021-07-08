package dp;

public class CountNoOfSubsetsWithGivenDifference {

    public static void main(String args[]) {
        int arr[] = {1,1,2,3};
        int diff = 1;

        System.out.println(new CountNoOfSubsetsWithGivenDifference().countNoOfSubsetsWithGivenDiff(arr, diff));
    }

    private int countNoOfSubsetsWithGivenDiff(int[] arr, int diff) {
        int sum = 0;
        for(int item : arr)
            sum = sum + item;

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
            for(int j=1; j<=sum; j++) {

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
