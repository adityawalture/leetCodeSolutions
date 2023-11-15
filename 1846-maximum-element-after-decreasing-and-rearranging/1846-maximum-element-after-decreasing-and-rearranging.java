class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int len = arr.length;
        int[] counter = new int[len];
        
        for(int i=0; i<len; i++){
            ++counter[Math.min(arr[i]-1, len-1)];
        }
        
        int ans = 1;
        for(int i=1; i<len; i++){
            ans = Math.min(i+1, ans + counter[i]);
        }
        return ans;
    }
}