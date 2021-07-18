package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public static void main(String args[]) {
//        int[][] intervals = {};
        int[][] intervals = {{1,3},{6,9}};
        int[] newArray = {2,5};

        int temp[][] = createArray(intervals, newArray);
        int[][] results = null;
        if(temp.length == 1){
            System.out.println(Arrays.asList(results));
        }else {
            results = new InsertInterval().insert(temp);
            System.out.println(Arrays.asList(results));
        }

    }

    public int[][] insert(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] i : intervals) {

            if(i[0] <= end) {
                end = Math.max(end, i[1]);
            }else {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.stream().toArray(int[][]::new);

    }


    private static int[][] createArray(int[][] intervals, int[] newArray) {

        int len = intervals.length;
        int newIntervals[][] = new int[len+1][2];

//        copy the whole 2d array into newIntervals array
        for(int i=0; i<len; i++)
            newIntervals[i] = intervals[i];

//        add the last interval in newIntervals array as well
        newIntervals[newIntervals.length-1] = newArray;
        return newIntervals;
    }

}
