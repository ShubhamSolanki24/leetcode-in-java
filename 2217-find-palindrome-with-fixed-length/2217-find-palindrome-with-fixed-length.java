class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int n = queries.length;
        long[] ans= new long[n];
        int i=0;
        int halfLength = (intLength+1)/2;
        
        long l = (long)Math.pow(10,halfLength -1);
        long r = (long)Math.pow(10,halfLength)-1;
        
        for(int q : queries){
            long totalCount= (r-l+1);
            if(q<=totalCount){
              String leftHalf = Long.toString(l+q-1); 
              String rightHalf = (new StringBuilder(leftHalf)).reverse().toString();
              ans[i] = Long.parseLong(leftHalf +rightHalf.substring(intLength % 2)); 
            }else{
                ans[i] = -1;
            }
            i++;
            
        }
        return ans;
    }
}