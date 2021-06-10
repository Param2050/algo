package stackandqueue;

import java.util.Stack;

public class DeisgnMinStack {

    Stack<Integer> stack;
    int minEle;

    public DeisgnMinStack() {
        stack = new Stack<>();
    }

    public static void main(String args[]) {
        DeisgnMinStack obj = new DeisgnMinStack();
        obj.push(3);
        obj.push(5);
        obj.getMin();
        obj.push(2);
        obj.pop();
        obj.getMin();
    }

    private void pop() {
        if(stack.isEmpty())
            return;

        int t = stack.pop();

        if(t < minEle) {
            System.out.println("Popped element is : " + minEle);
            minEle = 2*minEle - t;
            return;
        }
        System.out.println("Popped element is : " + t);
    }


    private void getMin() {
        if(stack.isEmpty())
            return;

        System.out.println("Minimum element is : " + minEle);
    }

    private void push(int x) {

        if(stack.isEmpty()) {
            stack.push(x);
            minEle = x;
            System.out.println("Element has been pushed to stack : " + x);
            return;
        }

        if(x < minEle) {
            stack.push(2*x - minEle);
            minEle = x;
        }else {
            stack.push(x);
        }

        System.out.println("Element has been pushed to stack : " + x);

    }

}
