class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->(b-a));//max heap
        
        for(int stone: stones){
            pq.offer(stone);
        }
        
        while(pq.size() >1){
            int largest = pq.poll();
            int secondLargest =pq.poll();
            if(largest == secondLargest){
                continue;
            }else{
                int diff = largest-secondLargest;
                pq.offer(diff);
            }
        }
        
        return pq.size() ==0 ? 0 : pq.poll();
    }
}