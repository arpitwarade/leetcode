class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int size= numbers.length;
        // int[] arr= new int[2];

        // for(int i =0; i<size-1; i++){
        //     for(int j =i+1; j<size;j++){
        //          if((numbers[i]+numbers[j])==target){
        //         arr[0]=i+1;
        //         arr[1]=j+1;
        //         return arr;
        //     }
           
        //     }
         
        // }
        // return arr;
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
            return new int[]{i + 1, j + 1};
            }
            else if(sum > target){
                j--;
            }
            else if(sum <target ){
                i++;
            }
        }
         return new int[]{-1, -1};

    }
}