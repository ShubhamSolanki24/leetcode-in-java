class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i =0;
        int j =0;
        int max = 0;
        HashSet<Character> Hs = new HashSet();
        while(j <s.length()){
            if(!Hs.contains(s.charAt(j))){
                Hs.add(s.charAt(j));
                j++;
                max = Math.max(Hs.size(), max); 
            }else{
                Hs.remove(s.charAt(i));
                i++;
            }
        }
    return max;
    
    
    }
}