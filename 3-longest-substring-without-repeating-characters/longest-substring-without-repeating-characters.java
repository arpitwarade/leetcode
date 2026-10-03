class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        int low = 0;
        int res = 0;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0)+1);

            int length = i- low +1;
            while(length > mp.size()){
                char ch = s.charAt(low);
                mp.put(ch, mp.getOrDefault(ch,0)-1);
                if(mp.get(ch) == 0){
                    mp.remove(ch);
                }
                low++;
                length = i-low+1;
            }
            res = Math.max(res, mp.size());
        }
        return res;
    }
}