class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> positiveList = new ArrayList<>();   
        ArrayList<Integer> negativeList = new ArrayList<>();   
        for(int i =0; i<nums.length; i++){
            if(nums[i]>=0){
                positiveList.add(nums[i]);
            }
            else{
                negativeList.add(nums[i]);
            }
        }
        Collections.reverse(negativeList);
        if(positiveList.size() == 0){
            int i = 0;
            for(int num : negativeList){
                nums[i] = num*num;
                i++;
            }
            return nums;
        }
        if(negativeList.size() == 0){
            int i =0;
            for(int num : positiveList){
                nums[i] = num*num;
                i++;
            }
            return nums;
        }
        int k = 0;
        int m = 0;
        int x = positiveList.size();
        int y = negativeList.size();
        int idx = 0;
        int []arr = new int[x+y];
        while(k<x && m<y){
            if(positiveList.get(k) < Math.abs(negativeList.get(m))){
                arr[idx] = positiveList.get(k)*positiveList.get(k);
                idx++;
                k++;
            }
            else{
                arr[idx] = negativeList.get(m)*negativeList.get(m);
                idx++;
                m++;
            }
        }
        while(m<y){
             arr[idx] = negativeList.get(m)*negativeList.get(m);
                idx++;
                m++;
        }
        while(k<x){
              arr[idx] = positiveList.get(k)*positiveList.get(k);
                idx++;
                k++;
        }
        return arr;

    }
}