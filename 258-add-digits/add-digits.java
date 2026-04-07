class Solution {
    public int addDigits(int num) {
        int counter =0;
        int last = 0;
        int newNum = num; 
        while(newNum != 0){    
            last = newNum%10;
            counter += last;
            newNum /=10;
        }  
        if (counter >=10){
            int calcul= calculation(counter);
            counter = calcul;
            if(calcul>=10){
                return calculation(counter);
            }
           return calculation(counter); 
         }
        return counter;  
    }
   int calculation(int newNum){
         int counter =0;
        int last = 0;
        while(newNum != 0){    
            last = newNum%10;
            counter += last;
            newNum /=10;
        }
        return counter;   
    }
}