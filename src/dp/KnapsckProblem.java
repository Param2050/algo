package dp;

import java.util.Arrays;

// This is 0-1 knapsack problem
public class KnapsckProblem {

    public static void main(String args[]) {
        int A[] = {60, 100, 120};
        int B[] = {10, 20, 30};
        int C = 50;
        System.out.println("Maximum profit : " + solve(A, B, C));
    }

    public static int solve(int[] values, int[] weights, int W) {
        int n = weights.length;
        int t[][] = new int[n+1][W+1];

        for(int i=0; i<=n; i++) {
            for(int j=0; j<=W; j++) {

                if(i == 0 || j == 0) {
                    t[i][j] = 0;
                }
                else if(weights[i-1] <= j) {
                    t[i][j] = Math.max(values[i-1] + t[i-1][j - weights[i-1]], t[i-1][j]);
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][W];
    }

}
