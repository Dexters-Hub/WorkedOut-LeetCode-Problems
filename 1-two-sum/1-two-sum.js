/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const hash = {}
    
    let complement=0;
    
    for(let i=0; i< nums.length; i++){
        complement = target - nums[i]
        
        if(hash[complement] != undefined){
            return [hash[complement],i] 
        }
        hash[nums[i]] = i
    }
};