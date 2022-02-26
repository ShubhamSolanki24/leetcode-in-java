class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int lo =0;
        int hi =nums.length -1;
        int[] ans ={-1,-1};
        
        //to find first index
         while(lo<=hi){
           int mid =(lo+hi)/2;

          if(nums[mid] == target){
              ans[0] = mid;
           //continue searching left side
           hi =mid-1;
          }else if(nums[mid] <target){
              lo =mid+1;
          }else {
              hi = mid -1;
          }
         }
        
        lo =0;
        hi =nums.length -1;
        
        //to find last index
         while(lo<=hi){
           int mid =(lo+hi)/2;
      //continue searching right side
          if(nums[mid] == target){
              ans[1] = mid;
           //continue searching right side
           lo =mid+1;
          }else if(nums[mid] <target){
              lo =mid+1;
          }else {
              hi = mid -1;
          }
         }
        return ans;
    
        
    }
}