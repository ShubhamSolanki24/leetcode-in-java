class Solution {
    public String getSmallestString(int n, int k) {
     
        char[] res = new char[n];
        Arrays.fill(res,'a');
        
        k = k-n;
        while(k>0){
            res[n-1] += Math.min(25,k);
            n--;
            k = k - Math.min(25,k);
        }
        return String.valueOf(res);
    }
}