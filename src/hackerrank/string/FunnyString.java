package hackerrank.string;


// Not completed*********************************************
public class FunnyString {

    public static void main(String args[]) {
        String str = "bcxz";
        System.out.println(funnyString(str));
    }

    static String funnyString(String str) {
        int n = str.length();
        int diff[] = new int[n-1];
        int refdiff[] = new int[n-1];

        for(int i=0; i<n-1; i++) {
            diff[i] = Math.abs(str.charAt(i) - str.charAt(i+1));
        }

        int j=0;
        for(int i=n-1; i>0; i--) {
            refdiff[j++] = Math.abs(str.charAt(i) - str.charAt(i-1));
        }

        for(int i=0; i<diff.length; i++) {
            if(diff[i] != refdiff[i]) {
                return "Not Funny";
            }
        }
        return "Funny";
    }

}
