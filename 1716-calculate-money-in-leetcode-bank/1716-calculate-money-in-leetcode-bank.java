class Solution {
    public int totalMoney(int n) {
        int amt=0,m=1;
        while(n>0){
            for(int i=0;i<Math.min(n,7);i++){
                amt+=i+m;
            }
            n=n-7;
            m++;
        }
        return amt;
    }
}