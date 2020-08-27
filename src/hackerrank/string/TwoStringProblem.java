package hackerrank.string;


// Not completed*********************************************
public class TwoStringProblem {


    public static void main(String args[]) {
        String str = "madamk";
        int i=0;
        int j=str.length()-1;
        boolean flag = true;
        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if(flag == false) {
            System.out.println("No");
        }else if(flag == true) {
            System.out.println("Yes");
        }

    }



}
