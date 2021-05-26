package arrays;

import java.util.Arrays;

public class Sort012 {
    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 0, 1, 2};
        int n = arr.length;
        sort012(arr, n);

        for (int elem : arr) {
            System.out.println(" " + elem);
        }
    }

    private static void sort012(int arr[], int n) {
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high) {

            if(arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid ++;
            } else if(arr[mid] == 1) {
                mid++;
            } else if(arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }

        }

    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
