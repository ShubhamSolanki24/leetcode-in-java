class Solution {
public:
    int8_t dp[10001] = {[0 ... 10000] = -1};
    bool canPartition(vector<int>& nums) {
         int n = nums.size();
        int sum =0;
      for(int i=0;i<n;i++){
          sum += nums[i];
      } 
      if(sum%2 != 0){
          return false;
      }else {
          return subsetSum(nums,sum/2);
      }
    }
    
    bool subsetSum(vector<int>& nums, int sum, int i =0){
    
        if(sum == 0) return true;
        if(i >= size(nums) || sum < 0) return false; 
        if(dp[sum] != -1) return dp[sum];
        return dp[sum] = subsetSum(nums, sum - nums[i], i + 1) || subsetSum(nums, sum, i + 1);
    }
};