class Solution {
    public int findUnsortedSubarray(int[] nums) {
        //Approach 1
        int[] arr= new int[nums.length];
        for(int i =0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int start =0; int end = nums.length-1;
        for(;start<nums.length;start++){
            if(nums[start] != arr[start])break;
        }
        if(start>=nums.length -1)return 0;
        for(;end>=0;end--){
            if(nums[end] !=arr[end])break;
        }
        return end-start +1;  
    }
}