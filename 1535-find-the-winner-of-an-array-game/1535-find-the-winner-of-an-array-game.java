class Solution {
    public int getWinner(int[] arr, int k) {
        int winner = arr[0];
        int win_cnt = 0; 

        for(int i=1; i<arr.length; i++){
            if(winner>arr[i]){
                win_cnt++;
            }
            else{
                win_cnt = 1;
                winner= arr[i];
            }

            if(win_cnt == k) break;
        }
        return winner;
    }
}