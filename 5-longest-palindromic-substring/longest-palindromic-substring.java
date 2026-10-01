class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            // Odd length palindrome
            int len1 = expand(s, i, i);
            // Even length palindrome
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);

            // If current palindrome is longer
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}





/*class Solution {
    int start = 0;
    int maxLen = 0;
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        for (int i = 0; i < s.length(); i++) {
            expandAround(s, i, i);
            expandAround(s, i, i + 1);
        }
        return s.substring(start, start + maxLen);
    }
    private void expandAround(String s, int left, int right) {
        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        int len = right - left - 1;
        if (len > maxLen) {
            maxLen = len;
            start  = left + 1;
        }
    }
}
*/