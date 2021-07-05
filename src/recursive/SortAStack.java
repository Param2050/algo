package recursive;

import java.util.Collections;
import java.util.Stack;

public class SortAStack {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(4);

        new SortAStack().sortStack(stack, stack.size());


        while(!stack.isEmpty())
            System.out.println(stack.pop());

    }

    private void sortStack(Stack<Integer> stack, int n) {
        if(n == 1)
            return;

        int temp = stack.get(n-1);
        sortStack(stack, n-1);
        insert(stack, n-1, temp);
    }

    private void insert(Stack<Integer> stack, int n, int temp) {
        if(n == 0 || stack.get(n-1) <= temp) {
            stack.set(n, temp);
            return;
        }

        int val = stack.get(n-1);
        insert(stack, n-1, temp);
        stack.set(n, val);
    }


}
