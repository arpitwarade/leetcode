// class Solution {
//     public int longestValidParentheses(String s) {
//         Stack st = new Stack();
//         int currentCount = 0;
//         int tempCount = 0;
//         int maxCount = 0;
//         for(int i = 0; i<s.length();i++){
//             if(s.charAt(i) == '('){
//                 st.push(s.charAt(i));
//             }
//             else{
//                 if(!st.empty()){
//                     st.pop();
//                     currentCount += 2;
//                 }
//                 else{
//                     currentCount = 0;
//                     st.clear();
//                 }
//             }
//             maxCount = Math.max(maxCount, currentCount);
//         }
//      return maxCount;   
//     }
// }

class Solution {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') left++;
            else right++;

            if(left == right){
                maxLength = Math.max(maxLength, 2 * right);
            }
            else if(right > left){
                left = right = 0;
            }
        }

        left = right = 0;
       for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '(') left++;
            else right++;

            if(left == right){
                maxLength = Math.max(maxLength, 2 * left);
            }
            else if(left > right){
                left = right = 0;
            }
        }

        return maxLength;
    }
}