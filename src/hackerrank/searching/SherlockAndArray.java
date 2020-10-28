package hackerrank.searching;

import java.util.ArrayList;
import java.util.List;

public class SherlockAndArray {

    public static void main(String args[]) {
        String str = "0100101010";
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(11);
        System.out.println(balancedSums(list));
    }

    static String balancedSums(List<Integer> arr) {
        Integer sum = arr.stream().mapToInt(i-> i).sum();
        int x=0, y;
        for(int i=0; i<arr.size(); i++) {
            int leftSide = x*2;
            y = arr.get(i);
            int rightSide = sum-y;
            if(leftSide == rightSide) {
                return "YES";
            }
            x = x+arr.get(i);
        }

        return "NO";
    }

}
