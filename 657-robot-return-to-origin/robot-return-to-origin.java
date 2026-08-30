class Solution {
    public boolean judgeCircle(String moves) {
        int n = 0;
        int m = 0;

        for(int i = 0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                n++;
            }
            else if(moves.charAt(i) == 'D'){
                n--;
            }
            else if(moves.charAt(i) == 'L'){
                m--;
            }
            else{ 
                m++;
            }
        }
        if(n == 0 && m == 0){
            return true;
        }
        else{
            return false;
        }
        
    }
}