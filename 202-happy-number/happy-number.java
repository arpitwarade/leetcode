class Solution {
    public int total(int n){
        int sum =0;
        while(n>0){
            int x = n%10;
             n = n/10;
            sum += x*x;
        }
        return sum;
    }
    public boolean isHappy(int n) {
    //     Set<Integer> visit = new HashSet<>();
        
    //     while (!visit.contains(n)) {
    //         visit.add(n);
    //         n = getNextNumber(n);
    //         if (n == 1) {
    //             return true;
    //         }
    //     }
        
    //     return false;   
    // }
    //  private int getNextNumber(int n) {
    //     int output = 0;
        
    //     while (n > 0) {
    //         int digit = n % 10;
    //         output += digit * digit;
    //         n = n / 10;
    //     }
        
    //     return output;
    // 
       int slow = n;
       int fast = n;
       while(fast != 1){
        slow = total(slow);
        fast = total(fast);
        fast = total(fast);

        if(slow == fast && slow != 1){
            return false;
        }
       }
       return true;

    }
}