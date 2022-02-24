class Solution {
    public int rob(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        return Math.max(helper(nums, 0, nums.length - 2),
                        helper(nums, 1, nums.length - 1));
    }
    
    private int helper(int[] nums, int lo, int hi) {
        
        int rob = 0, notrob = 0;
        for (int i = lo; i <= hi; i++) {
            
            int temp = notrob;
            notrob = Math.max(notrob, rob);
            rob = temp + nums[i];
        }
        
        return Math.max(rob, notrob);
    }
    
}