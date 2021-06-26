package heap;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String args[]) {
//        String arr[] = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is", "hello"};
        String arr[] = {"ii", "love", "leetcode", "ii", "love", "k", "coding", "k"};
        List<String> result = topKFrequentWords(arr, 3);
        result.stream().forEach(i-> System.out.print(" " + i));
    }

    private static List<String> topKFrequentWords(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();
        int n = words.length;

        for(int i=0; i<n; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        PriorityQueue<MyEntry> pQueue = new PriorityQueue<>(new MyEntry());

        for(Map.Entry<String, Integer> mapEntry : map.entrySet()) {


            MyEntry myEntry = new MyEntry(mapEntry.getValue(), mapEntry.getKey());

            pQueue.add(myEntry);

            if(pQueue.size() > k) {
                pQueue.poll();
            }
            System.out.println("Top : " + pQueue.peek().key);
        }

        List<String> result = new ArrayList<>();

        while(!pQueue.isEmpty()) {
            result.add(pQueue.poll().value);
        }
        Collections.reverse(result);
        return result;

    }

}
