class Solution {
public:
  /*recursive solution
    int helper(vector<int> &dp,int n){
        if(n<0) return 0;
        if(n==0 || n==1)    return 1;
        if(dp[n]!=-1)   return dp[n];
        return dp[n]=helper(dp,n-1)+helper(dp,n-2);
    }
    int climbStairs(int n) {
        vector<int> dp(n+1,-1);
        return helper(dp,n);
    }
   */
    
    int climbStairs(int n){
     vector<int> dp(n+1);
        dp[0]=dp[1]=1;
        
        for(int i=2;i<=n;i++)   
        if(dp[i]!=-1){
            dp[i]=dp[i-1]+dp[i-2];
        }else{
            dp[i]= dp[i];
        }
        return dp[n];
    }
    
};