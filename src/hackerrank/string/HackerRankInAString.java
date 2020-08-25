package hackerrank.string;

public class HackerRankInAString {

    public static void main(String args[]) {
        String str = "hhhackkerbanker";
        String result = hackerrankInString(str);
        System.out.println(result);
    }

    static String hackerrankInString(String str) {

        StringBuffer res = new StringBuffer("hackerrank");

        for(char ch : str.toCharArray()) {

            if(res.length() == 0) {
                break;
            }

            if(ch == res.charAt(0)) {
                res.deleteCharAt(0);
            }
        }

        if(res.length() == 0) {
            return "YES";
        }
        return "NO";
    }

}
