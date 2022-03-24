class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
     boolean[] seen = new boolean[rooms.size()];
     seen[0] =true;   
        
        Stack<Integer> keys = new Stack<>();
        keys.add(0);
        while(!keys.isEmpty()){
            int curkey = keys.pop();
            for(int newkey :rooms.get(curkey)){
                if(!seen[newkey]){
                    seen[newkey] =true;
                    keys.add(newkey);
                }
            }
        }
        
        
        
        
       for(boolean visited:seen){
           if(!visited) return false;
       } 
        return true;
        
        
    }
}