class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if(nums == null || nums.length == 0) return false;
        
        Set<Integer> set = new HashSet<>();
        int l = nums.length;
        for(int i=0; i<l; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        
        return false;
        
    }
}