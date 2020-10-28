package hackerrank.searching;


import java.util.HashMap;
import java.util.Map;


public class IceCreamParlor {

    public static void main(String args[]) {
        int m = 8;
        int arr[] = new int[] {1, 4, 5, 3, 2};
        System.out.println(icecreamParlor(m, arr));
    }

    static int[] icecreamParlor(int m, int[] arr) {
        int res[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int x = arr[i];
            int y = m-x;
            Integer j = map.get(y);
            if(j != null) {
                res[0] = j+1;
                res[1] = i+1;
            } else {
                map.put(x, i);
            }
        }
        return res;
    }

}
