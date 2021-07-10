package dp.unbounded;

public class RodCuttingProblem {

    public static void main(String args[]) {
//        int price[] = {1,5,8,9,10,17,17,20};
        int price[] = {3,5,8,9,10,17,17,20};
        int N = 8;
        int lengthArray[] = new int[N];
        for(int i=1;i <=N; i++) {
            lengthArray[i-1] = i;
        }
        System.out.println(new RodCuttingProblem().rodCuttingProblem(lengthArray, price, N));
    }

    private int rodCuttingProblem(int[] lengthArray, int[] price, int N) {
        int arrSize = lengthArray.length;
        int t[][] = new int[arrSize +1][N+1];

        for(int i=0; i<=arrSize; i++) {
            for(int j=0; j<=N; j++) {

                if(i == 0 || j == 0) {
                    t[i][j] = 0;
                }

                else if(lengthArray[i-1] <= j) {
                    t[i][j] = Math.max(price[i-1] + t[i][j - lengthArray[i-1]], t[i-1][j]);
                }
                else {
                    t[i][j] = t[i-1][j];
                }

            }
        }

        return t[arrSize][N];
    }


}
