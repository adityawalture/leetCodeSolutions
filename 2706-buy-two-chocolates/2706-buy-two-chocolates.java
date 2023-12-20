class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum = prices[0]+prices[1];
        int debt = money - sum;
        if(debt >=0){
            return debt;
        }else{
            return money;
        }
    }
}