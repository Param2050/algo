package arrays;

import java.util.Arrays;

public class FindMissingAndRepeatingNumber {

    public static void main(String args[]) {
        int arr[] = {3,2,1,5,1};
        int i=0;
        while(i<arr.length) {
           if(arr[i] != arr[arr[i]-1]) {
               int temp = arr[arr[i] - 1];
               arr[arr[i] - 1] = arr[i];
               arr[i] = temp;
           }else {
               i++;
           }
        }

        int missingNo = -1;
        int duplicateNo = -1;

        for(int k=0; k<arr.length; k++) {
            if(arr[k] !=  k+1 ) {
                duplicateNo = arr[k];
                missingNo = k+1;
                break;
            }
        }
        System.out.println("Missing number : " + missingNo);
        System.out.println("Duplicate number : " + duplicateNo);
        Arrays.stream(arr).forEach(j-> System.out.print(" " + j));
    }
}
