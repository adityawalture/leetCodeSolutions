class Solution {
    public int minOperations(String s) {
        int count1 = 0, count2 = 0;
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            if(c[i] != (i % 2 == 0 ? '0' : '1')){
                count1++;
            }
            if(c[i] != (i % 2 == 0 ? '1' : '0')){
                count2++;
            }
        }
        return Math.min(count1, count2);
    }
}