package dp;

public class LongestPalindromicSubsequence {

    public static void main(String args[]) {
        LongestPalindromicSubsequence object = new LongestPalindromicSubsequence();
        String s1 = "GEEKSFORGEEKS";
        String s2 = new StringBuilder(s1).reverse().toString();


        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is" + " " +
                object.lcs( X, Y, m, n ) );
    }

    private int lcs(char X[], char Y[], int m, int n) {

        int t[][] = new int[m+1][n+1];

        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {

                if(i == 0 || j == 0) {
                    t[i][j] = 0;
                }
                else if(X[i-1] == Y[j-1]) {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else {
                    t[i][j] = max(t[i-1][j], t[i][j-1]);
                }

            }
        }
        return t[m][n];
    }

    private int max(int a, int b) {
        if(a > b)
            return a;
        else
            return b;
    }

}
