class Solution {
    public String minRemoveToMakeValid(String s) {
        int size = s.length();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<size; i++){
         if(s.charAt(i) == '('){
             sb.append(s.charAt(i));
              cnt++;
         }   
         else if(s.charAt(i) == ')' && cnt > 0){
            sb.append(s.charAt(i));
            cnt--;
         }
         else if(s.charAt(i) != ')')
         {
            sb.append(s.charAt(i));
         }
        }
        StringBuilder newsb = new StringBuilder();
        for(int i = sb.length()-1; i>=0; i--){
            if(sb.charAt(i) == '(' && cnt>0){
                cnt--;
            }
            else{
                newsb.append(sb.charAt(i));
            }
        }        
        return newsb.reverse().toString();
    }
}