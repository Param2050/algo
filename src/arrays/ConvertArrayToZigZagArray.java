package arrays;

public class ConvertArrayToZigZagArray {
    public static void main(String args[]) {
        int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
        int n = arr.length;
        convertToZigZagArray(arr, n);
        System.out.println("Convert Array to zig-zag array ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void convertToZigZagArray(int arr[], int n) {

        boolean flag = true;

        for(int i=0; i<n-1; i++) {
            if(flag) {

                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            } else {

                if(arr[i] < arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag;
        }

    }

}
