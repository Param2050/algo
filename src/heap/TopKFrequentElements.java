package heap;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String args[]) {
        int arr[] = {1,1,1,2,2,3,6,6,6,6,6,1};
        int res [] = topKFrequentElements(arr, 2);
        Arrays.stream(res).forEach(i-> System.out.print(" " + i));
    }

    private static int[] topKFrequentElements(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
           map.put(arr[i], map.getOrDefault(arr[i] , 0) + 1);
        }

        PriorityQueue<RequestEntry> priorityQueue = new PriorityQueue<>(new RequestEntry());



        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            RequestEntry request = new RequestEntry();
            request.key = entry.getValue();
            request.value = entry.getKey();
            priorityQueue.add(request);

            if(priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        int res [] = new int[k];
        int j=0;
        while (!priorityQueue.isEmpty()) {
            RequestEntry requestEntry = priorityQueue.poll();
            res[j++] = requestEntry.value;
        }

        return res;

    }


}
