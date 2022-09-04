class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            runningSum[i] = sum(nums, i+1);
        }
        
        return runningSum;
    }
    
    int sum(int[] arr, int n){
        int sum=0;
        
        for(int i=0;i<n; i++){
            sum += arr[i];
        }
        
        return sum;
    }
}