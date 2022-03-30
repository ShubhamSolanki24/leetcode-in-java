class Solution {
    public int minDeletion(int[] nums) {
     int d=0;
        int n = nums.length;
        
        for(int i =0;i<nums.length -1;i++){
          int newIndex = i-d;
            if((newIndex % 2 ==0) && nums[i] == nums[i+1]){
                d++;
            }
      }
        return ((n-d) %2 ==0) ? d: d+1;
     
    }
}