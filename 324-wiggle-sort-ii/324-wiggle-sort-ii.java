class Solution {
    public void wiggleSort(int[] nums) {
        int [] res= new int [nums.length];
    
    //Sort
    Arrays.sort(nums);       // 1  1  1  4  5  6
    
    
    //Add elements at odd idx. and then at even
    
    int i = nums.length - 1;          // 5
    
    int idx = 1;
    while(idx < nums.length){        
        
        res[idx] = nums[i];        // res[1] = 6
        
        --i;
        idx += 2;
    }
    
    idx = 0;
    while(idx < nums.length){
        
        res[idx] = nums[i];
        
        --i;
        idx += 2;
    }
    
    
    for(int k=0; k<res.length; ++k){
        nums[k] = res[k];
    } 
     }
}