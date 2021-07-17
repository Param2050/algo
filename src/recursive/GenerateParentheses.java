package recursive;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String args[]) {
        GenerateParentheses obj = new GenerateParentheses();
        int n = 3;
        int open = n;
        int close = n;
        String output = "";
        List<String> results = new ArrayList<>();
        obj.generateParenthesis(open,close,output,results);
        System.out.println(results);
    }


    public void generateParenthesis(int open, int close, String output, List<String> results) {

        if(open == 0 && close == 0){
            results.add(output);
            return;
        }

        if(open != 0) {
            String op1 = output;
            op1 = op1 + "(";
            generateParenthesis(open-1, close, op1, results);
        }

        if(close > open) {
            String op2 = output;
            op2 = op2 + ")";
            generateParenthesis(open, close-1, op2, results);
        }
        return;
    }
}
