class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] ans = new double[query_row+1][query_glass+2];
        ans[0][0]=poured;
       for(int i =0;i<query_row;i++){
           for(int j =0;j<=query_glass;j++){
               double q = Math.max(ans[i][j] -1.0,0)/2.0;
               ans[i+1][j] +=q;
               ans[i+1][j+1] +=q;
           }
       } 
        return Math.min(ans[query_row][query_glass],1.0);
        
    }
}