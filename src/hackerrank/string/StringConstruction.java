package hackerrank.string;


// Not completed*********************************************
public class StringConstruction {

    public static void main(String args[]) {
        String str = "abab";
        System.out.println(stringConstruction(str));
    }

    static int stringConstruction(String str) {
        StringBuilder newString = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(newString.indexOf(String.valueOf(ch)) == -1) {
                newString.append(ch);
            }
        }
        return newString.length();
    }

}
