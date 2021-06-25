package heap;

import java.util.Comparator;

public class Pair implements Comparator<Pair> {
    Integer key;
    Integer value;

    public Pair(){}

    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compare(Pair p1, Pair p2) {
        if(p1.key > p2.key) {
            return -1;
        }
        else if(p1.key < p2.key) {
            return 1;
        }
        return 0;
    }
}
