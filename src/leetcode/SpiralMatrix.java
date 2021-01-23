package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String args[]) {
        int R = 3;
        int C = 6;
        int a[][] = { { 1, 2, 3,},
                { 4, 5, 6},
                { 7, 8, 9, } };
        List<Integer> res = new SpiralMatrix().spiralOrder(a);
        System.out.println("Result : " + res);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultList = new ArrayList<>();
        int m =matrix.length; // row length;
        int n = matrix[0].length;

        int i; // iterator
        int k=0; // start index of row
        int l=0; // start index of column

        while (k < m && l < n) {

            for (i = l; i<n; i++) {
                resultList.add(matrix[k][i]);
            }
            k++;

            for(i=k; i<m; i++) {
                resultList.add(matrix[i][n-1]);
            }
            n--;

            if(k < m) {
                for(i=n-1; i>=l; i--) {
                    resultList.add(matrix[m-1][i]);
                }
                m--;
            }

            if(l < n) {
                for(i=m-1; i>=k; i--) {
                    resultList.add(matrix[i][l]);
                }
                l++;
            }

        }

        return resultList;
    }
}

