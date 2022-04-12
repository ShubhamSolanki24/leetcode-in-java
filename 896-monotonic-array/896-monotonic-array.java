class Solution {
    public boolean isMonotonic(int[] nums) {
        // assume increasing
        int i = 0;
        while(i < nums.length - 1) {
            if(nums[i + 1] < nums[i]) break;
            i++;
        }
        if (i == nums.length - 1) return true;
        // assume decreasing 
        i = 0;
        while(i < nums.length - 1) {
            if(nums[i + 1] > nums[i]) break;
            i++;
        }
        if (i == nums.length - 1) return true;
        return false;
    }
}