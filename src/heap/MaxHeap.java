package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {

    public static void main(String args[]) {
        int arr[] = {10, 30, 20, 400, 5, 600};
        maxHeap(arr);
    }

    private static void maxHeap(int[] arr) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<arr.length; i++) {
            pQueue.add(arr[i]);
            System.out.println("Max heap peek element is : " + pQueue.peek());
        }
        for(int i=0; i<arr.length; i++) {
            pQueue.poll();
            System.out.println("Max heap peek element is : " + pQueue.peek());
        }

    }

}
