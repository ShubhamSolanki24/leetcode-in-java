class Solution {
public:
    
  vector<vector<int>> dp;
    int LCS(string& text1, string& text2, int m , int n){
        if(m<0||n<0)return 0;
        if(dp[m][n]>0)return dp[m][n];
        
        if(text1[m]==text2[n])
            return dp[m][n]=1+LCS(text1,text2,m-1,n-1);
        return dp[m][n]=max(LCS(text1,text2,m-1,n),LCS(text1,text2,m,n-1));
    }
    int longestCommonSubsequence(string text1, string text2) {
        int m=text1.length();
        int n=text2.length();
        dp.resize(m,vector<int>(n,0));
        return LCS(text1,text2,m-1,n-1);

          
        
    /* int n1 = text1.size();
    int n2 = text2.size();
    int a[n1+1][n2+1];
    for(int i =0;i<n1+1;i++){
        for(int j =0;j<n2+1;j++){
            if(i==0 || j==0){
                a[i][j] =0;
            }
        }
    }
    for(int i =1;i<n1+1;i++){
        for(int j =1;j<n2+1;j++){
            if(text1[i-1]==text2[j-1]){
                a[i][j] = 1+a[i-1][j-1];
            }else{
                a[i][j] = max(a[i][j-1],a[i-1][j]);
            }
        }
    }
    return a[n1][n2];  
 */   }
};