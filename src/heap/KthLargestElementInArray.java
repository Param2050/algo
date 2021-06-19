package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInArray {

    public static void main(String args[]) {
        int arr[] = {3, 2, 1, 5, 6, 4};
        int kthElement = kthLargestElement(arr, 2);
        System.out.println("Kth largestElement in array is : " + kthElement);
    }

    private static int kthLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        for(int i=0; i<arr.length; i++) {
            pQueue.add(arr[i]);
            if(pQueue.size() > k) {
                pQueue.poll();
            }
        }
        return pQueue.peek();
    }
}
