package binarysearch;

public class FindMinimumElementInSortedRotatedArray {

    public static void main(String args[]) {
        int arr[] = {11,12,15,18,2,5,6,8};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[end])
                start = mid + 1;
            else {
                end = mid;
            }
        }
        return arr[start];
    }
}
