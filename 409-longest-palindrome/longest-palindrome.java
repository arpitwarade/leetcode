class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int even = 0;
        int length =0;
        for(Character  ch: map.keySet()){
            if((map.get(ch)%2) != 0){
                length += map.get(ch)-1;
                even = 1;
            }else{
                length += map.get(ch);
            }
        }
        length += even;
        return length;
        
    }
}