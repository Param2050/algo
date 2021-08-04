package javapractice.threads;

import java.util.Arrays;
import java.util.Scanner;

public class HackerEarthTest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        new HackerEarthTest().printMinMax(arr, n);

    }

    private void printMinMax(int[] arr, int n) {
        Arrays.sort(arr);
        int mid = n/2;
        int minSum = 0;
        int maxSum = 0;

        for(int i=0; i<mid; i++) {
            minSum = minSum + arr[i];
        }

        for(int i=0; i<n; i++) {
            maxSum = maxSum + arr[i];
        }

        System.out.println(minSum + " " + maxSum);
    }


}
