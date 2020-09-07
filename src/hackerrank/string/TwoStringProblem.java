package hackerrank.string;


// Not completed*********************************************
public class TwoStringProblem {

    public static void main(String args[]) {
        String str1 = "hello";
        String str2 = "world";
        System.out.println(twoStrings(str1, str2));
    }

    static String twoStrings(String s1, String s2) {
        int count[] = new int[26];
        for(int i=0; i<s2.length(); i++) {
            char ch = s2.charAt(i);
            count[ch - 'a']++;
        }
        for(int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            if (count[ch - 'a'] > 0){
                return "YES";
            }
        }
        return "NO";
    }

}
