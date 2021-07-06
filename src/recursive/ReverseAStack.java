package recursive;

import java.util.Stack;

public class ReverseAStack {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
        new ReverseAStack().reverseAStack(stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private void reverseAStack(Stack<Integer> stack) {

        if(stack.size() == 1) {
            return;
        }

        int temp = stack.pop();
        reverseAStack(stack);
        insertIntoStack(stack, temp);
    }

    private void insertIntoStack(Stack<Integer> stack, int temp) {

        if(stack.isEmpty()) {
            stack.push(temp);
            return;
        }

        int item = stack.pop();
        insertIntoStack(stack, temp);
        stack.push(item);

    }


}
