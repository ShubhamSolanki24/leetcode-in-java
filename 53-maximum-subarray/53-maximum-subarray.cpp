class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int curr=nums[0],global=nums[0],n=nums.size();
    
    for(int i=1;i<n;i++){
        
        curr = max(curr+nums[i],nums[i]);               //curr = maximum of sum till current user and current number
        global = max(global,curr);                      // global = max of global and current sum
        
    }
        return global;
    }

};