class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
       
        
        int []opt = new int[n];
        opt[0] =1;
       
        
        for(int i =1;i<n;i++){
            opt[i] = nums[i-1] * opt[i-1];
        }
        
        int r =1;
         for(int i =n-1;i>=0;i--){
            opt[i] = opt[i] * r;
             r = r* nums[i];
        }
        
        return opt;
        
    }
}