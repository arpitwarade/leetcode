class Solution {
    public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int low =0;
//         int res = 0;
//         Map<Character, Integer> map = new HashMap<>();

//         for(int high =0; high<n; high++){
//             char ch = s.charAt(high);
//             map.put(ch,map.getOrDefault(ch,0)+1);
//             int k = high-low+1;

//             while(map.size()< k){
//                 char leftchar = s.charAt(low);
//                 map.put(leftchar, map.get(leftchar) - 1);
//                 if (map.get(leftchar) == 0)
//                     map.remove(leftchar);
//                 low++;
//                 k = high-low+1;
//                     }
//                    res =Math.max(res,k); 
//           }
// return res;
        // Set<Character>set=new HashSet<>();
        // int maxLength=0;
        // int left=0;
        // for(int right=0;right<s.length();right++){
           
        //     if(!set.contains(s.charAt(right))){
        //         set.add(s.charAt(right));
        //         maxLength=Math.max(maxLength,right-left+1);
                
        //     }else{
        //         while(s.charAt(left)!=s.charAt(right)){
        //             set.remove(s.charAt(left));
        //             left++;
        //         }
        //         set.remove(s.charAt(left));left++;
        //         set.add(s.charAt(right));
        //     }
            
        // }
        // return maxLength;
        int low = 0;
        int res = 0;
        Map<Character,Integer> mp = new HashMap<>();
        for(int high = 0; high <s.length(); high++){
            char ch = s.charAt(high);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            int k = high - low +1;

            while(mp.size() <k){
                char c = s.charAt(low);
                mp.put(c,mp.getOrDefault(c, 0)-1);
                low++;
                if(mp.get(c) == 0){
                    mp.remove(c);
                }
                k = high-low+1;
            }
            res = Math.max(res,k); 
        }
        return res;


        
    }
}