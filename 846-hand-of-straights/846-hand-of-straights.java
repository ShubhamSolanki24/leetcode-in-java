class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        if(hand.length % W !=0)return false;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int val:hand){
                pq.add(val);
            } 
        while(!pq.isEmpty()){
            int first = pq.poll();
            for(int i =1;i<W;i++){
                if(pq.remove(first+i))continue;
                else return false;
            }
            
        }
        
        return true;
        
    }
}