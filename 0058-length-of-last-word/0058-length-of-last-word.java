class Solution {
    public int lengthOfLastWord(String word) {
        word = word.trim();
        int count = 0;
        
        for (int i = word.length() - 1; i >=0; i--){
            char c = word.charAt(i);
            if(c != ' '){
                count ++;
            }else{
                break;
            }
           
        }
         return count;
    }
}