class Solution {
    public String getSmallestString(String s) {
        int low = 0;
        int high = s.length()-1;
        char []arr = s.toCharArray();

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1] &&  (arr[i] - '0') % 2 == (arr[i+1] - '0') % 2){
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char i: arr){
            sb.append(i);
        }        
        return sb.toString();
    }
}