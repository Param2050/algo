package heap;

import java.util.Comparator;

public class MyEntry  implements Comparator<MyEntry> {
    Integer key;
    String value;

    public MyEntry(){}

    public MyEntry(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public int compare(MyEntry m1, MyEntry m2) {

        if(m1.key != m2.key)
            return m1.key - m2.key;
        return m2.value.compareTo(m1.value);
    }

}
