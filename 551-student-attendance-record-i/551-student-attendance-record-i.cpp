class Solution {
public:
    bool checkRecord(string s) {
        int N = s.length();
            int countA =0;
        for(int i =0;i<N;i++){
            if(s[i]=='A' ){
              countA++; 
            }else if(s[i]=='L' && s[i+1]=='L' && s[i+2]=='L'){
                return false;
            }
            else{
            }
        }
        if(countA>=2){
            return false;
        }
        
    return true;}
};