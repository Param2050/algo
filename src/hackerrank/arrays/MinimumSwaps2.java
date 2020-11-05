package hackerrank.arrays;

import java.util.HashMap;
import java.util.Map;

public class MinimumSwaps2 {

    public static void main(String args[]) {
        int arr[] = new int[]{2, 1, 5, 3, 4};
        System.out.println("Minimum swap : " + minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int len = arr.length;
        boolean isVisited[] = new boolean[len + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < isVisited.length; i++) {
            map.put(i, arr[i - 1]);
        }

        int swapCount = 0;

        for (int k = 1; k <= map.size(); k++) {
            int nextNode;
            if (isVisited[k] == false) {
                isVisited[k] = true;

                if (k == map.get(k)) {
                    continue;
                } else {
                    int c = map.get(k);
                    while (!isVisited[c]) {
                        isVisited[c] = true;
                        nextNode = map.get(c);
                        c = nextNode;
                        swapCount++;
                    }
                }
            }
        }
        return swapCount;
    }

}
