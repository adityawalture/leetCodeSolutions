class Solution {
    public int minPairSum(int[] nums) {
        int[] arr = new int[100001];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            for (int k = 0; k < arr[i]; k++) {
                nums[j++] = i;
            }
        }
        
        int maxSum = 0;
        
        for (int i = 0; i < nums.length / 2; i++) {
            maxSum = Math.max(maxSum, nums[i] + nums[nums.length - 1 - i]);
        }
        System.gc();
        return maxSum;
    }
}