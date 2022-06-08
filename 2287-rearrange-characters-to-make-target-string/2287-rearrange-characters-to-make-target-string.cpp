class Solution {
public:
    int rearrangeCharacters(string s, string target) {
       int count1[26];
        memset(count1,0,sizeof(count1));
        for(int i =0;i<s.size();++i){
              ++count1[s[i]-'a'];
        }
        int count2[26];
        memset(count2,0,sizeof(count2));
        for(int i =0;i<target.size();++i){
              ++count2[target[i]-'a'];
        }
         int mina = INT_MAX;
        for(int i=0; i < 26; i++) {
          if(!count2[i]) continue; 
          int c = count1[i]/count2[i]; 
            if(c < mina) 
            mina = c; 
        }
        
        return mina;
        
        
    }
};