package stackandqueue;

import java.util.Stack;

public class StockSpanProblem {

    public static void main(String args[]) {
        int price[] = { 100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        stockSpanProblem(price, n);
    }

    private static void stockSpanProblem(int[] price, int n) {
        Stack<Integer> stack = new Stack<>();
        int span[] = new int[n];

        stack.push(0);
        span[0] = 1;
        for(int i=1; i<n; i++) {

            while( !stack.isEmpty() && price[stack.peek()] <= price[i])
                stack.pop();

            if(stack.isEmpty()) {
                span[i] = i+1;
            }else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }


        for(int i=0; i<n; i++) {
            System.out.println(price[i] + " -----------> " + span[i]);
        }
    }

}
