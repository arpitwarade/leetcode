class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> vmp = new HashMap<>();
        Map<Character, Integer> cmp = new HashMap<>();

        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch == 'u'){
                vmp.put(ch, vmp.getOrDefault(ch,0)+1);
            }
            else{
                cmp.put(ch, cmp.getOrDefault(ch,0)+1);
            }
        }
        PriorityQueue<Character> vq = new PriorityQueue<>((a,b) -> vmp.get(b) - vmp.get(a));
        PriorityQueue<Character> cq = new PriorityQueue<>((a,b) -> cmp.get(b) - cmp.get(a));
        for(char ch : vmp.keySet()){
            vq.add(ch);
        }
        for(char ch : cmp.keySet()){
            cq.add(ch);
        }
        int maxVowel = 0;
        int maxConsonant = 0;

        if (!vq.isEmpty()) {
            maxVowel = vmp.get(vq.peek());  
        }

        if (!cq.isEmpty()) {
            maxConsonant = cmp.get(cq.peek());
        }

        return maxVowel + maxConsonant;
    }
}