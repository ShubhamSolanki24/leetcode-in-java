class Solution {
    public int reverse(int x) {
     
        int res =0;
        int prev = 0;
        
        while(x!=0){
            int lastDigit = x%10;
            x/=10;
            
            res = res*10 +lastDigit;
            
            if((res-lastDigit)/10 != prev) return 0;
            prev = res;
        }
        
        return res;
        
    }
}