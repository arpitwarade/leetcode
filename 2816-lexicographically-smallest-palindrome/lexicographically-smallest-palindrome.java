class Solution {
    public String makeSmallestPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;
        char [] arr = s.toCharArray();
        while(low <= high){
            char ch = arr[low];
            char ch1 = arr[high];
            if((ch != ch1) && ch > ch1){
                arr[low] = ch1;
            }
            else if(ch != ch1 && ch < ch1){
                arr[high] = ch;
            }
            low++;
            high--;
        }
         StringBuilder sb = new StringBuilder();
         for(char ch : arr){
            sb.append(ch);
         }
         return sb.toString();
    }
}