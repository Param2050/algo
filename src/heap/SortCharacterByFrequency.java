package heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharacterByFrequency {

    public static void main(String args[]) {
        String str = "cccaaa";
        frequencySort(str);
    }

    public static  String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<MyFreq> priorityQueue = new PriorityQueue<>(new MyFreq());

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            MyFreq myFreq = new MyFreq(entry.getValue(), entry.getKey());
            priorityQueue.add(myFreq);
        }

        String resultString = "";

        while(!priorityQueue.isEmpty()) {
            MyFreq myFreq = priorityQueue.poll();
            int freqCount = myFreq.key;
            Character ch = myFreq.value;
            for(int j=0; j<freqCount; j++) {
                resultString = resultString + ch;
            }
        }

        return resultString;
    }
}

class MyFreq implements Comparator<MyFreq> {
    Integer key;
    Character value;

    public MyFreq() {}

    public MyFreq(Integer key, Character value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compare(MyFreq f1, MyFreq f2) {

        if(f1.key != f2.key)
            return f2.key - f1.key;

        return f1.value.compareTo(f2.value);

    }
}