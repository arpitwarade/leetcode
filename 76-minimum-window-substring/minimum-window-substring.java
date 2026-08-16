class Solution {
    public String minWindow(String s, String t) {
        int []freqS = new int[256];
        int []freqT = new int[256];

        int match =0;
        int start = 0;
        int low =0;
        int res = Integer.MAX_VALUE;
        int n = s.length();
        int m = t.length();
        if(n < m){
            return "";
        } 

        for(int i =0; i<m; i++){
            freqT[t.charAt(i)]++;
        }

        for(int j =0; j<n; j++){
            freqS[s.charAt(j)]++;

            if(freqS[s.charAt(j)] <= freqT[s.charAt(j)]){
                match++;
            }

            while(match == m){
                if(j-low+1<res){
                    res = j-low+1;
                    start =low;
                }
                char left = s.charAt(low);
                freqS[left]--;
                if(freqS[left] < freqT[left]){
                    match--;
                }
                low++;
            }            
        }
        return res == Integer.MAX_VALUE ? "" : s.substring(start, start+res);
            }
}