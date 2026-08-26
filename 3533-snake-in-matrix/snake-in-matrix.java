class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int [][]grid = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j  = 0; j<n; j++){
                grid[i][j] = (i*n)+j;
            }
        }
        int i =0;
        int j = 0;
        for(String ch : commands){
            if(ch.equals("RIGHT")){
                j++;
            }
            else if(ch.equals("LEFT")){
                j--;
            }
            else if(ch.equals("DOWN")){
                i++;
            }
            else{
                i--;
            }
        }    
        return grid[i][j];   
    }
}