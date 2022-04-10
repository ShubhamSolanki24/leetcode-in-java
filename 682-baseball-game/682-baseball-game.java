class Solution {
    public int calPoints(String[] ops) {
      /* ArrayList<Integer> scores = new ArrayList<>();
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
        return res; */ 
        
        Stack<Integer> stack = new Stack();

        for(String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for(int score : stack) ans += score;
        return ans;
    }
}