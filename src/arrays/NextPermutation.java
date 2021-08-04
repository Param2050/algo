package arrays;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String args[]) {
//        int arr[] = {1,3,5,4,2};
        int arr[] = {1,3,2};
//        int arr[] = {1,2,3};
//        int arr[] = {3,2,1};

        nextPermutation(arr);
    }

    private static void nextPermutation(int[] arr) {
        int arrLen = arr.length;
        int i = arrLen-2;
        while(i>= 0 && arr[i] >= arr[i+1])
            i--;

        if(i>=0) {
            int j = arrLen-1;
            while(arr[j] <= arr[i])
                j--;
            swap(arr, i, j);
        }
        reverse(arr, i+1, arrLen-1);

        for (int elem: arr) {
            System.out.print(" " + elem);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int i, int j) {
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
