class Solution {
    public int numberOfMatches(int n) {
        int match = 0 ;
        if(n == 1){
            return 0 ;
        }
        if(n%2 == 0){
            match =  n/2;
            n = n/2;

            
        }
        else{
            match =  (n -1)/2;
            n = (n-1)/2+1;

        }
         match += numberOfMatches(n);
        return match;
    }
}