class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0,right = 0,result = 0;
        long sum = 0;

        while (right < nums.length) {
            sum += nums[right];

            // Calculate the operations needed to make all elements in the window equal
            long operations = (long) nums[right] * (right - left + 1) - sum;

            if (operations > k) sum -= nums[left++];

            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;  
    }
}