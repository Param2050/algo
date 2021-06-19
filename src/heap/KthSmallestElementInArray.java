package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInArray {

    public static void main(String args[]) {
        int arr[] = {10, 30, 20, 400, 5, 600};
        int kthElement = kthSmallestElement(arr, 3);
        System.out.println("Kth smallestElement in array is : " + kthElement);
    }

    private static int kthSmallestElement(int[] arr, int k) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<arr.length; i++) {
            pQueue.add(arr[i]);
            if(pQueue.size() > k) {
                pQueue.poll();
            }
        }
        return pQueue.peek();
    }
}
