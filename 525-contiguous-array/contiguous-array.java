class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        int zero = 0;
        int one = 0;
        int result = 0;

        // diff = 0 is present before array starts
        freq.put(0, -1);

        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] == 0){
                zero++;
            }
            else {
                one++;
            }
            int diff = zero - one;
            if(freq.containsKey(diff)) {

                int idx = freq.get(diff);
                int len = i - idx;
                result = Math.max(result,len);
            }
            else {
                // Store only first occurrence
                freq.put(diff, i);
            }
        }
        return result;
    }
}