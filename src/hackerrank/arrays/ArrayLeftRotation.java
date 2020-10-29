package hackerrank.arrays;

public class ArrayLeftRotation {

    public static void main(String args[]) {
     int d = 2;
     int arr [] = new int[] {1,2,3,4,5};
     int res[] = rotLeft(arr, d);
     for(int i=0; i<res.length; i++)
        System.out.print(res[i] + " ");
    }

    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int temp[] = new int[n];
        int pivot = n-d;
        int start = n-pivot;
        for(int j=0,i=pivot; i<n && j<n; i++,j++) {
            temp[i] = a[j];
        }

        for(int i=start, j=0; i<n && j<n; j++, i++) {
            temp[j] = a[i];
        }
        return temp;
    }
}
