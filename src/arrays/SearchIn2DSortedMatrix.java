package arrays;

public class SearchIn2DSortedMatrix {

    public static void main(String args[]) {

        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        boolean result = searchIn2dSortedMatrix(matrix, 14);
        System.out.println("Result : " + result);

    }

    private static boolean searchIn2dSortedMatrix(int[][] matrix, int k) {

        int rowsLen = matrix.length;
        int i = 0;
        int j = matrix[0].length-1;

        while(i < rowsLen && j >= 0) {

            if(matrix[i][j] == k) {
                return true;
            }

            if(matrix[i][j] > k)
                j--;
            else
                i++;
        }

        return false;
    }
}
