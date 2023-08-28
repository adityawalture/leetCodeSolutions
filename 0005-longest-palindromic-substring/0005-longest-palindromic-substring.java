class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)return s;
        
        int max_length = 1;
        int n = s.length();
        int start = 0, end = 0;
        
        
        //odd length
        for(int i = 0; i < n-1; i++){
            int l = i, r = i;
            while(l >= 0 && r < n){
                if(s.charAt(l) == s.charAt(r)){
                    l--;r++;
                }else{
                    break;
                }
            }
            int len = r-l-1;
            if(len > max_length){
                max_length = len;
                start = l+1;
                end = r-1;
            }
        }
        
        //even length
        for(int i = 0; i < n-1; i++){
            int l = i, r = i+1;
            while(l >= 0 && r < n){
                if(s.charAt(l) == s.charAt(r)){
                    l--;r++;
                }else{
                    break;
                }
            }
            int len = r-l-1;
            if(len > max_length){
                max_length = len;
                start = l+1;
                end = r-1;
            }
        }
        return s.substring(start, end + 1);
    }
}