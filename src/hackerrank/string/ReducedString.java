package hackerrank.string;

public class ReducedString {


    public static void main(String args[]) {
        String str = "aaabccddd";
        String result = superReducedString(str);
        System.out.println(result);
    }

    static String superReducedString(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < str.length() - 1; ++i) {

                if (str.charAt(i) == str.charAt(i + 1)) {
                    str.delete(i, i + 2);
                    flag = true;

                }
            }
        }

        if (str.length() == 0) {
            return "Empty String";
        } else {
            return str.toString();
        }
    }

}
