package dp;

public class LengthOfShortestCommonSupersequence {

    public static void main(String args[]) {
        LengthOfShortestCommonSupersequence obj = new LengthOfShortestCommonSupersequence();
        String s1 = "geek";
        String s2 = "eke";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

//      First find the length of longest common subsequence
        int lcs = obj.lcs( X, Y, m, n );
        System.out.println("Length of lcs is " + lcs);

//      then subtract the lcs length from m+n
        System.out.println("Length of shortest-common-sequence is" + " " +  (m+n-lcs));
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
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }

            }
        }
        return t[m][n];
    }

}
