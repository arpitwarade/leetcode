class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // ArrayList<Integer> list = new ArrayList<>();
        // if (matrix.length == 0) {
        //     return list;
        // }
        // int strow = 0;
        // int endrow = matrix.length - 1;
        // int stcol = 0;
        // int endcol = matrix[0].length - 1;
        // while (strow <= endrow && stcol <= endcol) {
        //     for (int j = stcol; j <= endcol; j++) {
        //         list.add(matrix[strow][j]);
        //     }
        //     strow++;
        //     for (int i = strow; i <= endrow; i++) {
        //         list.add(matrix[i][endcol]);
        //     }
        //     endcol--;
        //     if (strow <= endrow) {
        //         for (int j = endcol; j >= stcol; j--) {
        //             list.add(matrix[endrow][j]);
        //         }
        //         endrow--;
        //     }
        //     if (stcol <= endcol) {
        //         for (int i = endrow; i >= strow; i--) {
        //             list.add(matrix[i][stcol]);
        //         }
        //         stcol++;
        //     }
        // }
        // return list;

        ArrayList<Integer> list = new ArrayList<>();

        int firstcol =0;
        int lastcol = matrix[0].length-1;
        int firstrow = 0;
        int lastrow = matrix.length-1;

        while(firstrow <= lastrow && firstcol <= lastcol){
            for(int i=firstcol; i<= lastcol; i++ ){
                list.add(matrix[firstrow][i]);
            }
            firstrow++;
            for(int i = firstrow; i<= lastrow; i++){
                list.add(matrix[i][lastcol]);
            }
            lastcol--;

            if(firstrow<= lastrow){
                for(int i = lastcol; i >= firstcol; i--){
                    list.add(matrix[lastrow][i]);
                }
                lastrow--;
            }
            if(firstcol<=lastcol){
                for(int i = lastrow; i>=firstrow; i--){
                    list.add(matrix[i][firstcol]);
                }
                firstcol++;
            }
        } 
        return list;
    }
}