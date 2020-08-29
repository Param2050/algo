package hackerrank.string;


// Not completed*********************************************
public class BeautifulBinaryString {

    public static void main(String args[]) {
        String str = "0100101010";
        System.out.println(beautifulBinaryString(str));
    }

    static int beautifulBinaryString(String str) {
        int len = str.length();
        int minCount = 0;
        int j=0;
        String binaryString = "010";
        for(int i=0; i<len; i++) {
            if(str.charAt(i) == binaryString.charAt(j)) {
                j++;
            } else if(str.charAt(i) != binaryString.charAt(j)) {
                j=0;
            }
            if(j == 3) {
                minCount++;
                j=0;
            }
        }
        return minCount;
    }

}
