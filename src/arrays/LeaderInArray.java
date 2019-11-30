package arrays;

public class LeaderInArray {
    public static void main(String ar[]) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        new LeaderInArray().getLeader(arr);
    }

    private void getLeader(int arr[]) {
        int max_from_right_side = arr[arr.length-1];
        System.out.print(" "+ max_from_right_side);

        for(int i=arr.length-2; i>=0; i--) {
            if(max_from_right_side <= arr[i]) {
                System.out.print(" " + arr[i]);
                max_from_right_side = arr[i];
            }
        }
    }
}
