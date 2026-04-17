class Solution {
    public int integerBreak(int n) {
        // int max = n/2;
        ArrayList<Integer> newlist = new ArrayList<>();
        int count =Integer.MIN_VALUE;
        if(n == 2){
            return 1;
        }
        for(int i = 2; i<n; i++){
            int var = n/i;
            int modulo = n%i;
            if(modulo != 0){
                for(int j =1; j<=i; j++){
                    if(j<=modulo){
                        newlist.add(var+1);
                    }
                    else{
                        newlist.add(var);
                    }
                }
            }
            else{
                for(int j =1; j<=i; j++){
                        newlist.add(var+modulo);
                }
            }
            int product =1;
            for(int num: newlist)
            {
                product *= num;
            }
            newlist.clear();
            if(product >count){
                count = product;
            }

        }
        return count;
    }
}