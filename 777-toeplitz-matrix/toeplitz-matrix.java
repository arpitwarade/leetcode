class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // int rows = matrix.length;
        // int cols = matrix[0].length;
        // for(int i=1; i<rows; i++){
        //     for(int j=1; j<cols; j++){
        //         if(matrix[i][j] != matrix[i-1][j-1]){
        //             return false;
        //         }
        //     }
        // }  
        // return true;

        int i = 0;
        while(i < matrix.length-1){
            for(int j = 0; j<matrix[0].length-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
            i++;
        }     
        return true;
    }
}