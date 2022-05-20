// { Driver Code Starts
#include <bits/stdc++.h>

using namespace std;


 // } Driver Code Ends
//User function template for C++
class Solution{
public:
	int search(string pat, string txt) {
	    // code here
	     int count=0;
       if(txt.size()<pat.size())
       return count;
       
       vector<int> h1(26,0);
       
       for(auto i:pat)
           h1[i-'a']++;
           
       vector<int> h2(26,0);
       
       int n=pat.size();
       for(int i=0;i<n;i++)
           h2[txt[i]-'a']++;
       if(h1==h2) count++;
       int m=txt.size();
       int i=0,j=n;
      
       while(j<m){
           h2[txt[i]-'a']--;
           h2[txt[j]-'a']++;
           i++;
           j++;
           if(h1==h2) count++;
       }
       return count;
	    
	}

};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string pat, txt;
        cin >> txt >> pat;
        Solution ob;
        auto ans = ob.search(pat, txt);
        cout << ans << "\n";
    }
    return 0;
}  // } Driver Code Ends