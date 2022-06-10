class Solution {
public:
    int maxSubArray(vector<int>& nums) {
      int max=nums[0];
      int cursum=nums[0];
      for(int i=1;i<nums.size();i++){
      if(cursum >=0){
      cursum = cursum + nums[i];
       }
       else{
       cursum=nums[i];
        }
       if(cursum > max){
        max=cursum;
        }
            }
         return max;
    }
};