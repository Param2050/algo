package recursive;

public class MatrixChainMultiplication {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int res = new MatrixChainMultiplication().mcm(arr, 1, arr.length-1);
        System.out.println(res);
    }

    private int mcm(int[] arr, int i, int j) {

        if(i>= j)
            return 0;

        int min = Integer.MAX_VALUE;

        for(int k=i; k<j; k++) {

            int temp = mcm(arr, i, k) +
                       mcm(arr, k+1, j) +
                       arr[i-1] * arr[k] * arr[j];

            if(temp < min) {
                min = temp;
            }
        }

        return min;
    }


}
