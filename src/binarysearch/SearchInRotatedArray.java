package binarysearch;


public class SearchInRotatedArray {

    public static void main(String args[]) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 6));
    }

    public static int search(int[] arr, int target) {

        int minEleIndex = getMinIndex(arr);
        int first = binarySearch(arr, 0, minEleIndex-1, target);
        int second = binarySearch(arr, minEleIndex, arr.length-1, target);
        return first != -1 ? first : second;
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

    private static int getMinIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[end]) {
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return start;

    }
}
