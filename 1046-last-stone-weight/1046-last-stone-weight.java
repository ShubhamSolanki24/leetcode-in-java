class Solution {
    public int lastStoneWeight(int[] stones) {
      List<Integer> list = new ArrayList<>();
        
        for(int i : stones){
            list.add(i);
        }
        
        while(list.size() != 1){
            Collections.sort(list);
            int x = list.get(list.size()-1)-list.get(list.size()-2);
            list.remove(list.size()-1);
            list.remove(list.size()-1);
            list.add(x);
        }
        return list.get(0);
    }
}