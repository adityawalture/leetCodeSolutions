class Solution {
    public int[] findArray(int[] pref) {
        int n=pref.length;
        int res[] = new int[n];
        if(n==0)
            return res;
        res[0]=pref[0];
        int repVal=pref[0];
        for(int i=1;i<n;i++){
            int ans=repVal^pref[i];
            res[i]=ans;
            repVal=repVal^ans;
        }
        return res;
    }
}