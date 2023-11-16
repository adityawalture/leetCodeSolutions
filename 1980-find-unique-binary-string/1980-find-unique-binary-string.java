class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int len = nums.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++){
            char c = nums[i].charAt(i);
            sb.append((c=='0') ? '1' :'0');
        }
        return sb.toString();
    }
}