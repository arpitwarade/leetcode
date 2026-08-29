class Solution {
    public boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;
        int count = 0;
        while(low <= high){
            if(s.charAt(low) != s.charAt(high)){
                return(valid(low+1,high,s) || valid(low,high-1,s));
            }
            low++;
            high--;
        }
        return true;
    }
    private static boolean valid(int low, int high, String s){
        while(low <= high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}