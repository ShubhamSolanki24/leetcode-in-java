/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int left= 0;
        int right =n;
      while(left <right){
          int m= left +(right-left)/2;
          if(isBadVersion(m)){
              right = m;
          }else{
              left =m+1;
          }
          
      }  
        if(left ==right && isBadVersion(left))
        {       return left;
    }
        return -1;
    }
}