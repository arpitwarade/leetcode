class Solution {
    public int find(int []arr){
        int maxcnt = -1;
        for(int i =0; i<256; i++){
            maxcnt = Math.max(maxcnt,arr[i]);
        }
        return maxcnt;
    }
    public int characterReplacement(String s, int k) {
    int n = s.length();
    int low = 0;
    int res = Integer.MIN_VALUE;
    int []f = new int[256];
    for(int high =0; high<n;high++){
        f[s.charAt(high)]++;

        int maxcnt=find(f);
        int length = high-low+1;
        int diff = length-maxcnt;

      while (diff > k) {
         f[s.charAt(low)]--; 
         low++; maxcnt = find(f); 
         length = high - low + 1; 
         diff = length - maxcnt; 
     }
         length = high - low + 1; 
         res = Math.max(res, length); 
         } 
      return res;
    }
        
    }
