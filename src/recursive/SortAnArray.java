package recursive;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String args[]) {
        int arr[] = {0,5,2,4,1,6,10,3,7,8,9};
        new SortAnArray().sortArray(arr, arr.length);
        Arrays.stream(arr).forEach(i-> System.out.println(i));
    }

    public void sortArray(int arr[], int n) {
        if(n == 1)
            return;

        int temp = arr[n-1];
        sortArray(arr, n-1);
        insert(arr, n-1, temp);
    }

    private void insert(int[] arr, int n, int temp) {
        if(n == 0 || arr[n-1] <= temp) {
            arr[n] = temp;
            return;
        }

        int val = arr[n-1];
        insert(arr, n-1, temp);
        arr[n] = val;
    }
}
