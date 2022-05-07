class Solution {
    public boolean find132pattern(int[] nums) {
        int secondmax = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack();
        
        for(int i =nums.length -1;i>=0;i--){
            if(nums[i] <secondmax)return true;
            
            while(!st.isEmpty() && nums[i] >st.peek()){
                secondmax = Math.max(secondmax,st.pop());
            }
            st.push(nums[i]);
        }
        return false;
    }
}