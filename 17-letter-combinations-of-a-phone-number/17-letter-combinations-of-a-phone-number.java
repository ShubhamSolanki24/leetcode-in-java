class Solution {
    public List<String> letterCombinations(String digits) {
    /*       String[] set = new String[10];
        set[2] = "abc";
        set[3] = "def";
        set[4] = "ghi";
        set[5] = "jkl";
        set[6] = "mno";
        set[7] = "pqrs";
        set[8] = "tuv";
        set[9] = "wxyz";

        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length()==0){
            return ans;
        }

        helper(ans, digits, set, 0, "");

        return ans;
    }

    private void helper(List<String> ans, String digits, String[] set, int index, String currString){
        if(index == digits.length()){
            ans.add(currString);
            return ;
        }

        String possibleChars = set[digits.charAt(index) - '0'];
        for(char c: possibleChars.toCharArray()){
            helper(ans, digits, set, index+1, currString + c);
        }
 */
              List<String> ans = new ArrayList<>();
        if(digits.length() == 0)
            return ans;
        
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        
        backtrack(digits, 0, hm, new StringBuilder(), ans);
        return ans;
    }
    
    private static void backtrack(String digits, int i, HashMap<Character, String> hm, StringBuilder sb, List<String> ans){
        if(i == digits.length()){
            ans.add(sb.toString());
            return;
        }
        String curr =  hm.get(digits.charAt(i));
        for(int k =0; k <curr.length(); k++){
            sb.append(curr.charAt(k));
            backtrack(digits, i+1, hm,  sb, ans);
            sb.deleteCharAt(sb.length() -1);
        }
    }}