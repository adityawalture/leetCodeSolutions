class Solution {
    public int countHomogenous(String s) {
        int left = 0;
        long res = 0;
        char c[]=s.toCharArray();
        for (int right = 0; right < c.length; right++) {
            if(c[right]==c[left]){
                res+=right-left+1;
            }else{
                res += 1;
                left = right;
            }
        }

        return (int) (res % (1000000007));
    }
}