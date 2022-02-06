class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int len = nums.length;
        int multiLeft = 1;
        
        for(int i=0; i< nums.length; i++){
            result[i] = multiLeft;
            multiLeft *= nums[i];
        }
        
        int multiRight = 1;
        
        for(int i = len -1; i>=0; i--){
            result[i] *= multiRight;
            multiRight *= nums[i];
        }
        
        return result;
    }
}