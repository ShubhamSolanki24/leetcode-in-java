class Solution {
public:
    int findUnsortedSubarray(vector<int>& nums) {
      int end =-1;
      int ele = nums[0];
      for(int i =1;i<nums.size();i++){
          if(ele>nums[i]){
              end = i;
          }else{
              ele = nums[i];
          }
      }
        int st = 0;
        ele = nums[nums.size() -1];
        for(int i =nums.size() -2;i>=0;i--){
           if(nums[i] >ele){
               st = i;
           }else{
               ele = nums[i]; 
           }
    
        }
    return end - st  +1;
    }
};