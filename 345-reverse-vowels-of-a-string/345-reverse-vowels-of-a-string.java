class Solution {
 
    public String reverseVowels(String s) {
       int l = 0;
        int r = s.length()-1;
        char[] chars = s.toCharArray();
        while(l < r){
            
            if(!isVowels(chars[l])){
              l++; continue;  
            } 
            if(!isVowels(chars[r])){
              r--; continue;  
            }
            char tmp = chars[l];
            chars[l] = chars[r];
            chars[r] = tmp;
            l++;
            r--;
        }
        
        return new String(chars);
    }
    
    private boolean isVowels(char c){
        
        if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c =='u'
          || c == 'A' || c == 'E' || c == 'I' || c =='O' || c =='U')return true;
        return false;
        
    }
}