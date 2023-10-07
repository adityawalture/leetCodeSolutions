class Solution {
    public int numOfArrays(int n, int m, int k) {
        final int MOD = 1000000007;
        long[][][] dp = new long[n+1][m+1][k+1];
        
        for(int i=1; i<= m; i++){
            dp[1][i][1] = 1;
        }
        
        for(int len=2; len <= n; len++){
            for(int maxVal=1; maxVal <= m; maxVal++){
                for(int cost=1; cost<=k; cost++){
                    long sum = 0;
                    for(int i=1; i<maxVal; i++){
                        sum = (sum + dp[len-1][i][cost-1]) % MOD;
                    }
                    dp[len][maxVal][cost] = (dp[len-1][maxVal][cost] * maxVal + sum) % MOD;
                }
            }
        }
        
        long ans = 0;
        for(int i=1; i<=m; i++){
            ans = (ans + dp[n][i][k]) % MOD;
        }
        
        return (int) ans;
    }
}