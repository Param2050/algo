package binarysearch;

public class SquareRootOfAnInteger {
    
    public static void main(String args[]) {
        int x = 17;
        System.out.println(mySqrt(x));
    }

    private static int mySqrt(int x) {
        long start = 1;
        long end = x;
        long res = 0;

        while(start <= end) {
            long mid = start + (end-start)/2;

            if(mid*mid == x) {
                return (int)mid;
            }
            else if(mid*mid < x) {
                start = mid+1;
                res = mid;
            }
            else {
                end = mid-1;
            }
        }
        return (int)res;
    }

}
