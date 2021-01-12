package stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static void main(String args[]) {
        String expr = "()";
        if(isBalancedBrackets(expr)) {
            System.out.println("Balanced expression !!");
        }else {
            System.out.println("Not balanced !!");
        }
    }

    private static boolean isBalancedBrackets(String expr) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<expr.length(); i++) {
            char c = expr.charAt(i);
            if(c == '(' || c == '[' || c =='{') {
                stack.push(c);
                continue;
            }

            if(stack.isEmpty())
                return false;

            char check;
            switch (c) {
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '{' || check == '(')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '[')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

}
