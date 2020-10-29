package hackerrank.warmup;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SalesByMatch {

    public static void main(String args[]) {
        int n = 7;
//        int arr[] = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        int arr[] = new int[]{1, 2, 1, 2, 1, 3, 2};
        System.out.print(sockMerchant(n, arr));
    }
    static int sockMerchant(int n, int[] arr) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<n; i++) {
            if(set.contains(arr[i])) {
                count++;
                set.remove(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        return count;
    }
}
