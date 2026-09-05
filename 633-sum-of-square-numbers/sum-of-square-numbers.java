class Solution {
    public boolean judgeSquareSum(int c) {
        int n  = (int) Math.sqrt(c);
        int low = 0;
        while(low <= n){
            long m =1L* low*low+n*n;
            if(c == m){
                return true;
            }
            else if(c > m){
                low++;
            }
            else{
                n--;
            }
        }
        return false;
    }
}