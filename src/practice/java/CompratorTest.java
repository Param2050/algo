package practice.java;

import java.util.*;

public class CompratorTest {
    public static void main(String args[]) {
//        List<Integer> list = new ArrayList<>();
//        list.add(50);
//        list.add(10);
//        list.add(60);
//        list.add(20);
//
//        Collections.sort(list, (a,b) -> b-a);
//
//        for(int val : list) {
//            System.out.println(val);
//        }

        Map<String, Integer> map = new HashMap<>();
        map.put("Geetika", 500);
        map.put("Param", 200);
        map.put("Kamal", 600);
        map.put("Harman", 50);



        PriorityQueue<Map.Entry<String, Integer>> pQueue = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
//        PriorityQueue<Map.Entry<String, Integer>> pQueue = new PriorityQueue<>((a,b) -> b.getKey().compareTo(a.getKey()));

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            pQueue.add(entry);
        }

        while (!pQueue.isEmpty()) {
            Map.Entry<String, Integer> entry = pQueue.poll();
            System.out.println("Key :" + entry.getKey() + " value " + entry.getValue());
        }
    }
}
