class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                st.push(s.charAt(i));
            } else if (!st.empty()) {
                st.pop();
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                st1.push(t.charAt(i));
            } else if (!st1.empty()) {
                st1.pop();
            }
        }

        return st.equals(st1);
    }
}