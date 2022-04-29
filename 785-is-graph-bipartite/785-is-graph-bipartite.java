//0-> not colored
//1 -> blue
//-1 -> red
class Solution {
   /* public boolean isBipartite(int[][] graph) {
        int [] color = new int[graph.length];
        for(int i =0;i<graph.length;i++){
            if(color[i] ==0 && !validColor(graph,color,1,i))
                return false;
        }
        return true;
    }
    //dfs 
    public boolean validColor(int[][] g,int[] color,int c,int node){
        if(color[node]!=0)https://leetcode.com/problems/is-graph-bipartite/
            return color[node]==c;
        color[node] =c;
        for(int n : g[node]){
            if(!validColor(g,color,-c,n))return false;
        }
        return true;
    }   */
    
   // BFS
  /*  public boolean isBipartite(int[][] graph) {
         int [] color = new int[graph.length];
        for(int i =0;i<graph.length;i++){
            if(color[i] ==0){
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            color[i] =1;
            while(!q.isEmpty()){
                Integer node = q.poll();
                for(int n : graph[node]){
                    if(color[n] ==color[node])return false;
                    else if(color[n] ==0){
                        q.add(n);
                        color[n] = -color[node];
                    }
                }
            }
          }
        }
        return true;  
    }  */
    public boolean isBipartite(int[][] graph){
        int[] color = new int[graph.length];
         
        for(int i =0;i<graph.length;i++){
           if(color[i] == 1|| color[i] ==-1)continue;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            color[i] =1;
        
            while(!q.isEmpty()){
                int cur = q.poll();
                for(int next:graph[cur]){
                    if(color[next] ==0){
                       color[next] = -color[cur];
                        q.add(next);
                    }
                    if(color[next] ==color[cur])return false;
                }
            }
        }
        return true;
    } 
}