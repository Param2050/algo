package dp;

public class LongestRepeatingSubsequence {

    public static void main(String args[]) {
        String s1 = "aabbb";
        String s2 = s1;

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of Longest repeating subsequence is" + " " +
                lcs( X, Y, m, n ) );
    }

    private static int lcs(char X[], char Y[], int m, int n) {

        int t[][] = new int[m+1][n+1];

        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {

                if(i == 0 || j == 0) {
                    t[i][j] = 0;
                }
                // its a same lcs code with small restrictions that i should not be equal to j
                else if(X[i-1] == Y[j-1] && (i != j)) {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }

            }
        }
        return t[m][n];
    }

}
