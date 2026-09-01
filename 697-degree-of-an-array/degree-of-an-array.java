class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int answer = nums.length;
    
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // first occurrence
            if (!first.containsKey(num)) {
                first.put(num, i);
            }
            // frequency
            count.put(num, count.getOrDefault(num, 0) + 1);
            // degree
            degree = Math.max(degree, count.get(num));
        }

        // Last occurrence + answer
        HashMap<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            last.put(nums[i], i);
        }
        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                int length = last.get(num) - first.get(num) + 1;
                answer = Math.min(answer, length);
            }
        }
        return answer;
    }
}