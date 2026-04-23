// class Solution {
//     boolean isPresent(int[] nums, int target){
//         for(int n : nums){
//             if(n == target)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public int[] searchRange(int[] nums, int target) {
//         int arr[]= new int[2];
//         int j = 0;
//         int counter = 0;
//         if(isPresent(nums,target)){
//             for(int i = 0; i<nums.length; i++){
//             if(nums[i]==target){
//                 if(counter >=2){
//                     arr[j] = i;
//                 }
//                 else { 
//                     if(counter == 0){
//                         arr[j] =i;
//                         j++;
//                         counter++;
//                     }
//                     else{
//                         arr[j] =i;
//                         counter++;
//                     }
//                 }

//             }   
//         }
//         if(arr[0] > arr[1]){
//             arr[1] = arr[0];
//             return arr; 
//         }
//         return arr; 
//         }
//         else{
//             arr[0] = -1;
//             arr[1] = -1;

//         }
//         return arr;
//     }  
// }

class Solution{
    public int[] searchRange(int[] nums, int target){
        int arr[] = {-1,-1};
        if(nums.length == 1 && nums[0] == target){
            arr[0] = 0;
            arr[1] = 0;
            return arr;
        }
        for(int i =0; i<nums.length; i++){
           if(nums[i] == target){
            if(arr[0] == -1){
                arr[0] = i;
            }
            else{
                arr[1] = i;
           }
        }
    }
    if(arr[1] == -1 && arr[0] >-1){
        arr[1] = arr[0];
        return arr;
    }
    return arr;
}
}