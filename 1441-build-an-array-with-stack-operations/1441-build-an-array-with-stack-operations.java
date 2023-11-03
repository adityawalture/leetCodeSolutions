class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int i=0, t=1;
        
        while(t <= n){
            while(t++ != target[i]){
                ans.add("Push");
                ans.add("Pop");
            }
            i++;
            ans.add("Push");
            if(i == target.length) break;
        }
        
        return ans;
    }
}