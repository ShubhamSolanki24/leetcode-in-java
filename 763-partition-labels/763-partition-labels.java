class Solution {
    public List<Integer> partitionLabels(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        //1.filling last occurance of character
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, i); 
        }
        //2.making of result
        List<Integer> res= new ArrayList<>();
        int prev = -1;
        int max = 0;
        
        for(int i =0;i<s.length();i++){
            char ch= s.charAt(i);
            max= Math.max(max, map.get(ch));
            if(max ==i) 
            { res.add(max - prev);
             prev = max;
        }
    }
    return res;
        
    }
}