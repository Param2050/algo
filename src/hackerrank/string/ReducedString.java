package hackerrank.string;

public class ReducedString {


    public static void main(String args[]) {
        String str = "baab";
        System.out.println(superReducedString(str));
    }

    static String superReducedString(String str) {

        char arr[] = str.toCharArray();

        int n = arr.length;

        if(n == 2) {
            if(arr[0] == arr[1]) {
                return "Empty String";
            }
        }

        String outputString = "";

        for(int i=0; i<n-1; i++) {
            if(arr[i] == arr[i+1]) {
                i = i+1;
                continue;
            }
            else if(arr[i] != arr[i+1]) {
                outputString = outputString + arr[i];
            }
        }

        if(arr[n-2] == arr[n-1]) {
            outputString = outputString + arr[n-1];
        }

    return outputString;
    }

}
