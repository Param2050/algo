package hackerrank.warmup;

public class CountingValleys {

    public static void main(String args[]) {
        int steps = 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(steps, path));
    }

    public static int countingValleys(int steps, String path) {
        int indexValue = 0;
        int valleyCount = 0;
        for(int i=0; i<steps; i++) {
            if(path.charAt(i) == 'D') {
                indexValue--;
            } else if(path.charAt(i) == 'U') {
                indexValue++;
            }
            if(path.charAt(i) == 'U' && indexValue == 0) {
                valleyCount++;
            }
        }
        return valleyCount;
    }

}
