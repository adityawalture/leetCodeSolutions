class Solution {
    public int minOperations(int[] nums, int x) {
        long sum = 0 ; 
        int n = nums.length ; 
        for(int i = 0 ; i<n;i++)sum+=nums[i] ; 
        if(sum==x) return n ; 

        int l = 0 , r =   0 ; 
        int ans = Integer.MAX_VALUE ; 

        while(r<n){
            sum-=nums[r] ; 
            while(sum <=x && l < n ){
                if(sum==x)ans = Math.min(ans , n - (r - l + 1) );
                sum+=nums[l] ; 
                l++ ; 
            }
            r++ ; 
        }
        return ans == Integer.MAX_VALUE  ? -1 : ans ;
    }
}