class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int best = Integer.MAX_VALUE;

        for(int i =0; i< n; i++){
            if(words[i].equals(target)){
                int d = Math.abs(i-startIndex);
                best = Math.min(best, Math.min(d, n - d));
            }
        }       
        return best == Integer.MAX_VALUE ? -1 : best;
    }
}