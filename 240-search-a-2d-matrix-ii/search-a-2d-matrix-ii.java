class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;
        int m = matrix[0].length; 

        while(row >= 0 && col <m){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
}