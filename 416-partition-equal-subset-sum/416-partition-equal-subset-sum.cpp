class Solution {
public:

bool subset(vector<int>&arr,int sum){
    int n = arr.size();
    bool a[n+1][sum+1];
    for(int i=0;i<sum+1;i++)
        {
            a[0][i]=false;
        }
        for(int i=0;i<n+1;i++)
        {
            a[i][0]=true;
        }
    for(int i =1;i<n+1;i++){
        for(int j =1;j<(sum+1);j++){
            if(arr[i-1]<=j){
                a[i][j] = (a[i-1][j-arr[i-1]] || a[i-1][j]);
            }else{
                a[i][j] = a[i-1][j];
            }
        }
    }
    return a[n][sum];
}
bool canPartition(vector<int>& arr) {
int n = arr.size();
    int sum =0;
    for(int i =0;i<n;i++){
        sum+=arr[i];
    }
    if(sum%2!=0){
        return false;
    }
    return subset(arr,sum/2);
}};