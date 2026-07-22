class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++ ){
            if((s.charAt(i)>= 'A' && s.charAt(i)<= 'Z') ||(s.charAt(i)>= 'a' && s.charAt(i)<= 'z')||(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int fIdx=0;
        int lIdx = sb.length()-1;
        if(sb.length() ==0){
            return true;
        }
      while(fIdx < lIdx){
        if(sb.charAt(fIdx) !=sb.charAt(lIdx)){
                return false;
            }
            else{
                fIdx++;
                lIdx--;
            }

      }
      return true;
            
    }
}