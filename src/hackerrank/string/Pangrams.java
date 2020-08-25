package hackerrank.string;

public class Pangrams {

    public static void main(String args[]) {
        String str = "We promptly judged antique ivory buckles for the prize";
        String result = pangrams(str.toUpperCase());
        System.out.println(result);
    }

    static String pangrams(String s) {

        int Max_len = 91;
        int count[] = new int[91];
        int allCharLength = 0;
        for(char c : s.toCharArray()) {
            count[c]++;
        }

        for(int i=65; i<=90; i++) {
            if(count[i] > 0) {
                allCharLength++;
                count[i] = -1;
            }
        }

        if(allCharLength == 26)
            return "pangram";

        return "not pangram";
    }

}
