package heap;

import java.util.*;

public class KClosestNumbers {

    public static void main(String args[]) {
        int arr[] = {-10, -50, 20, 17, 80};
        List<Integer> results = findClosestElements(arr, 2, 20);
        System.out.println(results);
    }

    private static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(
                new Comparator<Pair>(){
                    public int compare(Pair a,Pair b){
                        return b.key-a.key;
                    }
                }
        );
        int n=arr.length;
        for(int i=0;i<k;i++){
            Pair temp=new Pair();
            temp.key=Math.abs(arr[i]-x);
            temp.value=arr[i];
            pq.add(temp);
            int peek = pq.peek().getKey();
            System.out.println(peek);
        }
        for(int i=k;i<n;i++){
            Pair temp=new Pair();
            temp.key=Math.abs(arr[i]-x);
            temp.value=arr[i];

            Pair check=pq.peek();
            if(check.key>temp.key){
                pq.add(temp);
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
