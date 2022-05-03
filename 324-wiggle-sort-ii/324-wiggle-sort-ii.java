class Solution {
    public void wiggleSort(int[] nums) {
    /*    int [] res= new int [nums.length];
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
    }   */
       int[] counts = new int[5001];
        for (int num: nums) counts[num]++;
        int index = 1;
        int last = counts.length - 1;

        for (int i = 1; i < nums.length; i += 2) {
            while (counts[last] == 0) {
                last--;
            }

            nums[i] = last;
            counts[last]--;
        }

        for (int i = 0; i < nums.length; i += 2) {
            while (counts[last] == 0) {
                last--;
            }

            nums[i] = last;
            counts[last]--;
        }  
        
        
        
        
        
     }
}