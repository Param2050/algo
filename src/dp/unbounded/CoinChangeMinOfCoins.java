package dp.unbounded;

public class CoinChangeMinOfCoins {

    public static void main(String args[]) {
        int coin [] = {2,3,4};
        int N = 10;
        System.out.println(new CoinChangeMinOfCoins().minNoOfCoins(coin, N));
    }

    private int minNoOfCoins(int[] coins, int N) {

        int arrSize = coins.length;
        int t[][] = new int[arrSize +1][N+1];

        for(int i=0;i<=N;i++)
            t[0][i] = Integer.MAX_VALUE-1;

        for(int i=1;i<=arrSize;i++)
            t[i][0] = 0;

        for(int i=1; i<=arrSize; i++) {
            for(int j=1; j<=N; j++) {

                if(coins[i-1] <= j) {
                    t[i][j] = Math.min(t[i][j - coins[i-1]] + 1, t[i-1][j]);
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[arrSize][N] != Integer.MAX_VALUE - 1 ? t[arrSize][N] : -1;
    }

}
