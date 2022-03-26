class Solution {
    public int maxArea(int[] height) {
      int i = 0;
        int j =height.length -1;
        int maxarea =0;
    while(i<j){
      if(height[i] <height[j]){
          maxarea =Math.max(maxarea, height[i] * (j-i));
          i+=1;
      }else{
          maxarea =Math.max(maxarea, height[j] * (j-i));
          j--;
      }
    }
        return maxarea;   
    }
}