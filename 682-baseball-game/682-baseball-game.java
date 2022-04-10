class Solution {
    public int calPoints(String[] ops) {
      ArrayList<Integer> scores = new ArrayList<>();
          for(String el: ops) {
            final int lastIndex = scores.size() - 1;
            int result;
            
            switch(el) {
                case "+":
                    result = scores.get(scores.size() - 1) + scores.get(scores.size() - 2);
                    scores.add(result);
                    break;
                case "D":
                    result = scores.get(lastIndex) * 2;
                    scores.add(result);
                    break;
                case "C":
                    scores.remove(lastIndex);
                    break;
                default:
                    scores.add(Integer.parseInt(el));
                    break;
            }
        }
        
        int res = 0;
        for(int el: scores) { res += el; }
        return res;  
    }
}