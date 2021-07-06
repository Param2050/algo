package recursive;

import java.util.Stack;

public class DeleteAMiddleElementFromStack {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        int mid = (stack.size()/2);
        new DeleteAMiddleElementFromStack().deleteMiddleElement(stack, mid);
        
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    private void deleteMiddleElement(Stack<Integer> stack, int mid) {
        if(stack.size()-1 == mid) {
            stack.pop();
            return;
        }

        int item = stack.pop();
        deleteMiddleElement(stack, mid);
        stack.push(item);
    }

}
