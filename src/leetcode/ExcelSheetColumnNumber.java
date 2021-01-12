package leetcode;

public class ExcelSheetColumnNumber {

    public static void main(String args[]) {
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("ACC"));
    }

    public int titleToNumber(String s) {
        int result = 0;
        int d = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            d = c - 'A' + 1;
            result = result * 26 + d;
        }
        return result;
    }

}
