class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n; i++){
            if(!st.empty() && st.peek() == s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.peek());
            st.pop();
        }
        String s1 = sb.reverse().toString();
        return s1;
        
    }
}