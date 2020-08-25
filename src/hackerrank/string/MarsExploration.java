package hackerrank.string;

public class MarsExploration {

    public static void main(String args[]) {
        String str = "SOTSOSSRS";
        int result = marsExploration(str);
        System.out.println(result);
    }

    static int marsExploration(String s) {

        String marsSignal = "SOS";
        int changedCount = 0;
        int j = 0;
        for (char ch : s.toCharArray()) {
            if(ch != marsSignal.charAt(j++)) {
                changedCount++;
            }
            if(j == 3) {
                j = 0;
            }
        }
        return changedCount;
    }

}