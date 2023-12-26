class Solution {
    static int MOD = (int) (1e9 + 7);
    int[][] dp;
    public int numRollsToTarget(int n, int k, int target) {
        dp = new int[n+1][target + 1];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        return f(n, k, target);
    }

    int f(int n, int k, int tar) {
        if (n == 0 || tar <= 0) {
            return (tar == 0 && n == 0) ? 1 : 0;
        }
        if (dp[n][tar] !=-1) return dp[n][tar];
        int ans = 0;
        for (int i = 1; i <= k; i++) {
            ans = (ans + f(n - 1, k, tar - i)) % MOD;
        }
        return dp[n][tar] = ans % MOD;
    }
}