package dp;

public class LongestCommonSubstring {

    public static void main(String args[]) {

        String s1 = "GeeksforGeeks";
        String s2 = "GeeksQuiz";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is" + " " +
                new LongestCommonSubstring().longestCommonSubstring( X, Y, m, n ) );
    }

    private int longestCommonSubstring(char X[], char Y[], int m, int n) {

        int t[][] = new int[m+1][n+1];
        int result = 0;
        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {

                if(i == 0 || j == 0) {
                    t[i][j] = 0;
                }
                else if(X[i-1] == Y[j-1]) {
                    t[i][j] = 1 + t[i-1][j-1];
                    result = Math.max(result, t[i][j]);
                }
                else {
                    t[i][j] = 0;
                }

            }
        }
        return result;
    }

}
