package hackerrank.searching;

import java.util.*;

public class MissingNumbers {

    public static void main(String args[]) {
        int arr[] = new int[] {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int brr[] = new int[] {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
        int res[] = missingNumbers(arr, brr);
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer, Integer> aMap = new HashMap<>();
        Map<Integer, Integer> bMap = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(aMap.containsKey(arr[i])) {
                aMap.put(arr[i], aMap.get(arr[i]) + 1);
            } else {
                aMap.put(arr[i], 1);
            }
        }

        for(int i=0; i<brr.length; i++) {
            if(bMap.containsKey(brr[i])) {
                bMap.put(brr[i], bMap.get(brr[i]) + 1);
            } else {
                bMap.put(brr[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int e : bMap.keySet()) {
            if(aMap.containsKey(e)) {
                if(bMap.get(e) > aMap.get(e)) {
                    list.add(e);
                }
            }else {
                list.add(e);
            }
        }
        Collections.sort(list);
        int res[] = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
