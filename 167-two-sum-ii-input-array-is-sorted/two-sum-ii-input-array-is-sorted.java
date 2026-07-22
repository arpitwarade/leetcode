class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstIdx =0;
        int lastIdx =numbers.length-1;
        int [] arr = new int[2];
        while (firstIdx <lastIdx){
            if((numbers[firstIdx]+numbers[lastIdx]) == target){
                arr[0]= firstIdx+1;
                arr[1] =lastIdx+1;
                return arr;
            }
            else if((numbers[firstIdx]+numbers[lastIdx])>target){
                lastIdx--;
            }
            else{
                firstIdx++;
            }
        }
       return arr;
        }
}