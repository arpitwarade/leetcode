class Solution {
      public int find(int []arr){
        int maxcnt = -1;
        for(int i =0; i<26; i++){
            maxcnt = Math.max(maxcnt,arr[i]);
        }
        return maxcnt;
    }
    public int characterReplacement(String s, int k) {
        int []freq = new int[26];
        int low = 0;
        int res = -1;
        for(int i = 0; i< s.length(); i++){
            freq[s.charAt(i) - 'A']++;
            
            int maxcnt = find(freq);

            int length = i-low+1;

            int diff = length-maxcnt;

            while(diff > k){
                freq[s.charAt(low)-'A']--;
                low++;
                maxcnt = find(freq);

                length = i-low+1;
                diff = length - maxcnt;
            }
            //  length = i-low+1;
            res = Math.max(res, length);

        }
        return res;
    }
}