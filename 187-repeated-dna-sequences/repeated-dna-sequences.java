class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repetead = new HashSet<>();

        for(int i = 0; i <= s.length()-10; i++){

            String ch = s.substring(i, i+10);

            if(seen.contains(ch)){
                repetead.add(ch);
            }
            else{
                seen.add(ch);
            }
        }
        return new ArrayList<>(repetead);
    }
}