package hackerrank.warmup;


import java.util.HashSet;
import java.util.Set;

public class JumpingOnTheClouds {

    public static void main(String args[]) {
        int arr[] = new int[]{0, 0, 0, 0, 1, 0};
        System.out.print(jumpingOnClouds(arr));
    }
    static int jumpingOnClouds(int[] arr) {
        int minCount = -1;
        int len = arr.length;
        for(int i=0; i<len;) {
            if((len> i+2)  && arr[i+2] == 0) {
                i++;
            }
            i++;
            minCount++;
        }
        return minCount;
    }
}
