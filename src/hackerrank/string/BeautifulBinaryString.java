package hackerrank.string;

public class BeautifulBinaryString {

    public static void main(String args[]) {
        String str = "0100101010";
        System.out.println(beautifulBinaryString(str));
    }

    static int beautifulBinaryString(String str) {
        int len = str.length();
        int minStepsCount = 0;
        for(int i=0; i<=len-3;) {
            if(str.substring(i, i+3).equals("010")) {
                minStepsCount++;
                i=i+3;
            }else {
                i++;
            }
        }
        return minStepsCount;
    }

}
