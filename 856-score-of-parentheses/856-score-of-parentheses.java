class Solution {
  int i =0;
    public int scoreOfParentheses(String s) {
   
    int ans =0;
     while(i<s.length()){
         char first = s.charAt(i);
         i++;
        if(first =='('){
           
            if(s.charAt(i) ==')'){
                ans = ans+1;
                i++;
            }else{
                ans = ans+ 2*(scoreOfParentheses(s));
            }
        }
         else{
             return ans;
         }
     }   
        return ans;
    
    }  
}