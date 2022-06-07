class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxVal = nums[0], curSum = 0;
        int const n = nums.size();
        
        for (int i = 0; i < n; i++) {
            curSum += nums[i];
            if(curSum > maxVal) 
                maxVal = curSum;
            if(curSum < 0) curSum = 0;
        }
        
        return maxVal;
    }
};