package hackerrank.string;

import java.util.Arrays;

public class StrongPassword {


    public static void main(String args[]) {
        String str = "Ab1";
        int n = minimumNumber(str.length(), str);
        System.out.println(n);
    }

    static int minimumNumber(int n, String password) {

        int MAX_LEN = 6;
        boolean specialChar = false;
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean isDigit = false;

        String regix = "!@#$%^&*()-+";

        int count = 4;

        char arr[] = password.toCharArray();

        for(int i=0; i<n; i++) {
            String s = String.valueOf(arr[i]);
            if(regix.contains(s)){
                specialChar = true;
            } else if(Character.isLowerCase(arr[i])) {
                lowerCase = true;
            } else if(Character.isUpperCase(arr[i])) {
                upperCase = true;
            }
            else if(Character.isDigit(arr[i])) {
                isDigit = true;
            }
        }

        if(specialChar == true) {
            count = count - 1;
        }
        if(lowerCase == true) {
            count = count - 1;
        }
        if(upperCase == true) {
            count = count - 1;
        }
        if(isDigit == true) {
            count--;
        }

        return Integer.max(count, MAX_LEN-n);

    }

}
