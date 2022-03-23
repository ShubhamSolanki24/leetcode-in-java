class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // Non optimized o(n+m) TC 
    int len = nums1.length +nums2.length;
        int arr[] = new int[len];
      
        int i =0;int j =0;
        int k=0;
        
        
       while(i<nums1.length && j<nums2.length){
        if(nums1[i] <nums2[j]){
         arr[k]  = nums1[i];
            i++;k++;
        }
        else {
         arr[k]  = nums2[j];
            j++;k++;
        }  
       }
        while(i<nums1.length){
             arr[k]  = nums1[i];
            i++;k++;
        }while(j<nums2.length){
            arr[k]  = nums2[j];
            j++;k++;
        }
        
        double median =0.0;
        int mid = arr.length/2;
        if(arr.length %2==1){
            median = arr[mid];
            
        }else{
            median = (arr[mid] +arr[mid-1])/2.0;
        }
        return median ;
        
    
        // optimzed o(Log(n+m)) TC
        
        
        
        
        
        
        
        
    }
}