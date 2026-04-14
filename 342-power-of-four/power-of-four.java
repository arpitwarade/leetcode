class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        }
        if(n%2 != 0){
            return false;
        }
        int power =0;
        int max = n/2;
        for(int i = 1 ; i<max; i++){
            power = (int)Math.pow(4,i);
            if(power == n){
                return true;
            }
            else if(power>n){
                return false;
            }

        }
        return false;
    }
}