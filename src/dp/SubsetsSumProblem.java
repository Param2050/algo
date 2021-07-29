package dp;

public class SubsetsSumProblem {

    public static void main(String args[]) {
        int arr[] = {2,3,7,8,9};
        int sum = 17;
        if(isSubsetPresent(arr, sum)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    private static boolean isSubsetPresent(int[] arr, int sum) {
        int n = arr.length;
        boolean t[][] = new boolean[n+1][sum+1];

        t[0][0] = true;

        for(int i = 1; i <= sum; i++)
            t[0][i] = false;

        for(int i = 1; i <= n; i++)
            t[i][0] = true;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=sum; j++) {

                if(arr[i-1] <= j) {
                    t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][j];
                }else {
                    t[i][j] = t[i-1][j];
                }

            }
        }
        return t[n][sum];
    }

}
