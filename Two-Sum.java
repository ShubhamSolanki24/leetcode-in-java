class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force
        //for i =0 to n
        //for j =i+1 to n
        //if(target == nums[i] +nums[j])
         // return i ,j;         
        
        // O(n) solution 
        
        HashMap<Integer,Integer> hm = new HashMap();
    // put array items in hashmap
        for(int i =0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
     // Searching 
        for(int i =0;i<nums.length;i++){
            int num  = nums[i];
            int rem = target - num;
            if(hm.containsKey(rem)){
                int idx = hm.get(rem);
                if(idx ==i) continue; 
                return new int[]{i,idx};
            }
                
        }
        
        return new int[]{};
       
    }
}
