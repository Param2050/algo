package hackerrank.string;

public class GameOfThrones1 {

    public static void main(String args[]) {
        String str = "cdefghmnopqrstuvw";
        System.out.println(gameOfThrones1(str));
    }

    static String gameOfThrones1(String str) {
        int c1[] = new int[26];
        int odd = 0;
        for(int i=0; i<str.length(); i++) {
            c1[str.charAt(i) - 'a']++;
        }

        for(int i=0; i<c1.length; i++) {
            if(c1[i]%2 != 0) {
                odd++;
            }
        }
        if(odd == 0 || odd == 1)
        return "YES";

        return "NO";
    }

}
