class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder(); 
        int x = num;
        if(num == 0){
            return "0";
        }
        if(num <0){
            num = num *(-1);
        }
        while(num > 0){
            int mod = num%7;
            sb.append(String.valueOf(mod));
            num /= 7;  
        }
        if(x <0){
        sb.append("-");
        }
        return sb.reverse().toString();        
    }
}