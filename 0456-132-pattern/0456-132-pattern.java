class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack();
        int j = Integer.MIN_VALUE;
        
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]<j) return true;
            while(!st.isEmpty() && st.peek() < nums[i]){
                j = st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}