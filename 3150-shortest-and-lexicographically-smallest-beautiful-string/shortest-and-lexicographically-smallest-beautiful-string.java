class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int low = 0;
        int res = Integer.MAX_VALUE;
        int onecount =0;
        int start = -1;
        for(int high = 0; high<s.length(); high++){
            if(s.charAt(high) == '1'){
                onecount++;
            }
            
            while(onecount == k){
                int length = high-low +1;
                if(length < res ||  (length == res && s.substring(low, high + 1)
                .compareTo(s.substring(start, start + length)) < 0)) {
                   start = low;
                    res = length;
                }
                if(s.charAt(low) == '1'){
                    onecount--;
                }
                low++;
            }
        }
    
           if (start == -1) {
            return "";
        }
        return s.substring(start, start+ res);
        
    }
}