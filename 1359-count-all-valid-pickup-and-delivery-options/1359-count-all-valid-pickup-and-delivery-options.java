class Solution {
    public int countOrders(int n) {
        long count = 1;
        int mod = 1000000007;
        
        for(int i =2; i <=n; i++){
            count = (count *(2* i-1) * i) % mod;
        }
        return (int) count;
    }
}