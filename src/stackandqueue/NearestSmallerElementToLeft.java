package stackandqueue;

import java.util.Stack;

public class NearestSmallerElementToLeft {

    public static void main(String args[]) {
        int arr[] = { 1, 3, 0, 2, 5 };
        int n = arr.length;
        printNSEToLeft(arr, n);
    }

    private static void printNSEToLeft(int[] arr, int n) {
        int newArray [] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {

            while(!stack.isEmpty() && stack.peek() >= arr[i])
                stack.pop();

            if(stack.isEmpty()) {
                newArray[i] = -1;
            } else {
                newArray[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        for(int i=0; i<n; i++) {
            System.out.println(arr[i] + " -----------> " + newArray[i]);
        }

    }

}
