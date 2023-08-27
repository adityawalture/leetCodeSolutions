class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        char[] ch = str.toCharArray();
        
        int idx = 0;
        int sign = 1;
        
        long ans = 0;
        
        if(idx < ch.length && (ch[idx] == '+' || ch[idx] == '-')){
            sign = ch[idx] == '-' ? -1 : 1;
            idx ++;
        }
        
        while(idx < str.length() && Character.isDigit(ch[idx])){
            int d = ch[idx] - '0';
            ans = ans*10 + d;
            
            if(ans > Integer.MAX_VALUE){
                return(sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            idx ++;
        }
        
        return (int)ans*sign;
    }
}