package dp.unbounded;

public class CoinChangeMaxNoOfWays {

    public static void main(String args[]) {
        int coin [] = {1,2,5};
        int N = 5;
        System.out.println(new CoinChangeMaxNoOfWays().maxNoOfWays(coin, N));
    }

    private int maxNoOfWays(int[] coin, int N) {

        int arrSize = coin.length;
        int t[][] = new int[arrSize +1][N+1];

        for(int i=0;i<=N;i++)
            t[0][i] = 0;

        for(int i=1;i<=arrSize;i++)
            t[i][0] = 1;

        for(int i=1; i<=arrSize; i++) {
            for(int j=1; j<=N; j++) {

                if(coin[i-1] <= j) {
                    t[i][j] = t[i][j - coin[i-1]] + t[i-1][j];
                }
                else {
                    t[i][j] = t[i-1][j];
                }

            }
        }
        return t[arrSize][N];
    }
}
