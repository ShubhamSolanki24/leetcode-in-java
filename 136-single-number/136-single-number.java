class Solution {
    public int singleNumber(int[] nums) {
     HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
          if(hs.contains(i)){
              hs.remove(i);
          }else{
              hs.add(i);
          }
      }  
       for(int i:hs) return i;
        
       return -1; 
    }
}