class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int Csum = nums[0] +nums[1]+nums[nums.length -1];
        for(int i =0;i<nums.length -1;i++){
            int start =i+1;
            int end = nums.length -1;
            while(start <end){
                int currsum = nums[i] +nums[start]+nums[end];
                if(currsum >target){
                    end--;
                }else{
                    start++;
                }
                if(Math.abs(currsum -target) <  Math.abs(Csum -target)){
                    Csum = currsum;
                }
            }
        }
    return Csum;
    }
}