package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String args[]) {
        int arr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = new ThreeSum().threeSum(arr);
        System.out.println(result);
    }

    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<n-2; i++) {

            if(i==0 || (i>0 && (arr[i] != arr[i-1]))) {

                int low = i+1;
                int high = n-1;
                int sum = 0-arr[i];

                while(low < high) {

                    if(arr[low] + arr[high] == sum) {

                        res.add(Arrays.asList(arr[i], arr[low], arr[high]));

                        while(low<high && (arr[low] == arr[low+1]))
                            low++;

                        while(low<high && (arr[high] == arr[low-1]))
                            high--;

                        low++;
                        high--;
                    }else {

                        if(arr[low] + arr[high] < sum)
                            low++;
                        else
                            high--;
                    }

                }
            }

        }

        return res;
    }

}
