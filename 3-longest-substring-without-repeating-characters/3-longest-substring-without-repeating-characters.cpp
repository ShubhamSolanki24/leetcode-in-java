class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int i=0,j=0,ans=0;
        unordered_set<char>st;
        while(j<s.length() and i<s.length())
        {
           if(st.find(s[j])==st.end())
           {
               st.insert(s[j]);
               ans=max(ans,j-i+1);
               j++;
           }
        else
        {
            st.erase(s[i]);
            i++;
        }
        }
        return ans;
   
    }
};