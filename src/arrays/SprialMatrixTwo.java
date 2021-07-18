package arrays;

public class SprialMatrixTwo {

    public static void main(String[] args) {
        int n = 1;
        int row = n;
        int column = n;
        SprialMatrixTwo obj = new SprialMatrixTwo();
        int mat[][] = new int[row][column];
        obj.generateMatrix(mat, row, column);

    }

    private int[][] generateMatrix(int[][] mat, int m, int n) {

        int k = 0; //row start point
        int l = 0;  // column start point
        int i; //

        int count = 1;

        while(k < m && l < n) {

            for(i=l; i<n; i++) {
                mat[k][i] = count;
                count++;
            }
            k++;

            for(i=k; i<m; i++) {
                mat[i][n-1] = count;
                count++;
            }
            n--;

            if(k < m) {
               for(i=n-1; i>=l; i--) {
                   mat[m-1][i] = count;
                   count++;
               }
            }
            m--;

            if(l < n) {
                for(i=m-1; i>=k; i--) {
                    mat[i][l] = count;
                    count++;
                }
            }
            l++;
        }
        return mat;
    }

}
