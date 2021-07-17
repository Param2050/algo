package recursive;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String args[]) {
        int arr[] = {1,2};
        List<List<Integer>> results = new ArrayList<>();
        Subsets obj = new Subsets();
        obj.subsets(arr, new ArrayList<>(), results, 0);
        System.out.println(results);
    }

    public void subsets(int[] arr, List<Integer> subset,
                                       List<List<Integer>> results, int start) {

        if(start > arr.length) {
            return;
        }
        results.add(new ArrayList<>(subset));

        for(int i=start; i<arr.length; i++) {
            subset.add(arr[i]); // Make a choice

            subsets(arr, subset, results, i+1);

            subset.remove(subset.size() - 1);
        }
    }
}
