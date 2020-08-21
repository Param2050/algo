package string;

public class ReverseWordsInAString {

    public static void main(String args[]) {
        String str = "i like this program very much";
        String strArr[] = str.split(" ");
        String result = "";
        for(int i= strArr.length-1; i>=0 ; i--) {
            result = result + " " + strArr[i];
        }
        System.out.println("Reversed string is : " + result);
    }

}
