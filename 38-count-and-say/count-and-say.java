class Solution {

   public String count(String s){
        StringBuilder sb = new StringBuilder();
        char ch = s.charAt(0);
        int cnt = 1;
        for(int i =1; i<s.length(); i++){
            if(s.charAt(i) == ch){
                cnt++;
            }
            else{
                sb.append(cnt);
                sb.append(ch);
                cnt = 1;
                ch = s.charAt(i);
            }
        }
        sb.append(cnt);
        sb.append(ch);
        return sb.toString();
    }
    public String countAndSay(int n) {
        String s ="1";

        for(int i = 2; i<=n; i++){
           s = count(s);
        }     
        return s;
    }
}