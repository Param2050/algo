package arrays;

public class FindAnMissingNumber {
    public static void main(String args[]) {
        int arr[] = {1,2,3,5};
        int n = 5;
        new FindAnMissingNumber().findMissingNo(arr, n);
    }

    private void findMissingNo(int arr[], int n) {
        int sumOfGivenArray = 0;

        for(int i=0; i<n; i++) {
            sumOfGivenArray = sumOfGivenArray + arr[i];
        }

        for(int i=1; i<=n; i++) {

        }

    }
}
