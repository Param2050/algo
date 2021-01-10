package leetcode;


public class PlusOne {

    public static void main(String args[]) {
        int arr[] = new int[] {9,9,9};
        int result [] = new PlusOne().plusOne(arr);
        System.out.println(result);
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;

        for(int i=len-1; i>= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int newArr[] = new int[len+1];
        newArr[0] = 1;
        return newArr;
    }

}
