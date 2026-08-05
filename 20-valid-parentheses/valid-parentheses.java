class Solution {
    public boolean isValid(String s) {
          int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i =0; i<n; i++){
            if(!st.empty() && 
            (((st.peek() == '(') && (s.charAt(i) == ')')) || 
            ((st.peek() == '[') && (s.charAt(i) == ']')) ||
            ((st.peek() == '{') && (s.charAt(i) == '}'))))
             {
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }       
        return st.empty();
    }
}