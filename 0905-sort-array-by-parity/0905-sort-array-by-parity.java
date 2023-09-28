class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even = 0, odd = nums.length - 1;
        while(even < odd){
            if(nums[even]%2 > nums[odd]%2){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
            if(nums[even]%2 == 0) even++;
            if(nums[odd]%2 == 1) odd--;
        }
        return nums;
    }
}