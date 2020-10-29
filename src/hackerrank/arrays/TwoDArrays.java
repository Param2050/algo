package hackerrank.arrays;

public class TwoDArrays {

    public static void main(String args[]) {
     int d = 2;
     int arr [][] = new int[][] {{1,1,1,0,0,0},
                                {0,1,0,0,0,0},
                                {1,1,1,0,0,0},
                                {0,0,2,4,4,0},
                                {0,0,0,2,0,0},
                                {0,0,1,2,4,0}};
     System.out.print(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {
        int rLen = arr.length;
        int cLen = arr[0].length;
        int totalMax = Integer.MIN_VALUE;
        for(int i=0; i<rLen-2; i++) {
            for(int j=0; j<cLen-2; j++) {
                int currMax = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                              arr[i+1][j+1] +
                              arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                totalMax = Math.max(totalMax, currMax);
            }
        }
    return totalMax;
    }
}
