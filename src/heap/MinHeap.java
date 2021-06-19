package heap;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String args[]) {
        int arr[] = {10, 30, 20, 400, 5, 600};
        minHeap(arr);
    }

    private static void minHeap(int[] arr) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        for(int i=0; i<arr.length; i++) {
            pQueue.add(arr[i]);
            System.out.println("Min heap peek element is : " + pQueue.peek());
        }
        for(int i=0; i<arr.length; i++) {
            pQueue.poll();
            System.out.println("Min heap peek element is : " + pQueue.peek());
        }

    }
}
