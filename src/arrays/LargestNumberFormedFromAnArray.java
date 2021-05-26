package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LargestNumberFormedFromAnArray {
    public static void main(String args[]) {
        int arr[] = {54, 546, 548, 60};
        String largestNumber = new LargestNumberFormedFromAnArray().getLargestNum(arr);
        System.out.println("Largest number : " + largestNumber);
    }

    private String getLargestNum(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                String ij = String.valueOf(arr[i]) + arr[j];
                String ji = String.valueOf(arr[j]) + arr[i];
                if(Integer.parseInt(ji) > Integer.parseInt(ij)) {
                    swap(arr, j, i);
                }
            }
        }

        List<Integer> elements = IntStream.of(arr)
                .boxed().collect(Collectors.toList());

        return elements.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining());
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
