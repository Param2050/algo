package dp;

import java.util.Arrays;

public class LIS {
    public static void  main(String args[]) {
        int arr[] = {84,80,27};
        System.out.println(new LIS().lis(arr, arr.length));
    }

    private int lis(int[] arr, int n) {

        int lis[] = new int[n];

        Arrays.fill(lis, 1);

        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++) {

                if(arr[i] > arr[j] &&
                   lis[j] >= lis[i]) {
                    lis[i] = lis[j]+1;
                }
            }
        }

        int max = 0;
        for(int i=0; i<n; i++) {
            if(max < lis[i]) {
                max = lis[i];
            }
        }

        return max;
    }
}
