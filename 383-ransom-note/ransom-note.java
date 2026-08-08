class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Map<Character, Integer> rNote = new HashMap<>();
        Map<Character, Integer> mNote = new HashMap<>();

        int r = ransomNote.length();
        int m = magazine.length();
        for(int i = 0; i<m; i++){
            char ch = magazine.charAt(i);
            mNote.put(ch,mNote.getOrDefault(ch,0)+1);
        }

        for(int i = 0; i<r; i++){
            char ch = ransomNote.charAt(i);
            if(mNote.containsKey(ch)){
                mNote.put(ch, mNote.getOrDefault(ch, 0) - 1);
                if(mNote.get(ch) == 0){
                    mNote.remove(ch);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}