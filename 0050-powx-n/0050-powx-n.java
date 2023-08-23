class Solution {
    public double myPow(double x, int n) {
        return solve(x, (long) n);
    }
    private double solve(double x, long n){
            if(n == 0){
                return 1;
            }
            
            if(n < 0){
                return solve(1/x , -n);
            }
            
            if(n%2 == 1){
                return x * solve(x * x, (n-1)/2);
            }else{
                return solve(x * x, n/2);
            }
        }
}