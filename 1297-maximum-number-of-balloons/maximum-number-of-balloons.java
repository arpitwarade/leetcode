class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> have = new HashMap<>();
        Map<Character,Integer> need = new HashMap<>();
        need.put('b',1);
        need.put('a',1);
        need.put('l',2);
        need.put('o',2);
        need.put('n',1);
        for(int i =0; i<text.length(); i++){
            char ch = text.charAt(i);
            have.put(ch, have.getOrDefault(ch,0)+1);
        }
        int minimum = Integer.MAX_VALUE;
        for(Character key : need.keySet()){
            int n = need.get(key);
            int h = have.getOrDefault(key,0);
            int s = h/n;
            minimum = Math.min(minimum,s);
        }
        return minimum;
    }
}