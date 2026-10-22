class Solution {
    public String toLowerCase(String s) {
        int n = s.length();
        for(int i = 0; i < n; i++){
            s = s.toLowerCase();
        }
        return s;
    }
}