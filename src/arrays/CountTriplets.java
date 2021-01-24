package arrays;

public class CountTriplets {

    public static void main(String args[]) {
        int arr[] = new int[]{1,5,3,2};
        int n = 4;
        int count = new CountTriplets().countTriplets(arr, n);
        System.out.println("Result count : " + count);
    }

    private int countTriplets(int arr[], int n){

        int []freq = new int[100];

        // Loop to count the frequency
        for (int i = 0; i < n; i++){
            freq[arr[i]]++;
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(freq[arr[i] + arr[j]] > 0){
                    count++;
                }
            }
        } // {1,5,3,2};
        return count;
    }
}
