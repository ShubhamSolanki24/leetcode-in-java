class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
    int n1 = text1.size();
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
    }
};