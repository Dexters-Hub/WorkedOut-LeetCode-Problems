class Solution {
    public int maxSubArray(int[] nums) {
        int currentMaxSum = nums[0];
        int maxSum = nums[0];
        
        for(int i = 1; i< nums.length; i++){
            currentMaxSum = Math.max(currentMaxSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentMaxSum);
        }
        
        return maxSum;
    }
}