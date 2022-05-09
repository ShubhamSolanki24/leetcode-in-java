class Solution {
    public String reverseOnlyLetters(String S) {
       Stack<Character> letter = new Stack();
        for(int i =0;i<S.length();i++){
            if(Character.isLetter(S.charAt(i))){
                letter.push(S.charAt(i));
            }
        }
        StringBuilder sb= new StringBuilder();
        for(int i =0;i<S.length();i++){
            if(Character.isLetter(S.charAt(i))){
                sb.append(letter.pop());
            }else{
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
        
    }
}