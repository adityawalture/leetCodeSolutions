class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int mod = (int) 1e9+7;
        Arrays.sort(arr);
        int ans = 0;
        HashMap<Integer, Long> map = new HashMap<>();
        
        for(int i:arr){
            long ways = 1;
            int max = (int) Math.sqrt(i);
            
            for(int j=0, left = arr[0]; left <= max; left = arr[++j]){
                if(i % left !=0) continue;
                int right = i/left;
                if(map.containsKey(right)){
                    ways = (ways + map.get(left)*map.get(right)*(left==right ? 1:2)) % mod;
                }
            }
            
            map.put(i,ways);
            ans = (int)(ans + ways)%mod;
        }
        
        return ans;
    }
}