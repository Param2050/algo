package hackerrank.string;


import java.util.LinkedHashSet;

// Not completed*********************************************
public class LoveLetterMystry {


    public static void main(String args[]) {
        String str = "cba";
        System.out.println(theLoveLetterMystery(str));
    }

    static int theLoveLetterMystery(String str) {
        int i=0;
        int j=str.length()-1;
        int minDiff = 0;
        while (i<j) {
            minDiff = minDiff + (Math.abs(str.charAt(i) - str.charAt(j)));
            i++;
            j--;
        }

        return minDiff;
    }

}
