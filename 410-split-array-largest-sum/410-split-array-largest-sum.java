class Solution {
    public int splitArray(int[] nums, int m) {
     int maxNo = 0;
        long total = 0;
       
        for(int el : nums){
           maxNo = Math.max(el ,maxNo);
           total+= el;
        }
        
        long low = maxNo ;
        long high = total;
        
        while(low< high){
            long mid = low + (high -low)/2;
            if(validDiv(mid,nums,m)){
                high = mid;
            }else{
                low = mid +1;
            }
        }
        return (int)low;
    }
    public boolean validDiv(long maxSum ,int[] nums,int m){
        int totalSubsetCount =1;
        long totalSum =0;
        for(int num: nums){
            totalSum += num;
            
            if(totalSum >maxSum){
                totalSum =0;
                totalSum +=num;
                
                totalSubsetCount++;
                
                if(totalSubsetCount >m){
                    return false;
                }
                
            }  
        }
    return true;
    }
}