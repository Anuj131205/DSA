class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            HashSet<Integer> set = new HashSet<>();
           // int sum = 0;
            for(int j = i; j < nums.size(); j++){
                set.add(nums.get(j));
                 int ans = set.size();
                 sum += ans * ans;
            }
        }
        return sum;
    }
}