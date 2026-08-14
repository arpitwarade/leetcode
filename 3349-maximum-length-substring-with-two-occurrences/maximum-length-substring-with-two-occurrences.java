class Solution {
    public int maximumLengthSubstring(String s) {
        int low = 0;
        int res = 0;
        Map<Character,Integer> mp = new HashMap<>();
        for(int high = 0; high<s.length(); high++){
            char ch = s.charAt(high);
            mp.put(ch,mp.getOrDefault(ch, 0)+1);

            while(mp.get(ch) > 2){
                char ch1 = s.charAt(low);
                mp.put(ch1,mp.getOrDefault(ch1,0)-1);
                low++;
                if(mp.get(ch1) == 0){
                    mp.remove(ch1);
                }
            }
            int temp = high-low+1;
            res = Math.max(temp,res);
        }
        return res;
    }
}