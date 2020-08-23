package hackerrank.string;

public class CamelCase {


    public static void main(String args[]) {
        String str = "oneTwoThree";
        System.out.println(camelcase(str));
    }

    static int camelcase(String str) {

        char arr[] = str.toCharArray();
        int count = 1;
        for(int i=0; i<arr.length; i++) {
            if(Character.isUpperCase(arr[i])) {
                count = count + 1;
            }
        }
        return count;
    }

}
