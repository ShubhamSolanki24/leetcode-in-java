class Solution {
    public boolean isPalindrome(int x) {
      
        String s = String.valueOf(x);
        String ss[] = s.split(""); 
        
        for(int i =0, j = ss.length-1; i<ss.length ;i++,j--){
            if(!ss[i].equals(ss[j]))
            {
                return false;
            }
        }
        
        return true;
    
    }
}