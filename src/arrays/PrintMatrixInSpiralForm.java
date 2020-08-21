package arrays;

public class PrintMatrixInSpiralForm {

    public static void main(String args[]) {
        int rows = 3;
        int cols = 6;
        int arr[][] = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}};
        spiralPrint(rows, cols, arr);
    }

    private static void spiralPrint(int m, int n, int arr[][]) {
        int k = 0;
        int l = 0;
        int i = 0; //iterator

//        k is for starting row index
//        m is for ending row index
//        l is for starting column index
//        n is for ending coloumn index

        while (k < m && l < n) {

//      print first row
            for (i = l; i < n; i++) {
                System.out.print(" " + arr[k][i]);
            }
            k++;


//      print last column from remaining columns
            for (i = k; i < m; i++) {
                System.out.print(" " + arr[i][n - 1]);
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; i--) {
                    System.out.print(" " + arr[m - 1][i]);
                }
                m--;
            }

            if (l < n) {
                for (i = m - 1; i >= k; i--) {
                    System.out.print(" " + arr[i][l]);
                }
                l++;
            }
        }

    }

}
