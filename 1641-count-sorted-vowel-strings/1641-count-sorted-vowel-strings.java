class Solution {
 /* Approach 1 
 char[] ch = new char[]{'a','e','i','o','u'} ;
    public int countVowelStrings(int n) {
      int ans =0;
        for(char c:ch){
            ans+=count(n-1,c);
        }
        return ans;
    }
    
    int count(int length,char last_char){
        if(length==0){
            return 1;
        }
        int temp =0;
        for(char c:ch){
            if(last_char>=c){
                temp+= count(length-1,c);
            }
        }
        return temp;
    }
   */ 
    
   // Approach 2
     public int countVowelStrings(int n){
         int [][]dp = new int[n+1][6];
         
         for(int i =1;i<=n;i++){
             for(int j =1;j<=5;j++){
                dp[i][j]  = (i>1 ?dp[i-1][j]:1) +dp[i][j-1];
             }
         }
        return  dp[n][5];
     }
}