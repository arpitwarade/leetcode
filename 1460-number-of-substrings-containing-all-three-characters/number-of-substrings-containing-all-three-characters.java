class Solution {
    public int numberOfSubstrings(String s) {
        int lastA = -1;
        int lastB =  -1;
        int lastC = -1;
        int ans = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if('a' == ch){
                lastA = i;
            }
            else if('b' == ch){
                lastB = i;
            }
            else
            {
                lastC = i;
            }

            if(lastA != -1 && lastB != -1 && lastC != -1){
                int z = Math.min(lastA, Math.min(lastB, lastC));
                 ans += z+1;
            }
            
        }
        return ans;
    }
}