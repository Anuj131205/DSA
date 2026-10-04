 // Optimal Solution :  Time O(n) and use O(1) Space.
class Solution {
    public int firstMissingPositive(int[] nums) {
        // Loop 1 : Clean the Array
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= 0 || nums[i] > nums.length){
                nums[i] = nums.length + 1;
            }
        }

        //Loop 2 : Mark the Presence
        for(int i = 0; i < nums.length; i++){
            int num = Math.abs(nums[i]);
            if(num > nums.length){
                continue;
            }
            if(nums[num-1] > 0){
                nums[num-1] = -nums[num-1];
            }
        }
        // Loop 3 : Find the First missing Positive
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}