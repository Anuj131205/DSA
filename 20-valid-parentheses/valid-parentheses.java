class Solution {
    public boolean isValid(String s) {
            int n = s.length();
            if (n % 2 != 0) return false;

            Stack<Character> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                // Opening brackets
                if (ch == '(' || ch == '[' || ch == '{') {
                    st.push(ch);
                } 
                // Closing brackets
                else {
                    if (st.isEmpty()) return false;
                    char top = st.peek();

                    if (sameStyle(top, ch)) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }

            return st.isEmpty();
        }

        static boolean sameStyle(char a, char b) {
            if (a == '(' && b == ')') return true;
            if (a == '[' && b == ']') return true;
            if (a == '{' && b == '}') return true;

            return false;
        }
    }





/*
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || 
                    stack.pop() != map.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
*/