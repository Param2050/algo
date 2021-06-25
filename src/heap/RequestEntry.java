package heap;

import java.util.Comparator;

public class RequestEntry implements Comparator<RequestEntry> {
    Integer key;
    Integer value;

    @Override
    public int compare(RequestEntry r1, RequestEntry r2) {
        if(r1.key > r2.key){
            return 1;
        }else if(r1.key < r2.key) {
            return -1;
        }
        return 0;
    }
}
