class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int start = 0;
        int end = n;
        
        for(int i =0; i<nums.length; i+=2){
            
            arr[i] = nums[start];
            arr[i+1] = nums[end];
            start++;
            end++;
        }
        
        return arr;
    }
}