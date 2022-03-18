class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch -'a']++;  
        }
        
        LinkedList<Character> res = new LinkedList<Character>();
        boolean[] isAdded = new boolean[26];
     
        for(char ch:s.toCharArray()){
            freq[ch-'a']--;
            
            if(isAdded[ch-'a'] == true )continue;
            
            while(!res.isEmpty() && res.getLast()>ch && freq[res.getLast()-'a']>0){
                isAdded[res.removeLast() -'a'] =false;
            }
            res.add(ch);
            isAdded[ch-'a'] =true;
            
        }
        StringBuilder sb = new StringBuilder();
        while(!res.isEmpty()){
            sb.append(res.removeFirst());
        }
        return sb.toString();
        
    }
}