class Solution {
    public int minCostConnectPoints(int[][] points) {
    
     PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b) -> (a[2]- b[2])) ;  
      int cost =0;   
       
      pq.offer(new int[]{0,0,0});
        Set<Integer> visited = new HashSet<Integer>();
        int num = points.length;
        while(!pq.isEmpty() && visited.size() <num){
            int[] curr = pq.poll();
            int endId = curr[1];
            int currCost = curr[2];
            if(visited.contains(curr[1]))continue;
            
            cost+= currCost;
            visited.add(curr[1]);
            for(int i =0;i<num;i++){
                if(!visited.contains(i)){
                    pq.offer(new int[] {endId,i,distance(points,endId,i)});
                }
            }
        }
        return cost;
    }
  private  int distance(int p[][],int i,int j)
{
    return Math.abs(p[i][0]-p[j][0])+Math.abs(p[i][1]-p[j][1]);
}
}