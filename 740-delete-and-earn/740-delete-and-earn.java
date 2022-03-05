class Solution {
    public int deleteAndEarn(int[] nums) {
        int inc = 0;
        int exc = 0;
        
        int dp[] = new int[10001];
        for(int i: nums)
          dp[i]++;
        for(int j = 0;j<=10000;j++){
            int ni = exc+dp[j]*j;
            int ne = Math.max(inc,exc);
            inc = ni;
            exc = ne;
        }
        return Math.max(inc,exc);
    }
}