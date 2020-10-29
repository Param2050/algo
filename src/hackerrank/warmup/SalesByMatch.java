package hackerrank.warmup;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {

    public static void main(String args[]) {
        int n = 7;
//        int arr[] = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        int arr[] = new int[]{1, 2, 1, 2, 1, 3, 2};
        System.out.print(sockMerchant(n, arr));
    }
    static int sockMerchant(int n, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }else {
                map.put(arr[i], 1);
            }
        }
        int maxNoPairs = 0;
        for(Integer value : map.values()) {
            maxNoPairs = maxNoPairs + (value)/2;
        }
        return maxNoPairs;

    }
}
