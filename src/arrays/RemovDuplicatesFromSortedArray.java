package arrays;

public class RemovDuplicatesFromSortedArray {

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 8};
        int n = arr.length;
        int len = removeDuplicatesFromSortedArray(arr, n);
        for(int i=0; i<len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicatesFromSortedArray(int arr[], int n) {
        int j=0;
        for(int i=0; i<n-1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }

}
