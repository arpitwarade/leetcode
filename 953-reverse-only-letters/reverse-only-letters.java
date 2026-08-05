class Solution {
    public String reverseOnlyLetters(String s) {
        char [] c = s.toCharArray();
        int start = 0;
        int last = s.length()-1;
        while(start < last){
            if(!Character.isLetter(c[start])){
                start++;
            }
            else if(!Character.isLetter(c[last])){
                last--;
            }
            else{
                char ch = c[start];
                c[start] = c[last];
                c[last] = ch;
                last--;
                start++;
            }
        }
     return new String(c);   
    }
}