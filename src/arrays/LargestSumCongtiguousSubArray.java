package arrays;

public class LargestSumCongtiguousSubArray {
    public static void main(String args[]) {
        int arr[]= {-2, -3, 4, -1, -2, 1, 5, -3};
        new LargestSumCongtiguousSubArray().findSubArray(arr);
    }

    private void findSubArray(int arr[]) {
        int curr_sum = 0;
        int max_so_far = 0;

        // iterate each element of an array
        for(int i=0; i<arr.length; i++) {
            curr_sum = curr_sum + arr[i];

            // Set curr_sum as zero if curr_sum is negative
            // Means we need only positive integers

            if(curr_sum < 0 ){
                curr_sum = 0;
            }
            // If curr_sum is greater than max_so_far
            // then update max_so_far with the value of curr_sum
            else if(max_so_far < curr_sum) {
                max_so_far = curr_sum;
            }

        }

        System.out.println("Largest Sum Contiguous SubArray is " + max_so_far);

    }

}
