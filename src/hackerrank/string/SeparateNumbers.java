package hackerrank.string;

public class SeparateNumbers {

    public static void main(String args[]) {
        separateNumbers("101103");
    }

    private static void separateNumbers(String str) {
        boolean valid = false;
        long firstx = -1;
        long len = str.length()/2;
        for(int i=1; i <= len; i++) {
            long x = Long.parseLong(str.substring(0, i));
            firstx = x;

            String test = Long.toString(x);

            while (test.length() < str.length()) {
                test += Long.toString(++x);
            }

            if(test.equals(str)) {
                valid = true;
                break;
            }
        }
        System.out.println(valid ? "YES " + firstx : "NO");
    }
}
