class Solution {
    public String frequencySort(String s) {
       Map<Character, Integer> mp = new HashMap<>();
       for(int i =0; i<s.length(); i++){
        mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);
       }
       List<Character> ls = new ArrayList<>(mp.keySet());

       Collections.sort(ls, (a,b)-> mp.get(b)-mp.get(a));
       StringBuilder sb = new StringBuilder();
       for(char ch : ls){
        for(int i = 0; i<mp.get(ch); i++){
            sb.append(ch);
        }
       }

        return sb.toString();
    }
}