package dp;

public class MinimumSubsetSumDifference {

    public static void main(String args[]) {
        int arr[] = {3, 1, 4, 2, 2, 1};
        int sum = 0;
        for(int item : arr)
            sum = sum + item;

        int min = new MinimumSubsetSumDifference().minSubsetSumDiff(arr, sum);
        System.out.println(min);
    }

    private int minSubsetSumDiff(int[] arr, int sum) {
        boolean t[][] = getSubsets(arr, sum);
        int n=arr.length;
        int last = sum/2;
        int res[] = new int[last+1];
        int j=0;
        for(int i=0; i<=last;i++) {
            if(t[n][i] == true) {
                res[j++] = i;
            }
        }

        int minimum = Integer.MAX_VALUE;

        for(int i=0; i<res.length; i++) {
            minimum = Math.min(minimum, sum - (2*res[i]));
        }
        return  minimum;
    }


    private static boolean[][] getSubsets(int[] arr, int sum) {
        int n = arr.length;
        boolean t[][] = new boolean[n+1][sum+1];

        t[0][0] = true;

        for(int i = 1; i <= sum; i++)
            t[0][i] = false;

        for(int i = 1; i <= n; i++)
            t[i][0] = true;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=sum; j++) {

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
        return t;
    }

}
