package arrays;

import java.util.Arrays;

public class PythagoreanTriplet {

    public static void main(String args[]) {
        int arr[] = new int[]{3,1,4,6,5};
        if(new PythagoreanTriplet().isTriplet(arr)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private boolean isTriplet(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        Arrays.sort(arr);


        for(int i=n-1; i>=2; i--) {

            int l = 0;
            int r = i-1;

            while (l < r) {

                if(arr[l] + arr[r] == arr[i]) {
                    return true;
                }

                if(arr[l] + arr[r] < arr[i]) {
                    l++;
                }
                else {
                    r--;
                }
            }

        }
        return false;
    }
}
