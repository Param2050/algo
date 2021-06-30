package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberInWindowSizeK {
    public static void main(String args[]) {
        int arr [] = {12, -1, -7, 8, -15, 30, 16, 19};
        firstNegative(arr, 3);
    }

    private static void firstNegative(int[] arr, int k) {
        int i=0;
        int j=0;
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        while(j<n) {
            if (arr[j] < 0) {
                list.add(arr[j]);
            }
            if ((j - i + 1) == k) {
                if(list.isEmpty())
                    System.out.print(" " + 0);
                else
                    System.out.print(" " + list.get(0));

                if(list.contains(arr[i]))
                    list.remove(0);
                i++;
            }
            j++;
        }

    }
}
