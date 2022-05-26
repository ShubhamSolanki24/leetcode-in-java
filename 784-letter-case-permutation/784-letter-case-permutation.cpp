class Solution {
public:
    vector<string> ans;
    void backtrack(string &s,string curr,int index){
        if((int)curr.size()==((int)s.size())){
            ans.push_back(curr);
            return ;
        }
        if(s[index]>='0' && s[index]<='9'){
            backtrack(s,curr+s[index],index+1);
        }else{
            backtrack(s,curr+(char)(toupper(s[index])),index+1);
            backtrack(s,curr+(char)(tolower(s[index])),index+1);
            
        }
    }
    
    
    vector<string> letterCasePermutation(string s) {
      int n = s.size();
        string curr="";
        backtrack(s,curr,0);
        return ans;
    }
};