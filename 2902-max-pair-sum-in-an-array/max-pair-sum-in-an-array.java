// Optimal Solution :- O(n)
class Solution {
    public int maxSum(int[] nums) {
        int[] max = new int[10];
        Arrays.fill(max, -1);
        int ans = -1;

        for (int num : nums) {
            int d = getMaxDigit(num);

            // Same maximum digit wala number already mila hai
            if (max[d] != -1) {
                ans = Math.max(ans, num + max[d]);
            }
            // Is digit-category ka largest number store karo
            max[d] = Math.max(max[d], num);
        }
        return ans;
    }

    private int getMaxDigit(int num) {
        int maxDigit = 0;

        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        }
        return maxDigit;
    }
}


