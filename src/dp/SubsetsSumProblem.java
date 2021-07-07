package dp;

public class SubsetsSumProblem {

    public static void main(String args[]) {
        int arr[] = {2,3,7,8,9};
        int sum = 14;
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

        for(int i=0; i<=n; i++) {
            for(int j=0; j<=sum; j++) {

                if(i == 0) {
                    t[i][j] = false;
                    continue;
                }

                if(j == 0) {
                    t[i][j] = true;
                    continue;
                }


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
