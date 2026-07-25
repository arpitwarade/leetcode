class Solution {
    public String minWindow(String s, String t) {
        int []freqS = new int[256];
        int []freqT = new int[256];
         

         int n = s.length();
         int m = t.length();
         int low = 0;
         int match = 0;
         int start =0;
         int res = Integer.MAX_VALUE;

         if(m>n) return"";
         for(int i = 0; i<m; i++){
            freqT[t.charAt(i)]++;
         }
         for(int high = 0; high<n; high++){
            int ch =s.charAt(high);
            freqS[ch]++;

            if(freqS[ch]<=freqT[ch]){
                match++;
            }

            while(match == m){
                if(high-low+1<res){
                    res = high-low+1;
                    start = low;
                }
               char left = s.charAt(low);
                freqS[left]--;

                if (freqS[left] < freqT[left]) {
                    match--;
                }

                low++;
            }

         }
           return res == Integer.MAX_VALUE ? "" : s.substring(start, start + res);
    }
}