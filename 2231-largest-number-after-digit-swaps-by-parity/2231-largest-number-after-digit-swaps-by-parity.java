class Solution {
    public int largestInteger(int num) {
      PriorityQueue<Integer> epq = new PriorityQueue<>((a,b) -> (b-a));
      PriorityQueue<Integer> opq = new PriorityQueue<>((a,b) -> (b-a));
        
       String str = num+"";
        for(char c: str.toCharArray()){
            int el = c-'0';
            if(el%2 ==0){
                epq.offer(el);
            }else{
                opq.offer(el);
            }
        }
      String ans = "";
        for(char c: str.toCharArray()){
            int el =c-'0';
            if(el%2 ==0){
                ans+= (epq.poll()+"");
            }else{
                ans+= (opq.poll()+"");
            }
            
        }
        return Integer.parseInt(ans);
        
    }
}