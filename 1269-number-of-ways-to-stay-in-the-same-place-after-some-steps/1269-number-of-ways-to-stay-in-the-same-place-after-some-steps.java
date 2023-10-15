class Solution {
    public int numWays(int steps, int arrLen) {
        int a = steps;
        int b = Math.min(steps/2+1, arrLen);
        
        int[][] dp = new int[a+1][b];
        dp[0][0] = 1;
        
        int mod = 1000000007;
            
            for(int i=1; i<=a; i++){
                for(int j=0; j<b; j++){
                    dp[i][j] = dp[i-1][j];
                    if(j>0){
                        dp[i][j] = (dp[i][j] + dp[i-1][j-1]) % mod;
                    }
                    if(j<b-1){
                        dp[i][j] = (dp[i][j] + dp[i-1][j+1]) % mod;
                    }
                }
            }
        return dp[a][0];
    }
}