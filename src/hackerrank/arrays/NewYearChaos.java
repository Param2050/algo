package hackerrank.arrays;


public class NewYearChaos {
    public static void main(String args[]) {
     int arr [] = new int[] {2, 1, 5, 3, 4};
     minimumBribes(arr);
    }

    // {1,2,3,4,5}
    static void minimumBribes(int[] arr) {
        int swapCount = 0;
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] != (i+1)) {
                if(arr[i-1] == (i+1)) {
                    swapCount++;
                    swap(arr, i-1, i);
                }else if(arr[i-2] == (i+1)) {
                    swapCount = swapCount+2;
                    swap(arr, i-2, i-1);
                    swap(arr, i-1, i);
                }else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swapCount);
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
