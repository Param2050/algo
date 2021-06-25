package heap;

import java.util.*;

public class KClosestNumbers {

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        List<Integer> results = findClosestElements(arr, 4, 3);
        System.out.println(results);
    }

    private static List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Pair> pq=new PriorityQueue<>(new Pair());

        for(int i=0; i<k; i++) {
            Pair pair = new Pair(Math.abs(arr[i] - x), arr[i]);
            pq.add(pair);
        }

        for(int i=k; i<arr.length; i++) {
            Pair pair = new Pair(Math.abs(arr[i] - x), arr[i]);
            if(pq.peek().key > pair.key) {
                pq.add(pair);
            }
            if(pq.size() > k) {
                pq.poll();
            }
        }


        List<Integer> res=new ArrayList<>();
        while(pq.size()>0){
            Pair p=pq.peek();
            res.add(p.value);
            pq.poll();
        }
        Collections.sort(res);
        return res;
    }
}
