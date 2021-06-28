package binarysearch;

import java.util.Arrays;

public class FirstAndLastOccurrenceOfAnElement {

    public static void main(String args[]) {
//        int arr [] = {2,4,10,10,10,18,20};
//        int arr [] = {2, 2};
//        int arr [] = {1};
        int arr [] = {5,7,7,8,8,10};
        int target = 8;
        int result [] = searchRange(arr, target);
        Arrays.stream(result).forEach(i-> System.out.println(" " + i));
    }

    private static int[] searchRange(int[] arr, int target) {
        int res[] = new int[2];
        res[0] = findFirst(arr, target);
        res[1] = findLast(arr, target);
        return res;
    }

    private static int findFirst(int[] arr, int target) {

        int index = -1;
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if(arr[mid] == target)
                index = mid;
        }
        return index;
    }

    private static int findLast(int[] arr, int target) {

        int index = -1;
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if(arr[mid] == target)
                index = mid;
        }
        return index;
    }

}
