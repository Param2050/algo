package arrays;

import java.util.Arrays;

public class Sort012 {
    public static void main(String args[]) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sort012(arr, n);
    }

    private static void sort012(int arr[], int n) {
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        int i;

        for(i=0; i<n; i++){

            switch (arr[i]) {
                case 0:
                    zeroCount++;
                    break;
                case 1:
                    oneCount++;
                    break;
                case 2:
                    twoCount++;
                    break;
            }
        }

        i=0;
        while (zeroCount > 0) {
            arr[i++] = 0;
            zeroCount--;
        }

        while (oneCount > 0) {
            arr[i++] = 1;
            oneCount--;
        }

        while (twoCount > 0) {
            arr[i++] = 2;
            twoCount--;
        }

        Arrays.stream(arr).forEach(e-> System.out.print(" " +e));

    }

}
