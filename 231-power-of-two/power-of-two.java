class Solution {
    public boolean isPowerOfTwo(int n) {
        int count =1;
        int max = n/2;
        if( n<=0){
            return false;
        }
        if(n ==1){
            return true;
        }
        for(int i=0; i<max; i++){
                count *=2;
            if(n == count){
                return true;
            }
            else if(count>n){
                return false;
            }

        }
        return false;
        
    }
}