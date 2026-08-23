class Solution {
    public int maxVowels(String s, int k) {
        int vowels = 0;
        int low = 0;
        int length = Integer.MIN_VALUE;
        Map<Character, Integer> mp = new HashMap<>();
        for(int high = 0; high<s.length(); high++){
            if(s.charAt(high) == 'a'||s.charAt(high) == 'e'||s.charAt(high) == 'i'||s.charAt(high) == 'o'||s.charAt(high) == 'u'){
                mp.put(s.charAt(high), mp.getOrDefault(s.charAt(high), 0)+1);
                vowels++;
            }
            else{
                mp.put(s.charAt(high),mp.getOrDefault(s.charAt(high),0)+1);
            }
            int res =(high -low)+1;
            if(res > k){
                if(s.charAt(low) == 'a' ||s.charAt(low) == 'e' ||s.charAt(low) == 'i' ||s.charAt(low) == 'o' ||s.charAt(low) == 'u' ){
                    vowels--;
                }
                mp.put(s.charAt(low),mp.getOrDefault(s.charAt(low),0)-1);
                if(mp.get(s.charAt(low))==0){
                    mp.remove(s.charAt(low));
                }
                low++;
            }
            length = Math.max(vowels, length);
        }
        return length;
        
    }
}