class Solution {
    public int missingNumber(int[] nums) {
      int sum =0;
        int i=0;
        int l = nums.length;
        for(int n : nums){
            sum+= n;
        }
        int total = l*(l+1)/2;
        return total -sum ;
    }
}