class Solution {
    public int findPeakElement(int[] arr) {
     /* if(nums.length==1 || nums[0]>nums[1]) return 0;
        else if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
       
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i] && nums[i+1]<nums[i]) return i;
        }
        return -1; */ 
        
            int start=0;
        int end=arr.length-1;
        while(start<end)
          {
          int mid=start+(end-start)/2;

    if(arr[mid]>arr[mid+1])
    {
        end=mid;
    }else 
    {
        start=mid+1;
    }
}
return start;
        
    }
}