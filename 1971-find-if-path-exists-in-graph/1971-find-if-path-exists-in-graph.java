class Solution {
           public boolean validPath(int n, int[][] edges, int start, int end) {
	   /************ Building graph Start ***************/
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }        
        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);  //edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi
            graph[edge[1]].add(edge[0]);
        }
		/************ Building graph End ***************/
        boolean[] visited = new boolean[n];  // to track is a node is already visited
        return hasPath(graph, start, end, visited);
            
     }
    
     public boolean hasPath(ArrayList<Integer>[] graph, int src, int dest, boolean[] visited){
       if(src==dest) return true;
       visited[src]= true;
       for(int nbr: graph[src]){ 
          if(visited[nbr]==false){
             boolean hasPath= hasPath(graph, nbr, dest, visited);
             if(hasPath==true) return true;
          }
       }
       return false;
    }
}