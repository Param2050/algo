package arrays;


//Given a sorted array of positive integers.
//Your task is to rearrange  the array elements alternatively i.e
//first element should be max value, second should be min value,
//third should be second max, fourth should be second min and so on...

public class ReArrangeArrayAlternatively {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        new ReArrangeArrayAlternatively().reArrangeArray(arr);
    }

    public void reArrangeArray(int arr[]) {
        int n = arr.length;

        int max_idx = n-1;
        int min_idx = 0;

        int max_elem = arr[n-1] + 1;

        for(int i=0; i<n; i++) {

            if(i%2 ==0) {
                arr[i] = arr[i] + ((arr[max_idx] % max_elem) * max_elem);
                max_idx--;
            }
            else {
                arr[i] = arr[i] + ((arr[min_idx] % max_elem) * max_elem);
                min_idx++;
            }
        }

        for(int i=0; i<n; i++)
            arr[i] = arr[i] / max_elem;

        for(int m=0;m<arr.length;m++)
            System.out.print(" "+ arr[m]);

    }

}
